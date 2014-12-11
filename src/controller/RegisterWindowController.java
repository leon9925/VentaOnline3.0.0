package controller;

import static controller.SingInWindowController.CBprofile;
import static controller.SingInWindowController.toLowerCaseUserName;
import javax.swing.JComboBox;
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
    
    public static String ValidateProfile(String profile)
    {
        return CBprofile;
    }
    
    public static String ValidateEmail (JTextField Email, JComboBox Extends)
    {
        String CBExtends    = (String) Extends.getSelectedItem();
        String concatena     = Email.getText().concat(CBExtends);
        
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
     * @param Name
     * @param LastName
     * @param ID
     * @param FechaObtenida
     * @param Email
     * @param ConfirmEmail
     * @param Address
     * @param UserName
     * @param Password
     * @param ConfirmPassword
     * @param Profile
     */
    public static void saveUsersInXml (String Name,String LastName,String ID,String FechaObtenida,String Email,String ConfirmEmail,String Address,String UserName,String Password,String ConfirmPassword,String Profile)
    {
        User user = new User(Name,LastName,ID,FechaObtenida,Email,UserName,Profile,Address,Password);
        
        UsersXMLfile.saveUsersInXml(user);
    }
    
    public static boolean CleanUser(String nameUser)
    {
        boolean found;
        
        found = UsersXMLfile.removeUsersFromXML(nameUser);
        return found;      
    }

}
