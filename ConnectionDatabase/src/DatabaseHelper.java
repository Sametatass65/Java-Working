import javax.sql.ConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
    private String userName = "root";
    private String userPassword = "123456";
    private String dbUrl = "jdbc:mysql://localhost:3306/java";

    public Connection connection()throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,userPassword);
    }
    public void showErrorMessage(SQLException exception)
    {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: "+ exception.getErrorCode());
    }


}
