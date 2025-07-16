
package conexiones;

import clases.Direcciones;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class DireccionesConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoDir;
    
    public boolean RegistrarDireccion(Direcciones dir){
        String sql = "INSERT INTO USR_CAFETERIA.DIRECCION VALUES (?,?,?,?,?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, dir.getIdDir());
            PS.setString(2, dir.getAlc_mun());
            PS.setString(3, dir.getColonia());
            PS.setString(4, dir.getCp());
            PS.setString(5, dir.getCall());
            PS.setString(6, dir.getExt());
            PS.setString(7, dir.getInte());
            PS.setString(8, dir.getEstado_id());
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
    
    public List ListarDirecciones(){
        List<Direcciones> ListaDir = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.DIRECCION";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoDir = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoDir.next()) {
                Direcciones dir = new Direcciones(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                dir.setIdDir(ObtenerResultadoDir.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                dir.setAlc_mun(ObtenerResultadoDir.getString("ALC_MUN")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                dir.setColonia(ObtenerResultadoDir.getString("COLONIA"));
                dir.setCp(ObtenerResultadoDir.getString("CP"));
                dir.setCall(ObtenerResultadoDir.getString("CALLE"));
                dir.setExt(ObtenerResultadoDir.getString("EXT"));
                dir.setInte(ObtenerResultadoDir.getString("INTE"));
                dir.setEstado_id(ObtenerResultadoDir.getString("ESTADO_ID"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaDir.add(dir); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaDir;
    }
    
    public boolean BorrarDir(String id){
        String sql = "DELETE FROM USR_CAFETERIA.DIRECCION WHERE ID=?";
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
    
    public boolean ModificarDir(Direcciones dir){
        String slq = "UPDATE USR_CAFETERIA.DIRECCION SET ID=?,ALC_MUN=?,COLONIA=?,CP=?,CALLE=?,EXT=?,INTE=?,ESTADO_ID=? WHERE ID=?";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(slq);              //Realiza la consulta
            PS.setString(1, dir.getIdDir());
            PS.setString(2, dir.getAlc_mun());
            PS.setString(3, dir.getColonia());
            PS.setString(4, dir.getCp());
            PS.setString(5, dir.getCall());
            PS.setString(6, dir.getExt());
            PS.setString(7, dir.getInte());
            PS.setString(8, dir.getEstado_id());
            PS.setString(9, dir.getIdDir());
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
    
    public void ConsultarEstado(JComboBox Estado){
        String sql = "Select * FROM USR_CAFETERIA.ESTADO";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoDir = PS.executeQuery();
            while(ObtenerResultadoDir.next()){
                Estado.addItem(ObtenerResultadoDir.getString("ID")+" - "+ObtenerResultadoDir.getString("NOMBRE"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar estado " + e.toString());
        }
    }
    
    public String BuscarEstado(String ID){
        String sql = "SELECT * FROM USR_CAFETERIA.ESTADO WHERE ID= ?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, ID);
            // ps.execute();
            ObtenerResultadoDir = PS.executeQuery();
            while (ObtenerResultadoDir.next()) {
                busqueda = ObtenerResultadoDir.getString("ID") + " - " + ObtenerResultadoDir.getString("NOMBRE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar estado 2 " + e.toString());
        }
        return busqueda;
    }
    
    
}
