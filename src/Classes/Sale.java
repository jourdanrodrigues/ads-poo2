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
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public class Sale {
    int vehicleId, employeeId, clientId, promotionId;
    String paymentForm, additionalServices, date;
    float value;
    
    public Sale(Map<String, String> map){
        
        boolean gotPromotion = map.containsKey("promotionId");
        
        if (map.get("vehicleId").isEmpty() ||
                map.get("employeeId").isEmpty() ||
                map.get("clientId").isEmpty() ||
                (gotPromotion && map.get("promotionId").isEmpty()) ||
                map.get("paymentForm").isEmpty() ||
                map.get("additionalServices").isEmpty() ||
                map.get("date").isEmpty() ||
                map.get("value").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        checkDate(map.get("date"));
        
        vehicleId = Integer.parseInt(map.get("vehicleId"));
        employeeId = Integer.parseInt(map.get("employeeId"));
        clientId = Integer.parseInt(map.get("clientId"));
        paymentForm = map.get("paymentForm");
        additionalServices = map.get("additionalServices");
        date = map.get("date");
        value = Float.parseFloat(map.get("value").replace(",", "."));
    }
    
    public String[] closeSale(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            boolean gotPromotion = promotionId == -1;
            
            String query = "insert into Venda"
                    + " (veiculo_id, funcionario_id, cliente_id, forma_pagamento,"
                    + " data, servicos_adicionais, valor"
                    + (gotPromotion ? ", promocao_id" : "")
                    + ") values (?,?,?,?,?,?,?"
                    + (gotPromotion ? ",?" : "")
                    + ")";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, vehicleId);
            stmt.setInt(2, employeeId);
            stmt.setInt(3, clientId);
            stmt.setString(4, paymentForm);
            stmt.setString(5, date);
            stmt.setString(6, additionalServices);
            stmt.setFloat(7, value);
            if (gotPromotion)
                stmt.setInt(8, promotionId);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    data[0] = "success";
                    data[1] = "Venda de número " + generatedKeys.getLong(1)
                            + " finalizada com sucesso!";
                }
                else {
                    data[0] = "error";
                    data[1] = "Ocorreu o seguinte erro:\nVenda não cadastrada";
                }
            }
            
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
