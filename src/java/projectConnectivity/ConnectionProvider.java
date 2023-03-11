
package projectConnectivity;

/**
 *
 * @author nikhil
 */
import java.sql.*;
import java.sql.Connection;
public class ConnectionProvider {
    public static Connection getCon(){
      try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapplication","root","");
       return con;
      }catch(Exception e){
          return null;
      }  
    }
 }
