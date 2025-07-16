
package conexiones;

import clases.DetalleCompra;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DetalleCompraConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultado;
    
    public List ListarDetalleCompra(){
        List<DetalleCompra> Lista = new ArrayList();                 
        String sql = "SELECT * FROM USR_CAFETERIA.DETALLE_COMPRA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    
            PS = con.prepareStatement(sql);              
            ObtenerResultado = PS.executeQuery();  

            
            while (ObtenerResultado.next()) {
                DetalleCompra cl = new DetalleCompra(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID_COMPRA(ObtenerResultado.getString("ID_COMPRA")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setID_PROV(ObtenerResultado.getString("ID_PROV"));
                cl.setCANTIDAD(ObtenerResultado.getInt("CANTIDAD"));
                
                
                Lista.add(cl); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
        }
        return Lista;
    }
}
