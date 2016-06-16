/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public class Employee {
    public String userName, email, cpf, phone, rg, address, login, password, pisNumber;
    public int isManager, id;
    
    public Employee(Map<String, String> map){
        
        if (map.get("cpf").isEmpty() ||
                map.get("userName").isEmpty() ||
                map.get("pisNumber").isEmpty() ||
                map.get("email").isEmpty() ||
                map.get("phone").isEmpty() ||
                map.get("rg").isEmpty() ||
                map.get("address").isEmpty() ||
                map.get("login").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        Boolean gotPassword = map.containsKey("password");
        
        if (gotPassword && !map.get("password").equals(map.get("passwordConfirmation")))
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
        pisNumber = map.get("pisNumber");
        isManager = Integer.parseInt(map.get("isManager"));
        if (gotPassword)
            password = map.get("password");
        if (map.containsKey("id"))
            this.id = Integer.parseInt(map.get("id"));
    }
    
    public String[] registerEmployee(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            String query = "insert into Funcionario "
                    + "(nome, email, cpf, telefone, rg, endereco, login, senha, gerente, numeroPis)"
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
            stmt.setString(10, pisNumber);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Usuário \"" + userName + "\" cadastrado com sucesso!";
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
        }
        
        return data;
    }
    
    public String[] updateEmployee(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            String query = "update Funcionario"
                    + " set nome=?, email=?, cpf=?,"
                    + " telefone=?, rg=?, endereco=?, numeroPis=?, login=?, gerente=?"
                    + " where id=?";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, userName);
            stmt.setString(2, email);
            stmt.setString(3, cpf);
            stmt.setString(4, phone);
            stmt.setString(5, rg);
            stmt.setString(6, address);
            stmt.setString(7, pisNumber);
            stmt.setString(8, login);
            stmt.setInt(9, isManager);
            stmt.setInt(10, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Funcionário \"" + userName + "\" atualizado com sucesso!";
            return data;
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
           return data;
        }
        
    }
            
    public static Map<String, String> getEmployee(String employeeId) throws SQLException{

        try {
            Connection con = DBConnection.getConnection();

            employeeId = employeeId.toLowerCase();

            String query = "select * from Funcionario where id = ?";

            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setInt(1, Integer.parseInt(employeeId));

            ResultSet rs = stmt.executeQuery();
            
            Map<String, String> map = new HashMap<>();

            while (rs.next()) {
                map.put("userName", rs.getString("nome"));
                map.put("rg", rs.getString("rg"));
                map.put("cpf", rs.getString("cpf"));
                map.put("email", rs.getString("email"));
                map.put("pisNumber", rs.getString("numeroPis"));
                map.put("phone", rs.getString("telefone"));
                map.put("address", rs.getString("endereco"));
                map.put("login", rs.getString("login"));
                map.put("isManager", rs.getString("gerente"));
            }
            
            return map;

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
    
    public static void getEmployeeList(String employeeName, DefaultTableModel table) throws SQLException{

        try {
            Connection con = DBConnection.getConnection();

            employeeName = employeeName.toLowerCase();
            boolean withFilter = !employeeName.isEmpty();

            String query = "select id, nome from Funcionario";
            query += withFilter ? " where lower(nome) like ?" : "";

            PreparedStatement stmt = con.prepareStatement(query);

            if (withFilter) stmt.setString(1, "%" + employeeName + "%");

            ResultSet rs = stmt.executeQuery();
            
            table.setNumRows(0);
            
            while (rs.next())
                table.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("nome")
                });

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
}
