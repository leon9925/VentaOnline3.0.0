package controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.UsersXMLfile;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class SingInWindowController {
    
    public static JTextField userName;
    public static JPasswordField password;
    public static String CBprofile;
    public static String toLowerCaseUserName;
    
    public static void initOutlets (JTextField userName, JPasswordField password)
    {
        SingInWindowController.userName = userName;
        SingInWindowController.password = password;
        
        toLowerCaseUserName = SingInWindowController.userName.getText().toLowerCase();
    }
    
    public static boolean checkLogin(String userNameLogin, String passwordLogin)
    {
        toLowerCaseUserName = userNameLogin.toLowerCase();
        // Se busca al usuario dentro el Users.xml, de encontrarlo retorna el tipo de usuario, de existir este
        return(UsersXMLfile.readUsersFromXml(toLowerCaseUserName, passwordLogin));
    }
    
    
    public static String checkUserProfile(String userNameLogin, String passwordLogin)
    {
        toLowerCaseUserName = userNameLogin.toLowerCase();
        
        // Se busca al usuario dentro el Users.xml, y retorna el tipo de usuario
        return(UsersXMLfile.findProfileOfUserInXml(toLowerCaseUserName,passwordLogin));
    }
       
    public static void clearOutlets(JTextField userName, JPasswordField password)
    {
        SingInWindowController.userName.setText(null);
        SingInWindowController.password.setText(null);
    }
            
}
