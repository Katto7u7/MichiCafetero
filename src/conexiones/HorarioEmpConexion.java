package conexiones;

import clases.HorarioEmp;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HorarioEmpConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultado;

    public List ListarHorarioEmp() {
        List<HorarioEmp> Lista = new ArrayList();
        String sql = "SELECT * FROM USR_CAFETERIA.HORARIO_EMP";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();
            PS = con.prepareStatement(sql);
            ObtenerResultado = PS.executeQuery();

            while (ObtenerResultado.next()) {
                HorarioEmp cl = new HorarioEmp(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID(ObtenerResultado.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setHORA(ObtenerResultado.getString("HORA"));

                Lista.add(cl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
        }
        return Lista;
    }
}
