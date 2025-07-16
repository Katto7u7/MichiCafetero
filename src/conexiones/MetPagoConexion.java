package conexiones;

import clases.MetPago;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MetPagoConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultado;

    public List ListarMetPago() {
        List<MetPago> Lista = new ArrayList();
        String sql = "SELECT * FROM USR_CAFETERIA.MET_PAGO";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultado = PS.executeQuery();

            while (ObtenerResultado.next()) {
                MetPago cl = new MetPago(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID(ObtenerResultado.getInt("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setPAGO(ObtenerResultado.getString("PAGO"));

                Lista.add(cl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
        }
        return Lista;
    }
}
