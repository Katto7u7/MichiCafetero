
package conexiones;
import clases.DetalleVenta;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DetalleVentaConexion {
    
Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultado;
    
    public boolean RegistrarDetalleVenta(DetalleVenta v){
        String sql = "INSERT INTO USR_CAFETERIA.DETALLE_VENTA (ID_VENTA,ID_PRODUCTO,CANTIDAD) VALUES (?,?,?)"; //aki TENEMOS QUE REGRISTRAR LA INTRUCCION PARA INGRESAR UN NUEVO REGISTRO
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);                 //Realiza la consulta
            PS.setString(1, v.getID_VENTA());
            PS.setString(2, v.getID_PRODUCTO());
            PS.setInt(3, v.getCANTIDAD());
            
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
    
    public List ListarDetalleVenta(){
        List<DetalleVenta> Lista = new ArrayList();                 
        String sql = "SELECT * FROM USR_CAFETERIA.DETALLE_VENTA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    
            PS = con.prepareStatement(sql);              
            ObtenerResultado = PS.executeQuery();  

            
            while (ObtenerResultado.next()) {
                DetalleVenta cl = new DetalleVenta(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID_VENTA(ObtenerResultado.getString("ID_VENTA")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
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
