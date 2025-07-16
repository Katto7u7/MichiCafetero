
package conexiones;

import clases.Clientes;
import clases.Productos;
import clases.Ventas;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class VentaConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoCliente;
    
    
    public boolean RegistrarVenta(Ventas v){
        String sql = "INSERT INTO USR_CAFETERIA.VENTA (ID,FECHA_VENTA,MET_PAGO_ID,CLIENTE_ID,RFC_EMPLEADO) VALUES (?,?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, v.getID());
            PS.setString(2, v.getFECHA());
            PS.setInt(3, v.getMETODO());
            PS.setString(4, v.getCLIENTEID());
            PS.setString(5, v.getRFCEMPLEADO());
            PS.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public List ListarVentas(){
        List<Ventas> ListaVentas = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.VENTA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoCliente = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoCliente.next()) {
                Ventas v = new Ventas(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                v.setID(ObtenerResultadoCliente.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                v.setFECHA(ObtenerResultadoCliente.getString("FECHA_VENTA")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                v.setMETODO(ObtenerResultadoCliente.getInt("MET_PAGO_ID"));
                v.setCLIENTEID(ObtenerResultadoCliente.getString("CLIENTE_ID"));
                v.setRFCEMPLEADO(ObtenerResultadoCliente.getString("RFC_EMPLEADO"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaVentas.add(v); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaVentas;
    }
    
    public boolean BorrarVenta(String id){
        String sql = "DELETE FROM USR_CAFETERIA.VENTA WHERE ID=?";
        try{
            PS = con.prepareStatement(sql);
            PS.setString(1, id);
            PS.execute();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion BORRADO " + e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de conexion  " + e.toString());
            }
        }
    }
    
    public boolean ModificarVenta(Ventas v){
        String slq = "UPDATE USR_CAFETERIA.VENTA SET ID=?,FECHA_VENTA=?,MET_PAGO_ID=?,CLIENTE_ID=?,FRC_EMPLEADO=? WHERE ID=?";
        try{
            PS = con.prepareStatement(slq);
            PS.setString(1, v.getID());
            PS.setString(2, v.getFECHA());
            PS.setInt(3, v.getMETODO());
            PS.setString(4, v.getCLIENTEID());
            PS.setString(5, v.getRFCEMPLEADO());
            PS.setString(6, v.getID());
            PS.execute();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Modificacion  " + e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de desconexion  " + e.toString());
            }
        }
    }
    
    public void ConsultarClientes(JComboBox Clientes){
        String sql = "Select * FROM USR_CAFETERIA.CLIENTE";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoCliente = PS.executeQuery();
            while(ObtenerResultadoCliente.next()){
                Clientes.addItem(ObtenerResultadoCliente.getString("ID")+" - "+ObtenerResultadoCliente.getString("NOMBRE")+" - "+ObtenerResultadoCliente.getString("APELLIDO_PAT")+" - "+ObtenerResultadoCliente.getString("APELLIDO_MAT"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar Cliente en ventac " + e.toString());
        }
    }
    public void ConsultarEmpleado(JComboBox Empleado){
        String sql = "Select * FROM USR_CAFETERIA.EMPLEADO";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoCliente = PS.executeQuery();
            while(ObtenerResultadoCliente.next()){
                Empleado.addItem(ObtenerResultadoCliente.getString("RFC")+" - "+ObtenerResultadoCliente.getString("NOMBRE")+" - "+ObtenerResultadoCliente.getString("APELLIDO_PAT")+" - "+ObtenerResultadoCliente.getString("APELLIDO_MAT"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar Empleado en ventaCX " + e.toString());
        }
    }
    
    public void ConsultarProductos(JComboBox Prod){
        String sql = "Select * FROM USR_CAFETERIA.PRODUCTO";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoCliente = PS.executeQuery();
            while(ObtenerResultadoCliente.next()){
                Prod.addItem(ObtenerResultadoCliente.getString("ID")+" - "+ObtenerResultadoCliente.getString("NOMBRE")+" - "+ObtenerResultadoCliente.getString("PRESENTACION"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar Empleado en ventaCX " + e.toString());
        }
    }
    
    public Productos BuscarProd(String ID){
        Productos prod = new Productos();
        String sql = "SELECT * FROM USR_CAFETERIA.PRODUCTO WHERE ID=?";
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            if(ObtenerResultadoCliente.next()) {
                prod.setID(ObtenerResultadoCliente.getString("ID"));
                prod.setNOMBRE(ObtenerResultadoCliente.getString("NOMBRE"));
                prod.setDESCRIPCCION(ObtenerResultadoCliente.getString("DESCRIPCION"));
                prod.setPRECIO(ObtenerResultadoCliente.getFloat("PRECIO"));
                prod.setSTOCK(ObtenerResultadoCliente.getInt("STOCK"));
                prod.setCALORIAS(ObtenerResultadoCliente.getInt("CALORIAS"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar prodicto en vnX Problemas con el encapsulado " + e.toString());
        }
        return prod;
    }
    
    public Productos BuscarProdXNombre(String Nombre){
        Productos prod = new Productos();
        String sql = "SELECT * FROM USR_CAFETERIA.PRODUCTO WHERE NOMBRE=?";
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, Nombre);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            if(ObtenerResultadoCliente.next()) {
                prod.setID(ObtenerResultadoCliente.getString("ID"));
                prod.setNOMBRE(ObtenerResultadoCliente.getString("NOMBRE"));
                prod.setPRECIO(ObtenerResultadoCliente.getFloat("PRECIO"));
                prod.setPRESENTACION(ObtenerResultadoCliente.getString("PRESENTACION"));
                prod.setCALORIAS(ObtenerResultadoCliente.getInt("CALORIAS"));
                prod.setDESCRIPCCION(ObtenerResultadoCliente.getString("DESCRIPCION"));
                prod.setCLASIFICACION(ObtenerResultadoCliente.getString("CLAS_PROD_ID"));
                prod.setSTOCK(ObtenerResultadoCliente.getInt("STOCK"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar prodicto en vnX Problemas con el encapsulado " + e.toString());
        }
        return prod;
    }
    
    public boolean uptadeProductoDespuesDeVenta(int nuevoStock,String ID ) {
        String slq = "UPDATE USR_CAFETERIA.PRODUCTO SET STOCK=? WHERE ID=?";
        try {
            System.out.println(ID);
            System.out.println(nuevoStock);
            con = cnc.getConnection();
            PS = con.prepareStatement(slq);
            PS.setInt(1, nuevoStock);
            PS.setString(2, ID);
            PS.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de Modificacion  Update Producto despues de venta en proX" + e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de desconexion  " + e.toString());
            }
        }
    }
    
    public String BuscarEmpleado(String ID){
        String sql = "SELECT * FROM USR_CAFETERIA.EMPLEADO WHERE RFC=?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            while (ObtenerResultadoCliente.next()) {
                busqueda = ObtenerResultadoCliente.getString("RFC")+"-"+ObtenerResultadoCliente.getString("NOMBRE")+" "+ObtenerResultadoCliente.getString("APELLIDO_PAT")+" "+ObtenerResultadoCliente.getString("APELLIDO_MAT");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar estado 2 Empleado en cnX " + e.toString());
        }
        return busqueda;
    }
    
    public String BuscarCliente(String ID){
        String sql = "SELECT * FROM USR_CAFETERIA.CLIENTE WHERE ID=?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            while (ObtenerResultadoCliente.next()) {
                busqueda = ObtenerResultadoCliente.getString("ID")+" - "+ObtenerResultadoCliente.getString("NOMBRE")+" "+ObtenerResultadoCliente.getString("APELLIDO_PAT")+" "+ObtenerResultadoCliente.getString("APELLIDO_MAT");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar estado 2 Cliente vnX" + e.toString());
        }
        return busqueda;
    }
    
    public Clientes BuscarIDCliente(String ID){
        Clientes cl = new Clientes();
        String sql = "SELECT * FROM USR_CAFETERIA.CLIENTE WHERE ID=?";
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            if(ObtenerResultadoCliente.next()) {
                cl.setId(ObtenerResultadoCliente.getString("ID"));
                cl.setNameCliente(ObtenerResultadoCliente.getString("NOMBRE"));
                cl.setAP_Cliente(ObtenerResultadoCliente.getString("APELLIDO_PAT"));
                cl.setAM_Cliente(ObtenerResultadoCliente.getString("APELLIDO_MAT"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar prodicto en vnX Problemas con el encapsulado " + e.toString());
        }
        return cl;
    }
    /*
    public String BuscarDescProducto(String ID){
        String sql = "SELECT * FROM USR_CAFETERIA.PRODUCTO WHERE ID=?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            while (ObtenerResultadoCliente.next()) {
                busqueda = ObtenerResultadoCliente.getString("DESCRIPCION");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar estado 2 " + e.toString());
        }
        return busqueda;
    }
    
    public int BuscarPrecioProducto(String ID){
        String sql = "SELECT PRECIO FROM USR_CAFETERIA.PRODUCTO WHERE ID=?";
        int Precio = 0;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            while (ObtenerResultadoCliente.next()) {
                Precio = ObtenerResultadoCliente.getInt("PRECIO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar estado 2 " + e.toString());
        }
        return Precio;
    }
    
    public int BuscarStockDelProducto(String id){
        String sql = "SELECT STOCK FROM USR_CAFETERIA.PRODUCTO WHERE ID=?";
        int stock = 0;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, id);
            // ps.execute();
            ObtenerResultadoCliente = PS.executeQuery();
            while (ObtenerResultadoCliente.next()) {
                stock = ObtenerResultadoCliente.getInt("STOCK");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar estado 2 stock prodicto " + e.toString());
        }
        return stock;
    }
    *///TODAS ESTAS FUNCIONES FUERON REMPLAZADAS POR UN OBJETO DEL PRODUCTO PARA SIMPLIFICAR CODIGO
    public void ConsultarMetodo(JComboBox metodo){
        String sql = "Select * FROM USR_CAFETERIA.MET_PAGO";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoCliente = PS.executeQuery();
            while(ObtenerResultadoCliente.next()){
                metodo.addItem(ObtenerResultadoCliente.getString("ID")+" - "+ObtenerResultadoCliente.getString("PAGO"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar Metodo de pago en ventaCX " + e.toString());
        }
    }
    
}
