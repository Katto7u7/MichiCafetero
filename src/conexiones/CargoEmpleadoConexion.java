package conexiones;

import clases.CargoEmpleado;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CargoEmpleadoConexion {

    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoCargoEmpleado;

    public List ListarCargoEmpleado() {
        List<CargoEmpleado> ListaCargoEmpleado = new ArrayList();                 //Creamos un array list 
        String sql = "SELECT * FROM USR_CAFETERIA.CARGO_EMPLEADO";             //Declaramos la variable para la consulta
        try {
            con = cnc.getConnection();                    //optenemos la conexion a la base de datos 
            PS = con.prepareStatement(sql);              //Pasamos el parametro de nuestra consulta
            ObtenerResultadoCargoEmpleado = PS.executeQuery();  //Ejecuta nuestra consulta y guardamos el resultado de nuestra consulta en una variable

            //Recorremos nuestra consulta -- basicamente lo que estaba el todo el codigo de la otra clase para listar
            while (ObtenerResultadoCargoEmpleado.next()) {
                CargoEmpleado cl = new CargoEmpleado(); //creamos una instancia de nuestro modelo de encapsulado de clientes para ir guardardando datos y encapsularlos 

                cl.setID(ObtenerResultadoCargoEmpleado.getString("ID")); //Encapsulamos el resultado de ese primer indice y lo guardamos aqui 
                cl.setCARGO(ObtenerResultadoCargoEmpleado.getString("CARGO"));
                //ahora todo esto lo vamos a pasar a la lista que creamos 
                ListaCargoEmpleado.add(cl); //cambiamos a listas para manejar mejor los datos 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.toString());
            //return false;
        }
        return ListaCargoEmpleado;
    }
}
