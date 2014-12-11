package view;

import controller.SingInWindowController;
import javax.swing.JOptionPane;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class SingInWindow extends VentaOnline {


    public SingInWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPSingIn = new javax.swing.JPanel();
        jLTittleSingInWindow = new javax.swing.JLabel();
        jLUserName = new javax.swing.JLabel();
        jTFUserName = new javax.swing.JTextField();
        jLPassword = new javax.swing.JLabel();
        jBSingIN = new javax.swing.JButton();
        jBCancel = new javax.swing.JButton();
        jPFPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPSingIn.setBackground(new java.awt.Color(255, 255, 255));

        jLTittleSingInWindow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTittleSingInWindow.setForeground(new java.awt.Color(51, 51, 255));
        jLTittleSingInWindow.setText("INGRESAR AL SISTEMA");

        jLUserName.setBackground(new java.awt.Color(255, 255, 255));
        jLUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLUserName.setText("USUARIO");

        jLPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLPassword.setText("CONTRASEÑA");

        jBSingIN.setBackground(new java.awt.Color(255, 255, 255));
        jBSingIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBSingIN.setText("INGRESAR");
        jBSingIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSingINActionPerformed(evt);
            }
        });

        jBCancel.setBackground(new java.awt.Color(255, 255, 255));
        jBCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBCancel.setText("CANCELAR");
        jBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSingInLayout = new javax.swing.GroupLayout(jPSingIn);
        jPSingIn.setLayout(jPSingInLayout);
        jPSingInLayout.setHorizontalGroup(
            jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSingInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTittleSingInWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPSingInLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPSingInLayout.createSequentialGroup()
                        .addComponent(jBCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSingIN))
                    .addGroup(jPSingInLayout.createSequentialGroup()
                        .addGroup(jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLPassword)
                            .addComponent(jLUserName))
                        .addGap(18, 18, 18)
                        .addGroup(jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFUserName)
                            .addComponent(jPFPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPSingInLayout.setVerticalGroup(
            jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSingInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTittleSingInWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSingInLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLPassword))
                    .addGroup(jPSingInLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPSingInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSingIN)
                    .addComponent(jBCancel))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPSingIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPSingIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelActionPerformed
         restoreFatherWindow();
        
        this.dispose();
    }//GEN-LAST:event_jBCancelActionPerformed

    private void jBSingINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSingINActionPerformed
  
        if ( !"".equals(jTFUserName.getText()) && !"".equals(jPFPassword.getText()) )
        {
            initMyOwnComponents();
        
           if (SingInWindowController.checkLogin(jTFUserName.getText(),jPFPassword.getText()))
            {
                if ( (SingInWindowController.checkUserProfile(jTFUserName.getText(),jPFPassword.getText())).equals("Administrador") )
                {
                        SingInWindowController.clearOutlets(jTFUserName, jPFPassword);
                        
                        ManagerWindow managerWindow = new ManagerWindow();
                        managerWindow.setVisible(true);
                        managerWindow.setFatherWindow(this, true); 
                }
                else
                {
                    if  ( (SingInWindowController.checkUserProfile(jTFUserName.getText(),jPFPassword.getText())).equals("Administrador Inventario") )
                    {
                        SingInWindowController.clearOutlets(jTFUserName, jPFPassword);
                        
                        InventoryWindow inventoryWindow = new InventoryWindow();
                        inventoryWindow.setVisible(true);
                        inventoryWindow.setFatherWindow(this, true);
                    }
                    else
                    {
                        if  ( (SingInWindowController.checkUserProfile(jTFUserName.getText(),jPFPassword.getText())).equals("Usuario") )
                        {
                            SingInWindowController.clearOutlets(jTFUserName, jPFPassword);
                        
                            UserWindow userWindow = new UserWindow();
                            userWindow.setVisible(true);
                            userWindow.setFatherWindow(this, true);
                        }
                    }
                }       
            }
            else
                JOptionPane.showMessageDialog(this, "Inicio de sesión fallido.\nIntentelo de nuevo.", "Adventencia", JOptionPane.WARNING_MESSAGE);
       }
       else
           JOptionPane.showMessageDialog(this, "Existen campos vacios.\nIntentelo de nuevo.", "Adventencia", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBSingINActionPerformed

    private void initMyOwnComponents()
    {
        SingInWindowController.initOutlets(jTFUserName,jPFPassword);
    }
       
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
            java.util.logging.Logger.getLogger(SingInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingInWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBSingIN;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTittleSingInWindow;
    private javax.swing.JLabel jLUserName;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPSingIn;
    private javax.swing.JTextField jTFUserName;
    // End of variables declaration//GEN-END:variables
}
