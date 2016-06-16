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
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public class Vehicle {
    String model, manufacturer, color, chassis;
    int year;
    float price;
    
    public Vehicle(Map<String, String> map) {
        
        if (map.get("model").isEmpty() ||
                map.get("manufacturer").isEmpty() ||
                map.get("color").isEmpty() ||
                map.get("chassis").isEmpty() ||
                map.get("year").isEmpty() ||
                map.get("price").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        this.model = map.get("model");
        this.manufacturer = map.get("manufacturer");
        this.color = map.get("color");
        this.chassis = map.get("chassis");
        this.year = Integer.parseInt(map.get("year"));
        this.price = Float.parseFloat(map.get("price").replace(",", "."));
    }
    
    public String[] registerVehicle(){
        
        String[] data = new String[2];
        
        try {
            Connection con = new DBConnection().getConnection();
            
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
            
    public static void getVehicleList(String modelOrChassi, DefaultTableModel table) throws SQLException{

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Poo2Homework", "root", "");

            modelOrChassi = modelOrChassi.toLowerCase();
            boolean withFilter = !modelOrChassi.isEmpty();

            String query = "select modelo, cor, chassi, preco from Veiculo";
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
