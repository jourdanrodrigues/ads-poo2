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
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jourdanrodrigues
 */
public class Employee {
    public String userName, email, cpf, phone, rg, address, login, password, pisNumber;
    public int isManager;
    
    public Employee(Map<String, String> map){
        
        if (map.get("cpf").isEmpty() ||
                map.get("userName").isEmpty() ||
                map.get("password").isEmpty() ||
                map.get("email").isEmpty() ||
                map.get("phone").isEmpty() ||
                map.get("rg").isEmpty() ||
                map.get("address").isEmpty() ||
                map.get("login").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        
        if (!map.get("password").equals(map.get("passwordConfirmation")))
            throw new IllegalArgumentException("Senhas não conferem!");

        // RegEx for email
        Matcher m = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}").matcher(map.get("email"));
        if (!m.find())
            throw new IllegalArgumentException("Email inválido!");
        
        userName = map.get("userName");
        email = map.get("email");
        cpf = map.get("cpf");
        phone = map.get("phone");
        rg = map.get("rg");
        address = map.get("address");
        login = map.get("login");
        password = map.get("password");
        pisNumber = map.get("pisNumber");
        isManager = Integer.parseInt(map.get("isManager"));
    }
    
    public String[] registerEmployee(){
        
        String[] data = new String[2];
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Poo2Homework", "root", "");
            
            String query = "insert into Funcionario "
                    + "(nome, email, cpf, telefone, rg, endereco, login, senha, gerente)"
                    + " values (?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, userName);
            stmt.setString(2, email);
            stmt.setString(3, cpf);
            stmt.setString(4, phone);
            stmt.setString(5, rg);
            stmt.setString(6, address);
            stmt.setString(7, login);
            stmt.setString(8, password);
            stmt.setInt(9, isManager);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Usuário \"" + userName + "\" cadastrado com sucesso!";
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex;
        }
        
        return data;
    }
}
