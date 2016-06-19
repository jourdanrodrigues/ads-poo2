/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.Utils.checkDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public class Sale {
    int vehicleId, employeeId, clientId, promotionId = -1;
    String paymentForm, additionalServices;
    Date date;
    float value;
    
    public Sale(Map<String, String> map) throws SQLException{
        
        boolean gotPromotion = map.containsKey("promotionId");
        
        if (map.get("vehicleId").isEmpty() ||
                map.get("employeeId").isEmpty() ||
                map.get("clientId").isEmpty() ||
                (gotPromotion && map.get("promotionId").isEmpty()) ||
                map.get("paymentForm").isEmpty() ||
                !map.containsKey("additionalServices"))
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        vehicleId = Integer.parseInt(map.get("vehicleId"));
        employeeId = Integer.parseInt(map.get("employeeId"));
        clientId = Integer.parseInt(map.get("clientId"));
        paymentForm = map.get("paymentForm");
        additionalServices = map.get("additionalServices");
        date = new Date();
        
        try {
            Connection con = DBConnection.getConnection();

            String query = "select " + (gotPromotion ? "Promocao.desconto_perc, " : "")
                    + "Veiculo.preco from Veiculo";
            query += (gotPromotion ? " join Promocao on Veiculo.id = Promocao.veiculo_id" : "");
            query += " where Veiculo.id = ?" + (gotPromotion ? " and Promocao.id = ?": "");
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, vehicleId);
            
            if (gotPromotion) {
                promotionId = Integer.parseInt(map.get("promotionId"));
                stmt.setInt(2, promotionId);
            }
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                value = rs.getFloat("Veiculo.preco");
                if (gotPromotion) value *= rs.getFloat("Promocao.desconto_perc") / 100;
            }
            
            stmt.close();
            con.close();

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
    
    public String[] closeSale(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            boolean gotPromotion = promotionId != -1;
            
            String query = "insert into Venda"
                    + " (veiculo_id, funcionario_id, cliente_id, forma_pagamento,"
                    + " data, servicos_adicionais, valor"
                    + (gotPromotion ? ", promocao_id" : "")
                    + ") values (?,?,?,?,?,?,?"
                    + (gotPromotion ? ",?" : "")
                    + ")";
            
            PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setInt(1, vehicleId);
            stmt.setInt(2, employeeId);
            stmt.setInt(3, clientId);
            stmt.setString(4, paymentForm);
            stmt.setDate(5, new java.sql.Date(date.getTime()));
            stmt.setString(6, additionalServices);
            stmt.setFloat(7, value);
            if (gotPromotion)
                stmt.setInt(8, promotionId);
            
            stmt.executeUpdate();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    data[0] = "success";
                    data[1] = "Venda de número " + generatedKeys.getLong(1)
                            + " finalizada com sucesso!";
                    
                    boolean vehicleUpdated = false;
                    while (!vehicleUpdated)
                        vehicleUpdated = Vehicle.sold(vehicleId);
                }
                else {
                    data[0] = "error";
                    data[1] = "Ocorreu um erro e a venda não foi cadastrada";
                }
            }
            
            stmt.close();
            con.close();
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
        }
        
        return data;
    }
    
    public static boolean hasPromotions(int vehicleId, DefaultTableModel table) throws SQLException{

        try {
            Connection con = DBConnection.getConnection();

            String query = "select * from Promocao where data_limite >= CURDATE() and veiculo_id = ?";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, vehicleId);
            
            ResultSet rs = stmt.executeQuery();
            
            table.setNumRows(0);
            
            boolean gotAnyPromotion = false;
            
            while (rs.next()) {
                gotAnyPromotion = true;
                table.addRow(new Object[] {
                    rs.getString("id"),
                    rs.getString("desconto_perc"),
                    rs.getString("data_limite"),
                    Vehicle.getVehicleIdentification(Integer.parseInt(rs.getString("veiculo_id")))
                });
            }
            
            return gotAnyPromotion;

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
}
