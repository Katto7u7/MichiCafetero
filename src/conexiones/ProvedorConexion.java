
package conexiones;

import clases.Provedor;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProvedorConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoProvedor;
    
    
    public boolean RegistrarProvedor(Provedor p){
        String sql = "INSERT INTO USR_CAFETERIA.PROV_MAT_PRIMA VALUES (?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, p.getIDPROV());
            PS.setString(2, p.getPROV());
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
    
    public List ListarProvedores(){
        List<Provedor> ListaProv = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.PROV_MAT_PRIMA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoProvedor = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoProvedor.next()) {
                Provedor p = new Provedor(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                p.setIDPROV(ObtenerResultadoProvedor.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                p.setPROV(ObtenerResultadoProvedor.getString("PROVEEDOR")); 
                
                ListaProv.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaProv;
    }
    
    public boolean BorrarProvedor(String id){
        String sql = "DELETE FROM USR_CAFETERIA.PROV_MAT_PRIMA WHERE ID=?";
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
    
    public boolean ModificarProvedor(Provedor pr){
        String slq = "UPDATE USR_CAFETERIA.PROV_MAT_PRIMA SET PROVEEDOR=? WHERE ID=?";
        try{
            PS = con.prepareStatement(slq);
            //PS.setString(1, pr.getIDPROV());
            PS.setString(1, pr.getPROV());
            PS.setString(2, pr.getIDPROV());
            
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
    
    
}
