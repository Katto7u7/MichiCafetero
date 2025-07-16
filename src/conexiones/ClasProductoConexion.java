package conexiones;

import clases.ClasProducto;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClasProductoConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoCliente;

    public List ListarClasProducto() {
        List<ClasProducto> ListaClasProducto = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.CLAS_PROD";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoCliente = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoCliente.next()) {
                ClasProducto cl = new ClasProducto(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID(ObtenerResultadoCliente.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setCLAS_P(ObtenerResultadoCliente.getString("CLAS_P"));

                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaClasProducto.add(cl); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
        }
        return ListaClasProducto;
    }

}
