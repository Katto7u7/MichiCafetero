
package conexiones;

import clases.MateriaPrima;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class MateriaPrimaConexion {
    
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoMatPrima;

    public boolean IngresarMatPrima(MateriaPrima MP){
        String sql = "INSERT INTO USR_CAFETERIA.MATERIA_PRIMA VALUES (?,?,?,?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, MP.getIdMatPrima());
            PS.setString(2, MP.getNombreMatP());
            PS.setFloat(3, MP.getPrecio());
            PS.setInt(4, MP.getExistencias());
            PS.setString(5, MP.getFechaCad());
            PS.setString(6, MP.getTipoMatP());
            PS.setInt(7, MP.getClasMatP());
            
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
    
    public List ListarMatPrima(){
        List<MateriaPrima> ListaMatPrima = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.MATERIA_PRIMA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoMatPrima = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoMatPrima.next()) {
                MateriaPrima mp = new MateriaPrima(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                mp.setIdMatPrima(ObtenerResultadoMatPrima.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                mp.setNombreMatP(ObtenerResultadoMatPrima.getString("NOMBRE")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                mp.setPrecio(ObtenerResultadoMatPrima.getFloat("PRECIO"));
                mp.setExistencias(ObtenerResultadoMatPrima.getInt("EXISTENCIAS"));
                mp.setFechaCad(ObtenerResultadoMatPrima.getString("FECHA_CAD"));
                mp.setTipoMatP(ObtenerResultadoMatPrima.getString("TIPO_MAT_PRIMA_ID"));
                mp.setClasMatP(ObtenerResultadoMatPrima.getInt("CLAS_MAT_PRIMA_ID"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaMatPrima.add(mp); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaMatPrima;
    }
    
    public boolean BorrarMatPrima(String id){
        String sql = "DELETE FROM USR_CAFETERIA.MATERIA_PRIMA WHERE ID=?";
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
    
    public boolean ModificarMatPrima(MateriaPrima MP){
        String slq = "UPDATE USR_CAFETERIA.MATERIA_PRIMA SET ID=?,NOMBRE=?,PRECIO=?,EXISTENCIAS=?,FECHA_CAD=?,TIPO_MAT_PRIMA_ID=?,CLAS_MAT_PRIMA_ID=? WHERE ID=?";
        try{
            PS = con.prepareStatement(slq);
            PS.setString(1, MP.getIdMatPrima());
            PS.setString(2, MP.getNombreMatP());
            PS.setFloat(3, MP.getPrecio());
            PS.setInt(4, MP.getExistencias());
            PS.setString(5, MP.getFechaCad());
            PS.setString(6, MP.getTipoMatP());
            PS.setInt(7, MP.getClasMatP());
            PS.setString(8, MP.getIdMatPrima());
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
    
    public void ConvTipoMatPrima(JComboBox j){
        String sql = "Select * FROM USR_CAFETERIA.TIPO_MAT_PRIMA";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoMatPrima = PS.executeQuery();
            while(ObtenerResultadoMatPrima.next()){
                j.addItem(ObtenerResultadoMatPrima.getString("ID")+" - "+ObtenerResultadoMatPrima.getString("TIPO"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar tipomatprima en mpx " + e.toString());
        }
        
    }
    
    public void ConvClasMatPrima(JComboBox J){
        String sql = "Select * FROM USR_CAFETERIA.CLAS_MAT_PRIMA";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoMatPrima = PS.executeQuery();
            while(ObtenerResultadoMatPrima.next()){
                J.addItem(ObtenerResultadoMatPrima.getString("ID")+" - "+ObtenerResultadoMatPrima.getString("CLASIFICACION"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Al consultar ClasMatPrima en mpx " + e.toString());
        }
        
    }
    
    public String BuscarTipoMatPrima(String id){
        String sql = "SELECT * FROM USR_CAFETERIA.TIPO_MAT_PRIMA WHERE ID= ?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, id);
            // ps.execute();
            ObtenerResultadoMatPrima = PS.executeQuery();
            while (ObtenerResultadoMatPrima.next()) {
                busqueda = ObtenerResultadoMatPrima.getString("ID") + " - " + ObtenerResultadoMatPrima.getString("TIPO");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar buscartipomatprima en mpx 2 " + e.toString());
        }
        
        return busqueda;
    }
    
    public String BuscarClasMatPrima(String id){
        String sql = "SELECT * FROM USR_CAFETERIA.CLAS_MAT_PRIMA WHERE ID= ?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, id);
            // ps.execute();
            ObtenerResultadoMatPrima = PS.executeQuery();
            while (ObtenerResultadoMatPrima.next()) {
                busqueda = ObtenerResultadoMatPrima.getString("ID") + " - " + ObtenerResultadoMatPrima.getString("CLASIFICACION");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar buscarClasmatprima en mpx 2 " + e.toString());
        }
        
        return busqueda;
        
    }
    
    
}
