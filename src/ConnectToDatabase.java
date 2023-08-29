import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabase {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://MBS;databaseName=searchapplication;integratedSecurity=true;trustServerCertificate=true;";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(connectionUrl);
            
            // Using Statement (not recommended for dynamic values)
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Cars";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String carName = resultSet.getString("CarName");
                // ... Retrieve other columns
                
                // Process the retrieved data
                System.out.println("Car Name: " + carName);
                // ... Process other columns
                
                System.out.println("-----------------------");
            }
            
            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
