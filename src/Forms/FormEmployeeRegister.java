/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Employee;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jourdanrodrigues
 */
public class FormEmployeeRegister extends javax.swing.JFrame {
    String userName, from;
    int isManager;

    /**
     * Creates new form FormRegister
     */
    public FormEmployeeRegister() {
        initComponents();
    }
    
    public FormEmployeeRegister(String userName, int isManager, String from){
        this.userName = userName;
        this.isManager = isManager;
        this.from = from;
        
        initComponents();
        
        UserNameLabel.setText(userName + ".");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
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
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        PasswordConfirmationLabel = new javax.swing.JLabel();
        PasswordConfirmationField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        UserNameLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        IsManagerCheckBox = new javax.swing.JCheckBox();
        PisNumberLabel = new javax.swing.JLabel();
        PisNumberTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TopLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TopLabel.setText("Cadastro de Usuário");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameLabel.setText("NOME");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EmailLabel.setText("EMAIL");

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

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PasswordLabel.setText("SENHA");

        PasswordConfirmationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PasswordConfirmationLabel.setText("A SENHA, DE NOVO");

        RegisterButton.setText("CADASTRAR");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
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

        BackButton.setText("Voltar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        IsManagerCheckBox.setText("Usuário gerente");

        PisNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PisNumberLabel.setText("NÚMERO DO PIS");

        PisNumberTextField.setToolTipText("Seu nome de usuário");
        PisNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisNumberTextFieldActionPerformed(evt);
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
                .addContainerGap(39, Short.MAX_VALUE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PisNumberLabel)
                            .addComponent(AccessNameLabel)
                            .addComponent(AccessNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PisNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordLabel)
                            .addComponent(PasswordConfirmationLabel)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordConfirmationField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IsManagerCheckBox)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccessNameLabel)
                            .addComponent(PasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccessNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PasswordConfirmationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordConfirmationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PisNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PisNumberLabel)
                        .addGap(33, 33, 33)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IsManagerCheckBox))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

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

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        try {
            
            Map<String, String> map = new HashMap<>();

            map.put("cpf", CPFTextField.getText());
            map.put("password", new String(PasswordField.getPassword()));
            map.put("passwordConfirmation", new String(PasswordConfirmationField.getPassword()));
            map.put("email", EmailTextField.getText());
            map.put("phone", PhoneTextField.getText());
            map.put("rg", RGTextField.getText());
            map.put("userName", NameTextField.getText());
            map.put("address", AddressTextField.getText());
            map.put("pisNumber", PisNumberTextField.getText());
            map.put("login", AccessNameTextField.getText());
            map.put("isManager", IsManagerCheckBox.isSelected() ? "1" : "0");

            Employee employee = new Employee(map);
            String[] operationResponse = employee.registerEmployee();
            
            JOptionPane.showMessageDialog(null, operationResponse[1]);

            if (operationResponse[0].equals("success")) {
                new MainView(this.userName, this.isManager).setVisible(true);
                dispose();
            }
        
        }
        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        if (this.from.equals("fromMainView"))
            new MainView(this.userName, this.isManager).setVisible(true);
        else if (this.from.equals("fromFormEmployeeList"))
            new FormEmployeeList(this.userName, this.isManager).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PisNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PisNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PisNumberTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FormEmployeeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmployeeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmployeeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmployeeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmployeeRegister().setVisible(true);
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
    private javax.swing.JPasswordField PasswordConfirmationField;
    private javax.swing.JLabel PasswordConfirmationLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JLabel PisNumberLabel;
    private javax.swing.JTextField PisNumberTextField;
    private javax.swing.JLabel RGLabel;
    private javax.swing.JTextField RGTextField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JLabel UserNameLabel;
    // End of variables declaration//GEN-END:variables
}
