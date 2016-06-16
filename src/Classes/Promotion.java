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
import java.util.regex.Matcher;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public class Promotion {
    float descount;
    int promotionId, vehicleId;
    String endDate;
    
    public Promotion(Map<String, String> map) {
        
        if (map.get("descount").isEmpty() ||
                map.get("vehicleId").isEmpty() ||
                map.get("endDate").isEmpty())
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        
        Matcher m = checkDate(map.get("endDate"));
        
        map.put("endDate", m.group(3) + "-" + m.group(2) + "-" + m.group(1));
        
        this.descount = Float.parseFloat(map.get("descount").replace(",", "."));
        this.vehicleId = Integer.parseInt(map.get("vehicleId"));
        this.endDate = map.get("endDate");
        if (map.containsKey("id"))
            this.promotionId = Integer.parseInt(map.get("id"));
    }
    
    public String[] registerPromotion(){
        
        String[] data = new String[2];
        
        try {
            Connection con = DBConnection.getConnection();
            
            String query = "insert into Promocao "
                    + "(desconto_perc, veiculo_id, data_limite)"
                    + " values (?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setFloat(1, descount);
            stmt.setInt(2, vehicleId);
            stmt.setString(3, endDate);
            
            stmt.executeUpdate();
            
            stmt.close();
            con.close();
            
            data[0] = "success";
            data[1] = "Promoção para o veículo \"" + Vehicle.getVehicleIdentification(vehicleId)
                    + "\" cadastrado com sucesso!";
            return data;
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            data[0] = "error";
            data[1] = "Ocorreu o seguinte erro:\n" + ex.getMessage();
           return data;
        }
        
    }
            
    public static void getPromotionList(DefaultTableModel table) throws SQLException{

        try {
            Connection con = DBConnection.getConnection();

            String query = "select * from Promocao where data_limite >= CURDATE()";
            
            PreparedStatement stmt = con.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            table.setNumRows(0);

            while (rs.next())
                table.addRow(new Object[] {
                    rs.getString("id"),
                    rs.getString("desconto_perc"),
                    rs.getString("data_limite"),
                    Vehicle.getVehicleIdentification(Integer.parseInt(rs.getString("veiculo_id")))
                });

        } catch (SQLException | ClassNotFoundException ex) {
           throw new SQLException(ex.getMessage());
        }
    }
}
