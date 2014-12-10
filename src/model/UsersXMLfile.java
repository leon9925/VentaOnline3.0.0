package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.JDOMParseException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class UsersXMLfile {
    
    
    public static boolean readUsersFromXml(String userNameLogin, String passwordLogin)
    {
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          userName, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentrp de las etiquetas nickname, userType y password
                userName        = child.getAttributeValue(Util.USER_USERNAME_TAG);
                password        = child.getAttributeValue(Util.USER_PASSWORD_TAG);

                if(
                   userName != null         && userName.equals(userNameLogin)   &&
                   password != null         && password.equals(passwordLogin)    )
                {
                    found = true;
                }
                else
                {
                    
                    if (userName == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                    
                    if (password == null)
                        System.out.println(Util.ERROR_USER_PASSWORD_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return found;
    }  
    
        /**
     * Method to read an user from the data base 
     * @param emailLogin
     * @return Found (true), if the user is on the data base
     */
    public static boolean readEmailUsersFromXml(String emailLogin)
    {
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          email;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentro de las etiquetas email
                email   = child.getAttributeValue(Util.USER_EMAIL_TAG);

                if(
                   email != null      && email.equals(emailLogin))
                {
                    found = true;
                }
                else
                {    
                    if (email == null)
                        System.out.println(Util.ERROR_USER_EMAIL_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return found;
    }
    
    public static boolean readIDUsersFromXml(String IDLogin)
    {
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          id;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentro de las etiquetas email
                id   = child.getAttributeValue(Util.USER_ID_TAG);

                if(
                   id != null      && id.equals(IDLogin))
                {
                    found = true;
                }
                else
                {    
                    if (id == null)
                        System.out.println(Util.ERROR_USER_ID_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return found;
    }
    
        /**
     * Method to read an user from the data base (
     * @param userNameLogin
     * @param passwordLogin
     * @return the Type of User
     */
    public static String findProfileOfUserInXml(String userNameLogin, String passwordLogin)
    {
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          userName, password, profile = null;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentrp de las etiquetas userName, profile y password
                userName        = child.getAttributeValue(Util.USER_USERNAME_TAG);
                password        = child.getAttributeValue(Util.USER_PASSWORD_TAG);

                if(
                   userName != null         && userName.equals(userNameLogin)   &&
                   password != null         && password.equals(passwordLogin)    )
                {
                    found = true;
                    profile = child.getAttributeValue(Util.USER_PROFILE_TAG);
                }
                else
                {                    
                    if (userName == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                    
                    if (password == null)
                        System.out.println(Util.ERROR_USER_PASSWORD_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return profile;
    }
    
        /**
     * Method to read an user from the data base (Nickname Validation) 
     * @param userNameRegistration
     * @return Found (true), if the user is on the data base
     */
    public static boolean readUsernameOfUserFromXml(String userNameRegistration)
    {
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          userName;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentro de las etiquetas userName, userType y password
                userName        = child.getAttributeValue(Util.USER_USERNAME_TAG);
                
                if(userName != null && userName.equals(userNameRegistration))
                {
                    found = true;
                }
                else
                {
                    if (userName == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return found;
    }

        /**
     * Method to read users in the data base and add them to a list
     * @param NameUserConsult
     * @param listUser
     * @return 
     */
    
    public static User readAllUsersFromXml(String NameUserConsult)
    {
        User            user = null;
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          name, lastName, id, dateOfbirth, email, address, profile, userName, password;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentro de las etiquetas NameProduct, userType y password
                userName        = child.getAttributeValue(Util.USER_USERNAME_TAG);

                if(userName != null && userName.equals(NameUserConsult))
                {
                    name        = child.getAttributeValue(Util.USER_NAME_TAG);
                    lastName        = child.getAttributeValue(Util.USER_LASTNAME_TAG);
                    id              = child.getAttributeValue(Util.USER_ID_TAG); 
                    dateOfbirth     = child.getAttributeValue(Util.USER_DATEOFBIRTH_TAG); 
                    email           = child.getAttributeValue(Util.USER_EMAIL_TAG);
                    address         = child.getAttributeValue(Util.USER_ADDRESS_TAG);
                    profile         = child.getAttributeValue(Util.USER_PROFILE_TAG);
                    userName        = child.getAttributeValue(Util.USER_USERNAME_TAG);
                    password        = child.getAttributeValue(Util.USER_PASSWORD_TAG);

                    if(name != null && lastName != null && id != null && dateOfbirth != null && address != null && email != null && profile != null && userName != null && password != null)
                    {
                        // Se crea un usuario
                        user = new User(name, lastName, id, dateOfbirth, email, address, profile, userName, password);
                        found = true;
                    }
                    else
                    {
                        // Errores posibles en caso de que alguna etiqueta dentro del archivo XML este vacia
                        if (name == null)
                            System.out.println(Util.ERROR_USER_NAME_TAG);

                        if (lastName == null)
                            System.out.println(Util.ERROR_USER_LASTNAME_TAG);

                        if (id == null)
                            System.out.println(Util.ERROR_USER_ID_TAG);

                        if (dateOfbirth == null)
                            System.out.println(Util.ERROR_USER_DATEOFBIRTH_TAG);

                        if (email == null)
                            System.out.println(Util.ERROR_USER_EMAIL_TAG);

                        if (address == null)
                            System.out.println(Util.ERROR_USER_ADDRESS_TAG);

                        if (profile == null)
                            System.out.println(Util.ERROR_USER_PROFILE_TAG);

                        if (userName == null)
                            System.out.println(Util.ERROR_USER_USERNAME_TAG);

                        if (password == null)
                            System.out.println(Util.ERROR_USER_PASSWORD_TAG);
                    }
                }
                else
                {
                    if (userName == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                    
                    pos++;
                }
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return(user);
    }
    
        /**
     * Method to save users in the data base
     * @return True, if the user was successfully saved in the data base
     */
    public static boolean saveUsersInXml(User user)
    {
        Document    doc;
        Element     root, newChild;

        SAXBuilder  builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            // Creamos una nueva etiqueta
            newChild = new Element(Util.USER_TAG);

            // Añadimos un atributo
            newChild.setAttribute(Util.USER_NAME_TAG, user.getName());
            newChild.setAttribute(Util.USER_LASTNAME_TAG, user.getLastName());
            newChild.setAttribute(Util.USER_ID_TAG, user.getId());
            Element setAttribute = newChild.setAttribute(Util.USER_DATEOFBIRTH_TAG, user.getDateOfbirth());
            newChild.setAttribute(Util.USER_EMAIL_TAG, user.getEmail());
            newChild.setAttribute(Util.USER_ADDRESS_TAG, user.getAddress());
            Element setAttribute1 = newChild.setAttribute(Util.USER_PROFILE_TAG, user.getProfile());
            newChild.setAttribute(Util.USER_USERNAME_TAG, user.getUserName());
            newChild.setAttribute(Util.USER_PASSWORD_TAG, user.getPassword());            

            // La añadimos como hija a una etiqueta ya existente
            root.addContent(newChild);

            try
            {
                Format format = Format.getPrettyFormat();

                /* Se genera un flujo de salida de datos XML */
                XMLOutputter out = new XMLOutputter(format);

                /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                FileOutputStream file = new FileOutputStream(Util.USERS_XML_PATH);

                /* Se manda el documento generado hacia el archivo XML */
                out.output(doc,file);

                /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                file.flush();
                file.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(JDOMParseException e)
        {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        }
        catch(JDOMException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return true;
    }    
    
    public static boolean removeUsersFromXML(String userToRemove) 
    {//elimina a los usuarios del XML de productos
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          nameUser;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.USERS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();
            
            while (pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);

                nameUser = child.getAttributeValue(Util.USER_USERNAME_TAG);
                    
                if (nameUser != null && nameUser.equals(userToRemove))
                {
                    child.getParent().removeContent(child);
                    
                    found = true;
                    
                    try
                    {
                        Format format = Format.getPrettyFormat();

                        /* Se genera un flujo de salida de datos XML */ 
                        XMLOutputter out = new XMLOutputter(format);

                        /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                        FileOutputStream file = new FileOutputStream(Util.USERS_XML_PATH);

                        /* Se manda el documento generado hacia el archivo XML */
                        out.output(doc,file);
                        
                        /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                        file.flush();
                        file.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                else
                {
                    if (userToRemove == null)
                        System.out.println(Util.ERROR_USER_USERNAME_TAG);
                }
                
                pos++;
            }
        } catch(JDOMParseException e){
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        } catch(JDOMException e){
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        } catch(IOException e){
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        return found;
    }
}
