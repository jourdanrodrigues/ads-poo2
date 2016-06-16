
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public class Vehicle {
    String model, manufacturer, color, chassis;
    int year, vehicleId;
    float price;
    
    public Vehicle(Map<String, String> map) {
        
        if (map.get("model").isEmpty() ||
                map.get("manufacturer").isEmpty() ||
                map.get("color").isEmpty() ||
                map.get("chassis").isEmpty() ||
                map.get("year").isEmpty() ||
                map.get("price").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        if (map.get("chassis").length() != 17)
            throw new IllegalArgumentException("O chassi deve conter 17 caracteres!");
        
        this.model = map.get("model");
        this.manufacturer = map.get("manufacturer");
        this.color = map.get("color");
        this.chassis = map.get("chassis");
        this.year = Integer.parseInt(map.get("year"));
        this.price = Float.parseFloat(map.get("price").replace(",", "."));
        if (map.containsKey("id"))
            this.vehicleId = Integer.parseInt(map.get("id"));
    }
    
    public static String getVehicleIdentification(int vehicleId) throws SQLException {
        
        try {
            Connection con = DBConnection.getConnection();

            String query = "select modelo, ano, cor from Veiculo where id = ?";

            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setInt(1, vehicleId);

            ResultSet rs = stmt.executeQuery();
            
            String vehicleIdentification = "";

            while (rs.next())
                vehicleIdentification = rs.getString("modelo") + " " + rs.getString("ano") + " " + rs.getString("cor");
            
            return vehicleIdentification;

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
    
    public String[] registerVehicle(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            String query = "insert into Veiculo "
                    + "(modelo, fabricante, cor, chassi, ano, preco)"
                    + " values (?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, model);
            stmt.setString(2, manufacturer);
            stmt.setString(3, color);
            stmt.setString(4, chassis);
            stmt.setInt(5, year);
            stmt.setFloat(6, price);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Veículo \"" + model + " " + year + " " + color +
                    "\" cadastrado com sucesso!";
            return data;
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
           return data;
        }
        
    }
    
    public String[] updateVehicle(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            String query = "update Veiculo"
                    + " set modelo=?, cor=?, fabricante=?,"
                    + " chassi=?, ano=?, preco=?"
                    + " where id=?";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, model);
            stmt.setString(2, color);
            stmt.setString(3, manufacturer);
            stmt.setString(4, chassis);
            stmt.setInt(5, year);
            stmt.setFloat(6, price);
            stmt.setInt(7, vehicleId);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Veículo \"" + model + " " + year + " " + color +
                    "\" atualizado com sucesso!";
            return data;
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
           return data;
        }
        
    }
            
    public static Map<String, String> getVehicle(String vehicleId) throws SQLException{

        try {
            Connection con = DBConnection.getConnection();

            vehicleId = vehicleId.toLowerCase();

            String query = "select * from Veiculo where id = ?";

            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setInt(1, Integer.parseInt(vehicleId));

            ResultSet rs = stmt.executeQuery();
            
            Map<String, String> map = new HashMap<>();

            while (rs.next()) {
                map.put("model", rs.getString("modelo"));
                map.put("chassis", rs.getString("chassi"));
                map.put("color", rs.getString("cor"));
                map.put("manufacturer", rs.getString("fabricante"));
                map.put("year", rs.getString("ano"));
                map.put("price", String.format("%.2f", Float.parseFloat(rs.getString("preco"))));
            }
            
            return map;

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
            
    public static void getVehicleList(String modelOrChassi, DefaultTableModel table) throws SQLException{

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Poo2Homework", "root", "");

            modelOrChassi = modelOrChassi.toLowerCase();
            boolean withFilter = !modelOrChassi.isEmpty();

            String query = "select id, modelo, cor, chassi, preco from Veiculo";
            query += withFilter ? " where lower(modelo) like ? or lower(chassi) like ?" : "";

            PreparedStatement stmt = con.prepareStatement(query);

            if (withFilter){
                stmt.setString(1, "%" + modelOrChassi + "%");
                stmt.setString(2, modelOrChassi + "%");
            }

            ResultSet rs = stmt.executeQuery();
            
            table.setNumRows(0);

            while (rs.next())
                table.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("modelo"),
                    rs.getString("cor"),
                    rs.getString("chassi"),
                    String.format("%.2f", Float.parseFloat(rs.getString("preco")))
                });

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
}
