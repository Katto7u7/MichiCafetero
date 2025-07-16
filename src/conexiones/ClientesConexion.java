package conexiones;

import clases.Clientes;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoCliente;

    public boolean RegistrarCliente(Clientes cl) {
        String sql = "INSERT INTO USR_CAFETERIA.CLIENTE VALUES (?,?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, cl.getId());
            PS.setString(2, cl.getNameCliente());
            PS.setString(3, cl.getAP_Cliente());
            PS.setString(4, cl.getAM_Cliente());
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
    
    public List ListarClientes() {
        List<Clientes> ListaClientes = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.CLIENTE";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoCliente = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoCliente.next()) {
                Clientes cl = new Clientes(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setId(ObtenerResultadoCliente.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setNameCliente(ObtenerResultadoCliente.getString("NOMBRE")); //IMPORTANTE: RECORDAR PONER EXACTAMENTE EL NOMBRE DE LA COLUNA QUE SE TIENE EN ORACLE
                cl.setAP_Cliente(ObtenerResultadoCliente.getString("APELLIDO_PAT"));
                cl.setAM_Cliente(ObtenerResultadoCliente.getString("APELLIDO_MAT"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaClientes.add(cl); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaClientes;
    }

    public boolean BorrarCliente(String id){
        String sql = "DELETE FROM USR_CAFETERIA.CLIENTE WHERE ID=?";
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
    
    public boolean ModificarCliente(Clientes cl){
        String slq = "UPDATE USR_CAFETERIA.CLIENTE SET ID=?,NOMBRE=?,APELLIDO_PAT=?,APELLIDO_MAT=? WHERE ID=?";
        try{
            con = cnc.getConnection();
            PS = con.prepareStatement(slq);
            PS.setString(1, cl.getId());
            PS.setString(2, cl.getNameCliente());
            PS.setString(3, cl.getAP_Cliente());
            PS.setString(4, cl.getAM_Cliente());
            PS.setString(5, cl.getId());
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
