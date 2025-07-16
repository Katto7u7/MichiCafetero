
package conexiones;

import clases.Productos;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class ProductoConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoProducto;

    public boolean RegistrarProducto(Productos p){
        String sql = "INSERT INTO USR_CAFETERIA.PRODUCTO (ID,NOMBRE,PRECIO,PRESENTACION, CALORIAS, DESCRIPCION,CLAS_PROD_ID,STOCK) VALUES (?,?,?,?,?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, p.getID());
            PS.setString(2, p.getNOMBRE());
            PS.setFloat(3, p.getPRECIO());
            PS.setString(4, p.getPRESENTACION());
            PS.setInt(5, p.getCALORIAS());
            PS.setString(6, p.getDESCRIPCCION());
            PS.setString(7, p.getCLASIFICACION());
            PS.setInt(8, p.getSTOCK()); ///**SE AGREGÓ STOCK 15/12/2022
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
    
    public List ListarProductos(){
        List<Productos> ListaProductos = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.PRODUCTO";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoProducto = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoProducto.next()) {
                Productos p = new Productos(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                p.setID(ObtenerResultadoProducto.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                p.setNOMBRE(ObtenerResultadoProducto.getString("NOMBRE")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                p.setPRECIO(ObtenerResultadoProducto.getFloat("PRECIO"));
                p.setPRESENTACION(ObtenerResultadoProducto.getString("PRESENTACION"));
                p.setCALORIAS(ObtenerResultadoProducto.getInt("CALORIAS"));
                p.setDESCRIPCCION(ObtenerResultadoProducto.getString("DESCRIPCION"));
                p.setCLASIFICACION(ObtenerResultadoProducto.getString("CLAS_PROD_ID"));
                p.setSTOCK(ObtenerResultadoProducto.getInt("STOCK"));///**SE AGREGÓ STOCK 15/12/2022
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaProductos.add(p); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaProductos;
    }
    
    public boolean BorrarProductos(String id){
        String sql = "DELETE FROM USR_CAFETERIA.PRODUCTO WHERE ID=?";
        try{
            con = cnc.getConnection();
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
    
    public boolean ModificarProducto(Productos p){
        String slq = "UPDATE USR_CAFETERIA.PRODUCTO SET ID=?,NOMBRE=?,PRECIO=?,PRESENTACION=?,CALORIAS=?,DESCRIPCION=?,CLAS_PROD_ID=?,STOCK=? WHERE ID=?";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(slq);
            PS.setString(1, p.getID());
            PS.setString(2, p.getNOMBRE());
            PS.setFloat(3, p.getPRECIO());
            PS.setString(4, p.getPRESENTACION());
            PS.setInt(5, p.getCALORIAS());
            PS.setString(6, p.getDESCRIPCCION());
            PS.setString(7, p.getCLASIFICACION());
            PS.setInt(8, p.getSTOCK());///**SE AGREGÓ STOCK 15/12/2022
            PS.setString(9, p.getID());
            
            PS.execute();
            return true;
        }catch(SQLException e){
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
    
    public boolean uptadeProductoDespuesDeVenta(int nuevoStock,String ID ) {
        String slq = "UPDATE USR_CAFETERIA.PRODUCTO SET STOCK=? WHERE ID=?";
        try {
            System.out.println(ID);
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
    
    
    
    public void ConsultarClasProd(JComboBox clasp){
        String sql = "Select * FROM USR_CAFETERIA.CLAS_PROD";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoProducto = PS.executeQuery();
            while(ObtenerResultadoProducto.next()){
                clasp.addItem(ObtenerResultadoProducto.getString("ID")+" - "+ObtenerResultadoProducto.getString("CLAS_P"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar Clas del producto en Prod Conex " + e.toString());
        }
    }
    
    public String BuscarClas(String ID){
        String sql = "SELECT * FROM USR_CAFETERIA.CLAS_PROD WHERE ID= ?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoProducto = PS.executeQuery();
            while (ObtenerResultadoProducto.next()) {
                busqueda = ObtenerResultadoProducto.getString("ID") + " - " + ObtenerResultadoProducto.getString("CLAS_P");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar clas prod en prodX 2 " + e.toString());
        }
        return busqueda;
    }
    
    
}
