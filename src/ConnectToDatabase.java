
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectToDatabase {
    public static String query;
    //private String dbUrl= "jdbc:sqlserver://MBS\\MSSQLSERVER;databaseName=SearchApplication";
    public static void main(String[] args) throws SQLException {  
        
        try {
            query= "deneme";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            String connectionUrl = "jdbc:sqlserver://MBS;databaseName=searchapplication;integratedSecurity=true;trustServerCertificate=true;"; 
            Connection connection = DriverManager.getConnection(connectionUrl);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
}
    

