package conexiones;

import clases.Compra;

import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultado;

    public List ListarCompra() {
        List<Compra> Lista = new ArrayList();
        String sql = "SELECT * FROM USR_CAFETERIA.COMPRA";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultado = PS.executeQuery();

            while (ObtenerResultado.next()) {
                Compra cl = new Compra(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID(ObtenerResultado.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setFECHA_COMPRA(ObtenerResultado.getString("FECHA_COMPRA"));
                cl.setCANTIDAD(ObtenerResultado.getInt("CANTIDAD"));
                cl.setRFC_EMPLEADO(ObtenerResultado.getString("RFC_EMPLEADO"));
                cl.setMAT_PRIMA_ID(ObtenerResultado.getString("MAT_PRIMA_ID"));

                Lista.add(cl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
        }
        return Lista;
    }
}
