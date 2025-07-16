
package conexiones;

import clases.Empleados;
import clases.VentasPorEmpleado;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class EmpleadosConexion {
    Conexion cne = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet ObtenerResultadoEmpleado;
    
    public boolean RegistrarEmpleado(Empleados em){
        String sql = "INSERT INTO USR_CAFETERIA.EMPLEADO VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cne.getConnection();
            ps = con.prepareStatement(sql);                 //Realiza la consulta
            ps.setString(1, em.getRFC());
            ps.setString(2, em.getName());
            ps.setString(3, em.getA_pat());
            ps.setString(4, em.getA_mat());
            ps.setString(5, em.getFechaNac());
            ps.setString(6, em.getCorreo());
            ps.setString(7, em.getNumSeguro());
            ps.setString(8, em.getUser());
            ps.setString(9, em.getPassword());
            ps.setString(10,em.getCargo());
            ps.setString(11,em.getHorario());
            ps.setString(12,em.getId_direccion());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "em 1"+e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "em 1"+e.toString());
            }
        }
    }
    
    public List ListarEmpleados(){
        List<Empleados> ListaEmpleado = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.EMPLEADO";             //Declaramos la variable para la consulta
        try {
            con = cne.getConnection();                    //optenemos la conexion a la base de datos 
            ps = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoEmpleado = ps.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoEmpleado.next()) {
                Empleados em = new Empleados(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                em.setRFC(ObtenerResultadoEmpleado.getString("RFC")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                em.setName(ObtenerResultadoEmpleado.getString("NOMBRE")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                em.setA_pat(ObtenerResultadoEmpleado.getString("APELLIDO_PAT"));
                em.setA_mat(ObtenerResultadoEmpleado.getString("APELLIDO_MAT"));
                em.setFechaNac(ObtenerResultadoEmpleado.getString("FECHA_NACIM"));
                em.setCorreo(ObtenerResultadoEmpleado.getString("CORREO"));
                em.setNumSeguro(ObtenerResultadoEmpleado.getString("NUM_SEGURO"));
                em.setUser(ObtenerResultadoEmpleado.getString("USUARIO"));
                em.setPassword(ObtenerResultadoEmpleado.getString("CONTRASENIA"));
                em.setCargo(ObtenerResultadoEmpleado.getString("CARGO_EMPLEADO_ID"));
                em.setHorario(ObtenerResultadoEmpleado.getString("HORARIO_EMP_ID"));
                em.setId_direccion(ObtenerResultadoEmpleado.getString("DIRECCION_ID"));
                
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaEmpleado.add(em); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion 11" + e.toString());
            //return false;
        }
        return ListaEmpleado;
    }
    
    public boolean BorrarEmpleado(String rfc){
        String sql = "DELETE FROM USR_CAFETERIA.EMPLEADO WHERE RFC=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, rfc);
            ps.execute();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion BORRADO de empleado " + e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de conexion  " + e.toString());
            }
        }
    }
    
    public boolean ModificarEmpleado(Empleados em){
        String slq = "UPDATE USR_CAFETERIA.EMPLEADO SET RFC=?,NOMBRE=?,APELLIDO_PAT=?,APELLIDO_MAT=?,FECHA_NACIM=?,CORREO=?,NUM_SEGURO=?,USUARIO=?,CONTRASENIA=?,CARGO_EMPLEADO_ID=?,HORARIO_EMP_ID=?,DIRECCION_ID=? WHERE RFC=?";
        try{
            ps = con.prepareStatement(slq);
            ps.setString(1, em.getRFC());
            ps.setString(2, em.getName());
            ps.setString(3, em.getA_pat());
            ps.setString(4, em.getA_mat());
            ps.setString(5, em.getFechaNac());
            ps.setString(6, em.getCorreo());
            ps.setString(7, em.getNumSeguro());
            ps.setString(8, em.getUser());
            ps.setString(9, em.getPassword());
            ps.setString(10,em.getCargo());
            ps.setString(11,em.getHorario());
            ps.setString(12,em.getId_direccion());
            ps.setString(13,em.getRFC());
            ps.execute();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Modificacion de empleado  " + e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de desconexion en empleado  " + e.toString());
            }
        }
    }
    
    public void ConsultarCargoEmpleado(JComboBox Cargo){
        String sql = "Select * FROM USR_CAFETERIA.CARGO_EMPLEADO";
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
                Cargo.addItem(ObtenerResultadoEmpleado.getString("ID")+" - "+ObtenerResultadoEmpleado.getString("CARGO"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar cargo del empleado " + e.toString());
        }
    }
    
    public void ConsultarEmpleado(JComboBox Cargo){
        String sql = "Select * FROM USR_CAFETERIA.EMPLEADO";
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
                Cargo.addItem(ObtenerResultadoEmpleado.getString("RFC")+" - "+ObtenerResultadoEmpleado.getString("NOMBRE")+" - "+ObtenerResultadoEmpleado.getString("APELLIDO_PAT")+" - "+ObtenerResultadoEmpleado.getString("APELLIDO_MAT"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar cargo del empleado " + e.toString());
        }
    }
    
    public List ListarVentasPorEmpleado(VentasPorEmpleado vpe, String RFC) {
        List<VentasPorEmpleado> ListaVentasporEmpleado = new ArrayList();                 //Creamos un array list 
        String sql = "Select EMPLEADO.RFC,EMPLEADO.NOMBRE,EMPLEADO.APELLIDO_PAT,EMPLEADO.APELLIDO_MAT, VENTA.ID, VENTA.FECHA_VENTA, PRODUCTO.NOMBRE,DETALLE_VENTA.CANTIDAD\n"
                + "from EMPLEADO\n"
                + "join VENTA ON EMPLEADO.RFC=VENTA.RFC_EMPLEADO\n"
                + "JOIN DETALLE_VENTA ON VENTA.ID=DETALLE_VENTA.ID_VENTA\n"
                + "JOIN PRODUCTO ON PRODUCTO.ID=DETALLE_VENTA.ID_PRODUCTO WHERE EMPLEADO.RFC=?;";             //Declaramos la variable para la consulta
        try {
            con = cne.getConnection();                    //optenemos la conexion a la base de datos 
            ps = con.prepareStatement(sql);
            ps.setString(1, RFC);
            ps.execute();
            ObtenerResultadoEmpleado = ps.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoEmpleado.next()) {
                VentasPorEmpleado em = new VentasPorEmpleado(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                em.setRFC(ObtenerResultadoEmpleado.getString("RFC")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                em.setNOMBREEMP(ObtenerResultadoEmpleado.getString("NOMBRE")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                em.setAPELLIDOPAT(ObtenerResultadoEmpleado.getString("APELLIDO_PAT"));
                em.setAPELLIDOMAT(ObtenerResultadoEmpleado.getString("APELLIDO_MAT"));
                em.setIDVENTA(ObtenerResultadoEmpleado.getString("ID"));
                em.setFECHAVENTA(ObtenerResultadoEmpleado.getString("FECHA_VENTA"));
                em.setNOMBREPROD(ObtenerResultadoEmpleado.getString("NOMBRE_1"));
                em.setCANTIDAD(ObtenerResultadoEmpleado.getInt("CANTIDAD"));

                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaVentasporEmpleado.add(em); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion 11" + e.toString());
            //return false;
        }
        return ListaVentasporEmpleado;
    }
    
    public void ConsultarHorarioEmpleado(JComboBox Horario){
        String sql = "Select * FROM USR_CAFETERIA.HORARIO_EMP";
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
                Horario.addItem(ObtenerResultadoEmpleado.getString("ID")+" - "+ObtenerResultadoEmpleado.getString("HORA"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar Horario del empleado " + e.toString());
        }
    }
    
    public void ConsultarDireccionEmpleado(JComboBox Dir){
        String sql = "Select * FROM USR_CAFETERIA.DIRECCION";
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
                Dir.addItem(ObtenerResultadoEmpleado.getString("ID")+" , "+
                            ObtenerResultadoEmpleado.getString("CALLE")+", "+
                            ObtenerResultadoEmpleado.getString("COLONIA")+", "+
                            ObtenerResultadoEmpleado.getString("CP")+", "+
                            ObtenerResultadoEmpleado.getString("EXT")+", "+
                            ObtenerResultadoEmpleado.getString("INTE")+", "+
                            ObtenerResultadoEmpleado.getString("ALC_MUN")+", "+
                            ObtenerResultadoEmpleado.getString("ESTADO_ID"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar cargo del empleado " + e.toString());
        }
    }
    
    public String BuscarCargoRe(String id){
        String sql = "SELECT * FROM USR_CAFETERIA.CARGO_EMPLEADO WHERE ID= ?";
         String busqueda = null;
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
           // ps.execute();
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
            busqueda =ObtenerResultadoEmpleado.getString("ID")+" - "+ObtenerResultadoEmpleado.getString("CARGO");
            
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar cargo del empleado " + e.toString());
        }
        return busqueda;
    }
    
    public String BuscarHorarioEm(String h){
        String sql = "SELECT * FROM USR_CAFETERIA.HORARIO_EMP WHERE ID= ?";
         String busqueda = null;
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, h);
           // ps.execute();
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
            busqueda =ObtenerResultadoEmpleado.getString("ID")+" - "+ObtenerResultadoEmpleado.getString("HORA");
            
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar cargo del empleado " + e.toString());
        }
        return busqueda;
    }
    
    public String BuscarDirEm(String dir){
        String sql = "SELECT * FROM USR_CAFETERIA.DIRECCION WHERE ID= ?";
         String busqueda = null;
        try{
            con = cne.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, dir);
           // ps.execute();
            ObtenerResultadoEmpleado = ps.executeQuery();
            while(ObtenerResultadoEmpleado.next()){
            busqueda =ObtenerResultadoEmpleado.getString("ID")+" , "+
                            ObtenerResultadoEmpleado.getString("CALLE")+", "+
                            ObtenerResultadoEmpleado.getString("COLONIA")+", "+
                            ObtenerResultadoEmpleado.getString("CP")+", "+
                            ObtenerResultadoEmpleado.getString("EXT")+", "+
                            ObtenerResultadoEmpleado.getString("INTE")+", "+
                            ObtenerResultadoEmpleado.getString("ALC_MUN")+", "+
                            ObtenerResultadoEmpleado.getString("ESTADO_ID");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar cargo del empleado " + e.toString());
        }
        return busqueda;
    }
    
}
