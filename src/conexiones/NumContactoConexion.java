
package conexiones;

import clases.NumContacto;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class NumContactoConexion {
    
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoNC;

    
    public boolean RegistrarNumContacto(NumContacto nc){
        String sql = "INSERT INTO USR_CAFETERIA.NUM_CONTACTO VALUES (?,?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, nc.getID_NUMC());
            PS.setString(2, nc.getLADA());
            PS.setString(3, nc.getTEL());
            PS.setString(4, nc.getEXTENSION());
            PS.setString(5, nc.getRFC_EMP());
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
    
    public List ListarNumContacto(){
        List<NumContacto> ListaNC = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.NUM_CONTACTO";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoNC = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoNC.next()) {
                NumContacto nc = new NumContacto(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                nc.setID_NUMC(ObtenerResultadoNC.getString("ID_NUM_CONT")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                nc.setLADA(ObtenerResultadoNC.getString("LADA")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                nc.setTEL(ObtenerResultadoNC.getString("TELEFONO"));
                nc.setEXTENSION(ObtenerResultadoNC.getString("EXTENSION"));
                nc.setRFC_EMP(ObtenerResultadoNC.getString("RFC_EMPLEADO"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaNC.add(nc); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaNC;
    }
    
    public boolean BorrarNumContacto(String id){
        String sql = "DELETE FROM USR_CAFETERIA.NUM_CONTACTO WHERE ID_NUM_CONT=?";
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
    
    public boolean ModificarNumContacto(NumContacto nc){
        String slq = "UPDATE USR_CAFETERIA.NUM_CONTACTO SET ID_NUM_CONT=?,LADA=?,TELEFONO=?,EXTENSION=?,RFC_EMPLEADO=? WHERE ID_NUM_CONT=?";
        try{
            PS = con.prepareStatement(slq);
            PS.setString(1, nc.getID_NUMC());
            PS.setString(2, nc.getLADA());
            PS.setString(3, nc.getTEL());
            PS.setString(4, nc.getEXTENSION());
            PS.setString(5, nc.getRFC_EMP());
            PS.setString(6, nc.getID_NUMC());
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
    
    public void ConsultarNumContacto(JComboBox j) {
        String sql = "Select * FROM USR_CAFETERIA.EMPLEADO";
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultadoNC = PS.executeQuery();
            while (ObtenerResultadoNC.next()) {
                j.addItem(ObtenerResultadoNC.getString("RFC") + " " + 
                          ObtenerResultadoNC.getString("NOMBRE")+ " " + 
                          ObtenerResultadoNC.getString("APELLIDO_PAT")+ " " + 
                          ObtenerResultadoNC.getString("APELLIDO_MAT"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar eMPLEADO en NMX " + e.toString());
        }

    }
    
    public String BuscarRFCEm(String RFC) {
        String sql = "SELECT * FROM USR_CAFETERIA.EMPLEADO WHERE RFC= ?";
        String busqueda = null;
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            PS.setString(1, RFC);
            // ps.execute();
            ObtenerResultadoNC = PS.executeQuery();
            while (ObtenerResultadoNC.next()) {
                busqueda = ObtenerResultadoNC.getString("RFC") + " " + 
                          ObtenerResultadoNC.getString("NOMBRE")+ " " + 
                          ObtenerResultadoNC.getString("APELLIDO_PAT")+ " " + 
                          ObtenerResultadoNC.getString("APELLIDO_MAT");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al consultar buscarEMPLEADO en NCX 2 " + e.toString());
        }

        return busqueda;
    }


}
