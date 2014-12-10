package view;

import controller.RegisterWindowController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class RegisterWindow extends VentaOnline {

    DateFormat df = DateFormat.getDateInstance();
    

   public RegisterWindow() 
    { 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRegisterWindow = new javax.swing.JPanel();
        jLTittleRegister = new javax.swing.JLabel();
        jLName = new javax.swing.JLabel();
        jLLastName = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jLDateOfBirth = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLConfirmEmail = new javax.swing.JLabel();
        jLAddress = new javax.swing.JLabel();
        jLUserName = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jLConfirmarPassword = new javax.swing.JLabel();
        jBAccept = new javax.swing.JButton();
        jBCancel = new javax.swing.JButton();
        jTFName = new javax.swing.JTextField();
        jTFLastName = new javax.swing.JTextField();
        jTFID = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFConfirmEmail = new javax.swing.JTextField();
        jTFAddress = new javax.swing.JTextField();
        jTFUserName = new javax.swing.JTextField();
        jPFPassword = new javax.swing.JPasswordField();
        jPFConfirmPassword = new javax.swing.JPasswordField();
        jBver = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLFechaActual = new javax.swing.JLabel();
        jTFfecha = new javax.swing.JTextField();
        jCBEmailExt1 = new javax.swing.JComboBox();
        jCBEmailExt2 = new javax.swing.JComboBox();
        jDCDateOfBirth = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPRegisterWindow.setBackground(new java.awt.Color(255, 255, 255));

        jLTittleRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLTittleRegister.setForeground(new java.awt.Color(0, 0, 255));
        jLTittleRegister.setText("     REGISTRO");

        jLName.setBackground(new java.awt.Color(255, 255, 255));
        jLName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLName.setText("Nombre");

        jLLastName.setBackground(new java.awt.Color(255, 255, 255));
        jLLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLLastName.setText("Apellido");

        jLID.setBackground(new java.awt.Color(255, 255, 255));
        jLID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLID.setText("Cedula / Pasaporte");

        jLDateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        jLDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLDateOfBirth.setText("Fecha de nacimiento");

        jLEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLEmail.setText("Correo electronico");

        jLConfirmEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLConfirmEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLConfirmEmail.setText("Confirmar correo electronico");

        jLAddress.setBackground(new java.awt.Color(255, 255, 255));
        jLAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLAddress.setText("Direccion");

        jLUserName.setBackground(new java.awt.Color(255, 255, 255));
        jLUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLUserName.setText("Nombre de usuario");

        jLPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLPassword.setText("Contraseña");

        jLConfirmarPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLConfirmarPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLConfirmarPassword.setText("Confirmar contraseña");

        jBAccept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBAccept.setText("Registrar");
        jBAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcceptActionPerformed(evt);
            }
        });

        jBCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBCancel.setText("Cancelar");
        jBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelActionPerformed(evt);
            }
        });

        jBver.setText("VER");
        jBver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverActionPerformed(evt);
            }
        });

        jLFechaActual.setBackground(new java.awt.Color(255, 255, 255));
        jLFechaActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLFechaActual.setText("Fecha de registro");

        jCBEmailExt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "@hotmail.com", "@yahoo.com", "@gmail.com" }));

        jCBEmailExt2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "@hotmail.com", "@yahoo.com", "@gmail.com" }));

        javax.swing.GroupLayout jPRegisterWindowLayout = new javax.swing.GroupLayout(jPRegisterWindow);
        jPRegisterWindow.setLayout(jPRegisterWindowLayout);
        jPRegisterWindowLayout.setHorizontalGroup(
            jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegisterWindowLayout.createSequentialGroup()
                .addComponent(jLTittleRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(240, 240, 240))
            .addGroup(jPRegisterWindowLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegisterWindowLayout.createSequentialGroup()
                        .addComponent(jBver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jBCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAccept)
                        .addGap(34, 34, 34))
                    .addGroup(jPRegisterWindowLayout.createSequentialGroup()
                        .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLEmail)
                            .addComponent(jLDateOfBirth)
                            .addComponent(jLID)
                            .addComponent(jLLastName)
                            .addComponent(jLName)
                            .addComponent(jLConfirmEmail)
                            .addComponent(jLAddress)
                            .addComponent(jLUserName)
                            .addComponent(jLPassword)
                            .addComponent(jLConfirmarPassword)
                            .addComponent(jLFechaActual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFName, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jTFLastName)
                            .addComponent(jTFID)
                            .addComponent(jTFEmail)
                            .addComponent(jTFConfirmEmail)
                            .addComponent(jTFAddress)
                            .addComponent(jTFUserName)
                            .addComponent(jPFConfirmPassword)
                            .addComponent(jPFPassword)
                            .addComponent(jTFfecha)
                            .addComponent(jDCDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBEmailExt1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBEmailExt2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPRegisterWindowLayout.setVerticalGroup(
            jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegisterWindowLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLTittleRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName)
                    .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLastName)
                    .addComponent(jTFLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLID)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLDateOfBirth)
                    .addComponent(jDCDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEmailExt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLConfirmEmail)
                    .addComponent(jTFConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEmailExt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAddress)
                    .addComponent(jTFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUserName)
                    .addComponent(jTFUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPassword)
                    .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLConfirmarPassword)
                    .addComponent(jPFConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaActual)
                    .addComponent(jTFfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPRegisterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAccept)
                    .addComponent(jBCancel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBver))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRegisterWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRegisterWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelActionPerformed
        restoreFatherWindow();

        this.dispose();
    }//GEN-LAST:event_jBCancelActionPerformed

    private void jBAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcceptActionPerformed
        
        //String CBprofile = RegisterWindowController.ValidateProfile(jCBProfile); Cambiar el perfil de dato a String
        int    Cedula = -1;
        String Profile       = "Usuario";
        String FechaObtenida = "";
        String Email         = RegisterWindowController.ValidateEmail(jTFEmail, jCBEmailExt1);
        String ConfirmEmail  = RegisterWindowController.ValidateEmail(jTFConfirmEmail, jCBEmailExt2);
        String Name     = jTFName.getText();
        String LastName = jTFLastName.getText();
        String Address  = jTFAddress.getText();
        String UserName = jTFUserName.getText();
        String Password = jPFPassword.getText();
        String ConfirmPassword = jPFConfirmPassword.getText();
        String ID       = jTFID.getText();

        if (!"".equals(Name) && !"".equals(LastName) && !"".equals(ID) && !"".equals(Email) && 
            !"".equals(ConfirmEmail) && !"".equals(UserName)  && !"".equals(Password) && 
            !"".equals(ConfirmPassword) && !"".equals(Address))
        {
            try{
                Cedula   = Integer.parseInt(jTFID.getText());
                FechaObtenida = df.format(jDCDateOfBirth.getDate());
                    
                    if(Cedula != -1 && !"".equals(FechaObtenida))
                    {
                        if ( Email.equals(ConfirmEmail))
                        {
                            if (!(RegisterWindowController.checkUserName(jTFUserName.getText())))
                            {
                                if (!(RegisterWindowController.checkEmailUser(jTFEmail.getText())))
                                {    
                                    if (!(RegisterWindowController.checkIDUser(jTFID.getText())))
                                    {
                                        if ((jPFPassword.getText().equals(jPFConfirmPassword.getText())) )
                                        { 

                                                RegisterWindowController.saveUsersInXml(Name,LastName,ID,FechaObtenida,Email,ConfirmEmail,Address,UserName,Password,ConfirmPassword,Profile);

                                                JOptionPane.showMessageDialog(this,"Usuario registrado exitosamente.","",JOptionPane.INFORMATION_MESSAGE);

                                                restoreFatherWindow();

                                                this.dispose();

                                        }
                                        else
                                            JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                                    }
                                    else
                                        JOptionPane.showMessageDialog(this,"Esta cedula de identidad ya existe.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                                }
                                else
                                    JOptionPane.showMessageDialog(this,"Este correo electronico ya existe.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                            }
                            else
                                JOptionPane.showMessageDialog(this,"Este nombre de usuario ya exite.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                            JOptionPane.showMessageDialog(this,"Los correos electronicos no coinciden.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                    }
                    else
                                        JOptionPane.showMessageDialog(this,"Valores incorrectos.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this,"La cedula introducida no contiene el formato correcto.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);    
                Cedula = -1;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(this,"El campo de fecha de nacimiento se encuentra vacio.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                FechaObtenida = "";
            }
        }
        else
            JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBAcceptActionPerformed

    private void jBverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverActionPerformed
      
        String FechaObtenida = df.format(jDCDateOfBirth.getDate());
        jTextField1.setText(FechaObtenida);
    }//GEN-LAST:event_jBverActionPerformed

/*
    private void initMyOwnComponents()
    {
        
        RegisterWindowController.initOutlets(jTFName, jTFLastName,  jTFID, jDCDateOfBirth, Email, ConfirmEmail, jTFAddress, jTFUserName, Profile, jPFPassword, jPFConfirmPassword);
        RegisterWindowController.saveUsersInXml();
        RegisterWindowController.clearAllOutlets(jTFName, jTFLastName,  jTFID, Email, ConfirmEmail, jTFAddress, jTFUserName, jPFPassword, jPFConfirmPassword);
    }*/
        

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAccept;
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBver;
    private javax.swing.JComboBox jCBEmailExt1;
    private javax.swing.JComboBox jCBEmailExt2;
    private com.toedter.calendar.JDateChooser jDCDateOfBirth;
    private javax.swing.JLabel jLAddress;
    private javax.swing.JLabel jLConfirmEmail;
    private javax.swing.JLabel jLConfirmarPassword;
    private javax.swing.JLabel jLDateOfBirth;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFechaActual;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLLastName;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTittleRegister;
    private javax.swing.JLabel jLUserName;
    private javax.swing.JPasswordField jPFConfirmPassword;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPRegisterWindow;
    private javax.swing.JTextField jTFAddress;
    private javax.swing.JTextField jTFConfirmEmail;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFLastName;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTextField jTFUserName;
    private javax.swing.JTextField jTFfecha;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
