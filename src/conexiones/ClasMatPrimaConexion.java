
package conexiones;

import clases.ClasMatPrima;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClasMatPrimaConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoClasMatPrima;
    
    public List ListarClasMatPrima() {
        List<ClasMatPrima> ListaClasMatPrima = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.CLAS_MAT_PRIMA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoClasMatPrima = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoClasMatPrima.next()) {
                ClasMatPrima cl = new ClasMatPrima(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID(ObtenerResultadoClasMatPrima.getInt("ID")); 
                cl.setCLASIFICACION(ObtenerResultadoClasMatPrima.getString("CLASIFICACION"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaClasMatPrima.add(cl); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion Al conextar a clas materia prima " + e.toString());
            //return false;
        }
        return ListaClasMatPrima;
    }
    
}
