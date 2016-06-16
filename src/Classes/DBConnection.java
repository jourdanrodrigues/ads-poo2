/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jourdanrodrigues
 */
public class DBConnection {
    String
            host = "jdbc:mysql://localhost/Poo2Homework",
            user = "root",
            password = "";
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(this.host, this.user, this.password);
    }
}
