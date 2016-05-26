import Forms.FormLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) {
        new FormLogin().setVisible(true);
    }
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/Poo2Homework", "root", "");
    }
}