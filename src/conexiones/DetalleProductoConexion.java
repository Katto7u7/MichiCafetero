package conexiones;

import clases.DetalleProducto;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleProductoConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultado;
    
    public List ListarDetalleProducto() {
        List<DetalleProducto> Lista = new ArrayList();        
        String sql = "SELECT * FROM USR_CAFETERIA.DETALLE_PRODUCTO";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();            
            PS = con.prepareStatement(sql);            
            ObtenerResultado = PS.executeQuery();            
            
            while (ObtenerResultado.next()) {
                DetalleProducto cl = new DetalleProducto(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID_MAT_PRIMA(ObtenerResultado.getString("ID_MAT_PRIMA")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setID_PRODUCTO(ObtenerResultado.getString("ID_PRODUCTO"));                
                cl.setCANTIDAD(ObtenerResultado.getInt("CANTIDAD"));
                
                Lista.add(cl);                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
        }
        return Lista;
    }
}
