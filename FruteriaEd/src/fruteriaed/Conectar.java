package fruteriaed;


import java.sql.Connection;
import java.sql.DriverManager;
 
public class Conectar {
  
    public static final String URL = "jdbc:oracle:thin:@//localhost:1521/pruebas_bd";
    public static final String USER = "C#_admin";
    public static final String CLAVE = "admin";
      
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysq l.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}