package controller;

import com.toedter.calendar.JDateChooser;
import static java.lang.Double.isNaN;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.User;
import model.UsersXMLfile;

/*    public RegisterWindow (String FechaActual) {       
        jTFfecha.setText(FechaActual);

    public static String FechaActual ()
    {    
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
        
        return formatoFecha.format(fecha);   
    }
    }*/


/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class RegisterWindowController {
    
    public static JTextField name;
    public static JTextField lastName;
    public static JTextField id;
    public static JTextField address;
    public static JTextField userName;
    public static JPasswordField password;
    public static JPasswordField confirmedPassword;
    public static JDateChooser dateOfbirth;
    public static JComboBox Extends;
    public static String toLowerCaseUserName;
    public static String CBprofile;
    public static String CDdateOfbirth;
    public static String email;
    public static String confirmEmail;


    
       
    /**
     * Method to create the user
     * @param name
     * @param lastName
     * @param id
     * @param dateOfbirth
     * @param email
     * @param confirmPassword
     * @param address
     * @param profile
     * @param userName
     * @param confirmEmail
     * @param password
     */
    public static void initOutlets (JTextField name, JTextField lastName, JTextField id, JDateChooser dateOfbirth, String email, String confirmEmail, JTextField address,  JTextField userName, String profile, JPasswordField password, JPasswordField confirmPassword)
    {
        // Se obtiene en formato String la seleccion de la fecha dentro del JDateChooser
        DateFormat df = DateFormat.getDateInstance();
        CDdateOfbirth = df.format(dateOfbirth.getDate()); 
   
        //se inicializan los atributos
        RegisterWindowController.name = name;
        RegisterWindowController.lastName = lastName;
        RegisterWindowController.id = id;
        RegisterWindowController.confirmEmail   = confirmEmail;
        RegisterWindowController.email = email;
        RegisterWindowController.dateOfbirth = dateOfbirth;
        RegisterWindowController.address = address;
        RegisterWindowController.userName = userName;
        RegisterWindowController.password = password;
        RegisterWindowController.confirmedPassword = confirmPassword;
        RegisterWindowController.CBprofile  = profile;

        
        // Se obtiene en formato String la selección del usuario dentro del JComboBox *******
        //CBprofile     = (String) RegisterWindowController.profile.getSelectedItem(); ******
        
        //CDdateOfbirth = (String) RegisterWindowController.dateOfbirth.getToolTipText();    
        
        // Se generaliza el userName a un string en minusculas
        toLowerCaseUserName = RegisterWindowController.userName.getText().toLowerCase();
    }
    
    public static String ValidateProfile(String profile)
    {
        return CBprofile;
    }
    
    public static String ValidateEmail (JTextField Email, JComboBox Extends)
    {
        String CBExtends    = (String) Extends.getSelectedItem();
        String concatena     = CBExtends.concat(Email.getText());
        
        return concatena;
    }
    
    /**
     * @param userNameRegistration
     * @Case();
    }
    
    /**
     * Method to validate the user's nickname
     * @return user
     */
    public static boolean checkUserName (String userNameRegistration)
    {
        toLowerCaseUserName = userNameRegistration.toLowerCase();
        
        return(UsersXMLfile.readUsernameOfUserFromXml(toLowerCaseUserName));
    }
    
    public static boolean checkEmailUser(String userEmailRegistration)
    {        
        return(UsersXMLfile.readEmailUsersFromXml(userEmailRegistration));
    }
    
    public static boolean checkIDUser(String userIDRegistration)
    {        
        return(UsersXMLfile.readIDUsersFromXml(userIDRegistration));
    }
    

    /**
     * Method to save the created user in the data base 
     */
    public static void saveUsersInXml ()
    {
        User user = new User(RegisterWindowController.name.getText(),
                             RegisterWindowController.lastName.getText(),
                             RegisterWindowController.id.getText(),
                             RegisterWindowController.CDdateOfbirth,
                             RegisterWindowController.confirmEmail,
                             RegisterWindowController.toLowerCaseUserName,                            
                             RegisterWindowController.CBprofile,
                             RegisterWindowController.address.getText(),                           
                             RegisterWindowController.confirmedPassword.getText());
        
        UsersXMLfile.saveUsersInXml(user);
    }
    
    /**
     * Method to clear all compoents in the view 
     * @param name
     * @param lastName
     * @param id
     * @param email
     * @param password
     * @param userName
     * @param confirmEmail
     * @param confirmPassword
     * @param address
     */
    public static void clearAllOutlets(JTextField name, JTextField lastName, JTextField id, String email, String confirmEmail, JTextField address, JTextField userName, JPasswordField password, JPasswordField confirmPassword)
    {
        //se inicializan los atributos
        RegisterWindowController.name.setText(null);
        RegisterWindowController.lastName.setText(null);
        RegisterWindowController.id.setText(null);
        RegisterWindowController.address.setText(null);
        RegisterWindowController.userName.setText(null);
        RegisterWindowController.password.setText(null);
        RegisterWindowController.confirmedPassword.setText(null);
    }

}
