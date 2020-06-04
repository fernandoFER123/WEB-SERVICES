package conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    public Connection connectDatabase() throws ClassNotFoundException{
        
        Connection connection = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            String root = null;
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sistemas",root,"");
            
        } catch (SQLException ex){
         System.out.print("ERROR conexion.Conexion.connectDatabase()"+ex.getMessage());           
                    }
        return connection;            
        }
    }
        
