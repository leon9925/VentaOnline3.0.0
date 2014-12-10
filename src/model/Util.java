package model;

import static model.Util.USER_NAME_TAG;
import static model.Util.USER_LASTNAME_TAG;
import static model.Util.USER_ID_TAG;
import static model.Util.USER_DATEOFBIRTH_TAG;
import static model.Util.USER_EMAIL_TAG;
import static model.Util.USER_ADDRESS_TAG;
import static model.Util.USER_USERNAME_TAG;
import static model.Util.USER_PROFILE_TAG;
import static model.Util.USER_PASSWORD_TAG;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class Util
{   
    public static final String USER_TAG = "user";
    public static final String USER_NAME_TAG = "name";
    public static final String USER_LASTNAME_TAG = "lastName";
    public static final String USER_ID_TAG = "id";
    public static final String USER_DATEOFBIRTH_TAG = "dateOfBirth"; 
    public static final String USER_EMAIL_TAG = "email";
    public static final String USER_ADDRESS_TAG = "address";
    public static final String USER_USERNAME_TAG = "userName";
    public static final String USER_PROFILE_TAG = "profile";
    public static final String USER_PASSWORD_TAG = "password";
    
    public static final String PRODUCT_TAG = "product";
    public static final String PRODUCT_NAMEPRODUCT_TAG = "name";
    public static final String PRODUCT_PROVIDER_TAG = "provider";
    public static final String PRODUCT_QUANTITYMAX_TAG = "quantityMax";
    public static final String PRODUCT_QUANTITYMIN_TAG = "quantityMin";
    public static final String PRODUCT_PRICE_TAG = "price";
    public static final String PRODUCT_IMAGE_TAG = "image";
    public static final String PRODUCT_DESCRIPTION_TAG = "description";
    public static final String PRODUCT_CATEGORY_TAG = "category";
    
    public static final String CATEGORY_TAG = "category";
    public static final String CATEGORY_NAMECATEGORY_TAG = "name";
               
    public static final String ERROR_USER_NAME_TAG = "Error loading User from XML - Error in the attribute " + USER_NAME_TAG + " of the XML tag";
    public static final String ERROR_USER_LASTNAME_TAG = "Error loading User from XML - Error in the attribute " + USER_LASTNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_ID_TAG= "Error loading User from XML - Error in the attribute " + USER_ID_TAG + " of the XML tag";
    public static final String ERROR_USER_DATEOFBIRTH_TAG= "Error loading User from XML - Error in the attribute " + USER_DATEOFBIRTH_TAG + " of the XML tag";
    public static final String ERROR_USER_EMAIL_TAG= "Error loading User from XML - Error in the attribute " + USER_EMAIL_TAG + " of the XML tag";
    public static final String ERROR_USER_ADDRESS_TAG= "Error loading User from XML - Error in the attribute " + USER_ADDRESS_TAG + " of the XML tag";
    public static final String ERROR_USER_PROFILE_TAG= "Error loading User from XML - Error in the attribute " + USER_PROFILE_TAG + " of the XML tag";
    public static final String ERROR_USER_USERNAME_TAG= "Error loading User from XML - Error in the attribute " + USER_USERNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_PASSWORD_TAG= "Error loading User from XML - Error in the attribute " + USER_PASSWORD_TAG + " of the XML tag";
   
    public static final String ERROR_PRODUCT_NAMEPRODUCT_TAG = "Error loading Client from XML - Error in the attribute " + PRODUCT_NAMEPRODUCT_TAG + " of the XML tag";
    
    public static final String ERROR_CATEGORY_NAMECATEGORY_TAG = "Error loading Client from XML - Error in the attribute " + CATEGORY_NAMECATEGORY_TAG + " of the XML tag";
     
    public static final String ERROR_XML_EMPTY_FILE = "Error loading XML file - The file is empty";
    public static final String ERROR_XML_PROCESSING_FILE = "Error loading XML file - It's not possible processing the file";
    public static final String ERROR_XML_USER_NICKNAME_NO_EXIST = "Error loading XML file - The professor don't exist";
    
    public static final String USERS_XML_PATH = "src/model/users.xml";
    public static final String CATEGORYS_XML_PATH = "src/model/category.xml";
    public static final String PRODUCTS_XML_PATH = "src/model/producto.xml";
}
