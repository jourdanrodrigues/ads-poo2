/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Jourdan Rodrigues
 */
public class MainView extends javax.swing.JFrame {
    String userName;
    int isManager;

    /**
     * Creates new form FormPrincipal
     */
    public MainView() {
        initComponents();
    }
    
    public MainView(String userName, int isManager) {
        this.userName = userName;
        this.isManager = isManager;
        
        initComponents();
        
        UserNameLabel.setText(userName + ".");
        
        if (isManager == 0) {  // If the user isn't Manager
            EmployeeLabel.setVisible(false);
            SearchEmployeesButton.setVisible(false);
            RegisterEmployeeButton.setVisible(false);
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

        VehicleLabel = new javax.swing.JLabel();
        ClientLabel = new javax.swing.JLabel();
        EmployeeLabel = new javax.swing.JLabel();
        PromotionLabel = new javax.swing.JLabel();
        SearchClientsButton = new javax.swing.JButton();
        SearchVehiclesButton = new javax.swing.JButton();
        SearchEmployeesButton = new javax.swing.JButton();
        SearchPromotionButton = new javax.swing.JButton();
        RegisterClientButton = new javax.swing.JButton();
        RegisterVehiclesButton = new javax.swing.JButton();
        RegisterEmployeeButton = new javax.swing.JButton();
        RegisterPromotionButton = new javax.swing.JButton();
        TopLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VehicleLabel.setText("Veículos");

        ClientLabel.setText("Clientes");

        EmployeeLabel.setText("Funcionários");

        PromotionLabel.setText("Promoções");

        SearchClientsButton.setText("Pesquisar");
        SearchClientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchClientsButtonActionPerformed(evt);
            }
        });

        SearchVehiclesButton.setText("Pesquisar");
        SearchVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchVehiclesButtonActionPerformed(evt);
            }
        });

        SearchEmployeesButton.setText("Pesquisar");

        SearchPromotionButton.setText("Pesquisar");

        RegisterClientButton.setText("Cadastrar");
        RegisterClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterClientButtonActionPerformed(evt);
            }
        });

        RegisterVehiclesButton.setText("Cadastrar");
        RegisterVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterVehiclesButtonActionPerformed(evt);
            }
        });

        RegisterEmployeeButton.setText("Cadastrar");
        RegisterEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterEmployeeButtonActionPerformed(evt);
            }
        });

        RegisterPromotionButton.setText("Cadastrar");

        TopLabel.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        TopLabel.setText("SysLoCar");

        UserNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        UserNameLabel.setText("Não conseguimos obter seu nome.");

        LogoutButton.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientLabel)
                    .addComponent(VehicleLabel)
                    .addComponent(EmployeeLabel)
                    .addComponent(PromotionLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SearchClientsButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SearchVehiclesButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(SearchPromotionButton)
                    .addComponent(SearchEmployeesButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterClientButton)
                    .addComponent(RegisterVehiclesButton)
                    .addComponent(RegisterEmployeeButton)
                    .addComponent(RegisterPromotionButton))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutButton)
                    .addComponent(UserNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(TopLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchClientsButton)
                    .addComponent(RegisterClientButton)
                    .addComponent(ClientLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchVehiclesButton)
                    .addComponent(RegisterVehiclesButton)
                    .addComponent(VehicleLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchPromotionButton)
                    .addComponent(RegisterPromotionButton)
                    .addComponent(PromotionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchEmployeesButton)
                    .addComponent(RegisterEmployeeButton)
                    .addComponent(EmployeeLabel))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchClientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchClientsButtonActionPerformed
        new FormClientList(this.userName, this.isManager).setVisible(true);
        dispose();
    }//GEN-LAST:event_SearchClientsButtonActionPerformed

    private void RegisterVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterVehiclesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterVehiclesButtonActionPerformed

    private void SearchVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchVehiclesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchVehiclesButtonActionPerformed

    private void RegisterClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterClientButtonActionPerformed
        new FormClientRegister(this.userName, this.isManager, "fromMainView").setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterClientButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void RegisterEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterEmployeeButtonActionPerformed
        new FormRegister(this.userName, this.isManager).setVisible(true);
    }//GEN-LAST:event_RegisterEmployeeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JLabel EmployeeLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel PromotionLabel;
    private javax.swing.JButton RegisterClientButton;
    private javax.swing.JButton RegisterEmployeeButton;
    private javax.swing.JButton RegisterPromotionButton;
    private javax.swing.JButton RegisterVehiclesButton;
    private javax.swing.JButton SearchClientsButton;
    private javax.swing.JButton SearchEmployeesButton;
    private javax.swing.JButton SearchPromotionButton;
    private javax.swing.JButton SearchVehiclesButton;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel VehicleLabel;
    // End of variables declaration//GEN-END:variables
}
