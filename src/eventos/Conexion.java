
package eventos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Conexion {
    public Connection conexionDB;
    
    
    public Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String DB = "jdbc:oracle:thin:@localhost:1521/XEPDB1";                      //Agregamos nuestra conexion a la base de datos
            conexionDB = DriverManager.getConnection(DB, "USR_CAFETERIA", "PassCafe");  //Passamos el usuario y la contraseña a nuestro sistemapara autentnticacion
            return conexionDB;      //Regresamos la conexion 
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
