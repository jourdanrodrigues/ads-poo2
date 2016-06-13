/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jourdanrodrigues
 */
public class Client {
    public String fullName, email, cpf, phone, rg, city, state, cnh;
    
    public Client(Map<String, String> map) {
        
        if (map.get("cpf").isEmpty() ||
                map.get("fullName").isEmpty() ||
                map.get("email").isEmpty() ||
                map.get("phone").isEmpty() ||
                map.get("rg").isEmpty() ||
                map.get("city").isEmpty() ||
                map.get("state").isEmpty() ||
                map.get("cnh").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");

        // RegEx for email
        Matcher m = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}").matcher(map.get("email"));
        if (!m.find())
            throw new IllegalArgumentException("Email inválido!");
        
        this.cpf = map.get("cpf");
        this.fullName = map.get("fullName");
        this.email = map.get("email");
        this.phone = map.get("phone");
        this.rg = map.get("rg");
        this.city = map.get("city");
        this.state = map.get("state");
        this.cnh = map.get("cnh");
    }
    
    public String[] registerClient(){
        
        String[] data = new String[2];
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Poo2Homework", "root", "");
            
            String query = "insert into Cliente "
                    + "(nomeCompleto, email, cpf, telefone, rg, cidade, estado, cnh)"
                    + " values (?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, fullName);
            stmt.setString(2, email);
            stmt.setString(3, cpf);
            stmt.setString(4, phone);
            stmt.setString(5, rg);
            stmt.setString(6, city);
            stmt.setString(7, state);
            stmt.setString(8, cnh);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Cliente \"" + fullName + "\" cadastrado com sucesso!";
            return data;
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
           return data;
        }
        
    }
}
