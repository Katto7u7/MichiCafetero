
package conexiones;

import clases.Login;
import eventos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginConexion {
    Conexion cnc = new Conexion();
    Connection con;
    PreparedStatement PS;
    ResultSet ObtenerResultadoLogin;
    
    
    public Login log(String user, String pass){
        Login login = new Login();
        String sql = "SELECT * FROM USR_CAFETERIA.EMPLEADO WHERE USUARIO=? AND CONTRASENIA=?";
        try{
            con=cnc.getConnection();
            PS=con.prepareStatement(sql);
            PS.setString(1, user);
            PS.setString(2, pass);
            ObtenerResultadoLogin=PS.executeQuery();
            if(ObtenerResultadoLogin.next()){
                login.setUser(ObtenerResultadoLogin.getString("USUARIO"));
                login.setNombre(ObtenerResultadoLogin.getString("NOMBRE"));
                login.setCargo(ObtenerResultadoLogin.getString("CORREO"));
                login.setPass(ObtenerResultadoLogin.getString("CONTRASENIA"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion 11" + e.toString());
        }
        return login;
    }
    
    
}
