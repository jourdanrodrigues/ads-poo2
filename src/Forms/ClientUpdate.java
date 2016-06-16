/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Client;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jourdanrodrigues
 */
public class ClientUpdate extends javax.swing.JFrame {
    String userName, clientId;
    int isManager;

    /**
     * Creates new form ClientUpdate
     */
    public ClientUpdate() {
        initComponents();
    }
    
    public ClientUpdate(String userName, int isManager, String clientId) {
        try {
            this.userName = userName;
            this.isManager = isManager;
            this.clientId = clientId;

            initComponents();
        
            UserNameLabel.setText(userName + ".");
            
            Map<String, String> map = Client.getClient(clientId);
        
            CPFTextField.setText(map.get("cpf"));
            EmailTextField.setText(map.get("email"));
            PhoneTextField.setText(map.get("phone"));
            RGTextField.setText(map.get("rg"));
            NameTextField.setText(map.get("fullName"));
            CityTextField.setText(map.get("city"));
            StateTextField.setText(map.get("state"));
            CNHTextField.setText(map.get("cnh"));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro:\n" + ex.getMessage());
            new ClientList(userName, isManager).setVisible(true);
            dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CNHLabel = new javax.swing.JLabel();
        CPFLabel = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        CPFTextField = new javax.swing.JTextField();
        CNHTextField = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        PhoneTextField = new javax.swing.JTextField();
        UserNameLabel = new javax.swing.JLabel();
        RGLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        RGTextField = new javax.swing.JTextField();
        TopLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        FullNameLabel = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        StateProvinceLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        StateTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CNHLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CNHLabel.setText("CNH");

        CPFLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CPFLabel.setText("CPF");

        UpdateButton.setText("ATUALIZAR");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        CPFTextField.setToolTipText("Somente números");
        CPFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFTextFieldActionPerformed(evt);
            }
        });

        CNHTextField.setToolTipText("Seu nome de usuário");
        CNHTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNHTextFieldActionPerformed(evt);
            }
        });

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhoneLabel.setText("TELEFONE");

        BackButton.setText("Voltar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        PhoneTextField.setToolTipText("Somente números");
        PhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextFieldActionPerformed(evt);
            }
        });

        UserNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        UserNameLabel.setText("Não conseguimos obter seu nome.");

        RGLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RGLabel.setText("RG");

        LogoutButton.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        RGTextField.setToolTipText("Somente números");
        RGTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGTextFieldActionPerformed(evt);
            }
        });

        TopLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TopLabel.setText("Atualização de Cliente");

        CityLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CityLabel.setText("CIDADE");

        FullNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FullNameLabel.setText("NOME COMPLETO");

        CityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTextFieldActionPerformed(evt);
            }
        });

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        StateProvinceLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StateProvinceLabel.setText("ESTADO");

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EmailLabel.setText("EMAIL");

        StateTextField.setToolTipText("Seu nome de usuário");
        StateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FullNameLabel)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmailLabel)
                                .addComponent(EmailTextField)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CPFLabel))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RGLabel))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CityLabel)
                                    .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StateProvinceLabel))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CNHLabel)
                            .addComponent(CNHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(UpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TopLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LogoutButton)
                        .addComponent(UserNameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TopLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullNameLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFLabel)
                    .addComponent(PhoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RGLabel)
                    .addComponent(CityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StateProvinceLabel)
                    .addComponent(CNHLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        try {
            Map<String, String> map = new HashMap<>();

            map.put("cpf", CPFTextField.getText());
            map.put("email", EmailTextField.getText());
            map.put("phone", PhoneTextField.getText());
            map.put("rg", RGTextField.getText());
            map.put("fullName", NameTextField.getText());
            map.put("city", CityTextField.getText());
            map.put("state", StateTextField.getText());
            map.put("cnh", CNHTextField.getText());
            map.put("id", this.clientId);

            Client client = new Client(map);
            String [] operationResponse = client.updateClient();

            JOptionPane.showMessageDialog(null, operationResponse[1]);

            if (operationResponse[0].equals("success")){
                new ClientList(this.userName, this.isManager).setVisible(true);
                dispose();
            }
        }
        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void CPFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFTextFieldActionPerformed

    private void CNHTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNHTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNHTextFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new ClientList(this.userName, this.isManager).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextFieldActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void RGTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RGTextFieldActionPerformed

    private void CityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTextFieldActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void StateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CNHLabel;
    private javax.swing.JTextField CNHTextField;
    private javax.swing.JLabel CPFLabel;
    private javax.swing.JTextField CPFTextField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JLabel RGLabel;
    private javax.swing.JTextField RGTextField;
    private javax.swing.JLabel StateProvinceLabel;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UserNameLabel;
    // End of variables declaration//GEN-END:variables
}
