package view;

import java.io.File;
import model.Util;
/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class MainWindow extends VentaOnline 
{

    public MainWindow() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMainWindow = new javax.swing.JPanel();
        jTFSearcher = new javax.swing.JTextField();
        jCBCategory = new javax.swing.JComboBox();
        jBRegister = new javax.swing.JButton();
        jBExit = new javax.swing.JButton();
        jBSingIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPMainWindow.setBackground(new java.awt.Color(255, 255, 255));

        jCBCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBRegister.setBackground(new java.awt.Color(255, 255, 255));
        jBRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBRegister.setText("Registrarse");
        jBRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegisterActionPerformed(evt);
            }
        });

        jBExit.setText("Salir");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        jBSingIn.setBackground(new java.awt.Color(255, 255, 255));
        jBSingIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBSingIn.setText("Iniciar sesion");
        jBSingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSingInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMainWindowLayout = new javax.swing.GroupLayout(jPMainWindow);
        jPMainWindow.setLayout(jPMainWindowLayout);
        jPMainWindowLayout.setHorizontalGroup(
            jPMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBExit)
                    .addGroup(jPMainWindowLayout.createSequentialGroup()
                        .addComponent(jCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSingIn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMainWindowLayout.setVerticalGroup(
            jPMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainWindowLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegister)
                    .addComponent(jBSingIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(jBExit)
                .addContainerGap())
        );

        jBRegister.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegisterActionPerformed

        RegisterWindow registerWindow = new RegisterWindow();
        registerWindow.setVisible(true);

        registerWindow.setFatherWindow(this, true);
    }//GEN-LAST:event_jBRegisterActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed

          System.exit(0);
    }//GEN-LAST:event_jBExitActionPerformed

    private void jBSingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSingInActionPerformed

        SingInWindow singInWindow = new SingInWindow();
        singInWindow.setVisible(true);

        singInWindow.setFatherWindow(this, true);
    }//GEN-LAST:event_jBSingInActionPerformed


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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBRegister;
    private javax.swing.JButton jBSingIn;
    private javax.swing.JComboBox jCBCategory;
    private javax.swing.JPanel jPMainWindow;
    private javax.swing.JTextField jTFSearcher;
    // End of variables declaration//GEN-END:variables
}
