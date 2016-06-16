/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Employee;

import Forms.Client.ClientList;
import Classes.Employee;
import Forms.Login;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jourdanrodrigues
 */
public class EmployeeUpdate extends javax.swing.JFrame {
    String userName, employeeId;
    int isManager;

    /**
     * Creates new form EmployeeUpdate
     */
    public EmployeeUpdate() {
        initComponents();
    }
    
    public EmployeeUpdate(String userName, int isManager, String employeeId) {
        try {
            this.userName = userName;
            this.isManager = isManager;
            this.employeeId = employeeId;

            initComponents();
        
            UserNameLabel.setText(userName + ".");
            
            Map<String, String> map = Employee.getEmployee(employeeId);
        
            CPFTextField.setText(map.get("cpf"));
            EmailTextField.setText(map.get("email"));
            PhoneTextField.setText(map.get("phone"));
            RGTextField.setText(map.get("rg"));
            NameTextField.setText(map.get("userName"));
            AddressTextField.setText(map.get("address"));
            PisNumberTextField.setText(map.get("pisNumber"));
            AccessNameTextField.setText(map.get("login"));
            IsManagerCheckBox.setSelected(map.get("isManager").equals("1"));
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

        UpdateButton = new javax.swing.JButton();
        UserNameLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        TopLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        IsManagerCheckBox = new javax.swing.JCheckBox();
        NameTextField = new javax.swing.JTextField();
        PisNumberLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PisNumberTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        CPFLabel = new javax.swing.JLabel();
        CPFTextField = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        PhoneTextField = new javax.swing.JTextField();
        RGLabel = new javax.swing.JLabel();
        RGTextField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        AccessNameLabel = new javax.swing.JLabel();
        AccessNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpdateButton.setText("ATUALIZAR");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        UserNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        UserNameLabel.setText("Não conseguimos obter seu nome.");

        LogoutButton.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        TopLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TopLabel.setText("Atualização de Usuário");

        BackButton.setText("Voltar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameLabel.setText("NOME");

        IsManagerCheckBox.setText("Usuário gerente");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        PisNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PisNumberLabel.setText("NÚMERO DO PIS");

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EmailLabel.setText("EMAIL");

        PisNumberTextField.setToolTipText("Seu nome de usuário");
        PisNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisNumberTextFieldActionPerformed(evt);
            }
        });

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        CPFLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CPFLabel.setText("CPF");

        CPFTextField.setToolTipText("Somente números");
        CPFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFTextFieldActionPerformed(evt);
            }
        });

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhoneLabel.setText("TELEFONE");

        PhoneTextField.setToolTipText("Somente números");
        PhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextFieldActionPerformed(evt);
            }
        });

        RGLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RGLabel.setText("RG");

        RGTextField.setToolTipText("Somente números");
        RGTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGTextFieldActionPerformed(evt);
            }
        });

        AddressLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddressLabel.setText("ENDEREÇO");

        AddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextFieldActionPerformed(evt);
            }
        });

        AccessNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AccessNameLabel.setText("NOME DE ACESSO (LOGIN)");

        AccessNameTextField.setToolTipText("Seu nome de usuário");
        AccessNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessNameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailLabel)
                            .addComponent(EmailTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPFLabel))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RGLabel))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressLabel)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IsManagerCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccessNameLabel)
                            .addComponent(AccessNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PisNumberLabel)
                            .addComponent(PisNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TopLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutButton)
                    .addComponent(UserNameLabel)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(TopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PisNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel)
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
                            .addComponent(AddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AccessNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccessNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PisNumberLabel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IsManagerCheckBox))
                .addContainerGap(29, Short.MAX_VALUE))
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
            map.put("userName", NameTextField.getText());
            map.put("address", AddressTextField.getText());
            map.put("pisNumber", PisNumberTextField.getText());
            map.put("login", AccessNameTextField.getText());
            map.put("id", this.employeeId);
            map.put("isManager", IsManagerCheckBox.isSelected() ? "1" : "0");

            Employee employee = new Employee(map);
            String [] operationResponse = employee.updateEmployee();

            JOptionPane.showMessageDialog(null, operationResponse[1]);

            if (operationResponse[0].equals("success")){
                new EmployeeList(this.userName, this.isManager).setVisible(true);
                dispose();
            }
        }
        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new EmployeeList(this.userName, this.isManager).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void PisNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PisNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PisNumberTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void CPFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFTextFieldActionPerformed

    private void PhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextFieldActionPerformed

    private void RGTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RGTextFieldActionPerformed

    private void AddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextFieldActionPerformed

    private void AccessNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccessNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccessNameLabel;
    private javax.swing.JTextField AccessNameTextField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CPFLabel;
    private javax.swing.JTextField CPFTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JCheckBox IsManagerCheckBox;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JLabel PisNumberLabel;
    private javax.swing.JTextField PisNumberTextField;
    private javax.swing.JLabel RGLabel;
    private javax.swing.JTextField RGTextField;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UserNameLabel;
    // End of variables declaration//GEN-END:variables
}