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
    
    public static final String CLIENT_TAG = "client";
    public static final String CLIENT_RIF_TAG = "rif";
    public static final String CLIENT_COMPANYNAME_TAG = "companyName";
    public static final String CLIENT_PHONE_TAG = "phone";
    public static final String CLIENT_RESIDENCE_TAG = "residence";
    public static final String CLIENT_BANKING_TAG = "banking";
    public static final String CLIENT_PRODUCT_TAG = "product";
    public static final String CLIENT_ACCOUNT_TAG = "account";
    public static final String CLIENT_TRANSACTION_TAG = "transaction";
    public static final String CLIENT_MINIMUNTARIFF_TAG = "minimunTariff";
    public static final String CLIENT_MAXIMUNTARIFF_TAG = "maximunTariff";
    public static final String CLIENT_CHARGEACCOUNT_TAG = "chargeAccount";
    public static final String CLIENT_EXECUTIVE_TAG = "executive";
    
    public static final String PRODUCT_TAG = "product";
    public static final String PRODUCT_NAMEPRODUCT_TAG = "name";
    public static final String PRODUCT_PROVIDER_TAG = "provider";
    public static final String PRODUCT_QUANTITYMAX_TAG = "quantityMax";
    public static final String PRODUCT_QUANTITYMIN_TAG = "quantityMin";
    public static final String PRODUCT_PRICE_TAG = "price";
    public static final String PRODUCT_IMAGE_TAG = "image";
    public static final String PRODUCT_DESCRIPTION_TAG = "description";
    public static final String PRODUCT_CATEGORY_TAG = "category";
            
            
    public static final String ERROR_USER_NAME_TAG = "Error loading User from XML - Error in the attribute " + USER_NAME_TAG + " of the XML tag";
    public static final String ERROR_USER_LASTNAME_TAG = "Error loading User from XML - Error in the attribute " + USER_LASTNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_ID_TAG= "Error loading User from XML - Error in the attribute " + USER_ID_TAG + " of the XML tag";
    public static final String ERROR_USER_DATEOFBIRTH_TAG= "Error loading User from XML - Error in the attribute " + USER_DATEOFBIRTH_TAG + " of the XML tag";
    public static final String ERROR_USER_EMAIL_TAG= "Error loading User from XML - Error in the attribute " + USER_EMAIL_TAG + " of the XML tag";
    public static final String ERROR_USER_ADDRESS_TAG= "Error loading User from XML - Error in the attribute " + USER_ADDRESS_TAG + " of the XML tag";
    public static final String ERROR_USER_PROFILE_TAG= "Error loading User from XML - Error in the attribute " + USER_PROFILE_TAG + " of the XML tag";
    public static final String ERROR_USER_USERNAME_TAG= "Error loading User from XML - Error in the attribute " + USER_USERNAME_TAG + " of the XML tag";
    public static final String ERROR_USER_PASSWORD_TAG= "Error loading User from XML - Error in the attribute " + USER_PASSWORD_TAG + " of the XML tag";
   
    public static final String ERROR_PRODUCT_NAMEPRODUCT_TAG = "Error loading Client from XML - Error in the attribute " + CLIENT_RIF_TAG + " of the XML tag";
    
    public static final String ERROR_CLIENT_COMPANYNAME_TAG = "Error loading Client from XML - Error in the attribute " + CLIENT_COMPANYNAME_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_PHONE_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_PHONE_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_RESIDENCE_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_RESIDENCE_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_BANKING_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_BANKING_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_PRODUCT_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_PRODUCT_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_ACCOUNT_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_ACCOUNT_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_TRANSACTION_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_TRANSACTION_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_MINIMUNTARIFF_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_MINIMUNTARIFF_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_MAXIMUNTARIFF_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_MAXIMUNTARIFF_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_CHARGEACCOUNT_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_CHARGEACCOUNT_TAG + " of the XML tag";
    public static final String ERROR_CLIENT_EXECUTIVE_TAG= "Error loading Client from XML - Error in the attribute " + CLIENT_EXECUTIVE_TAG + " of the XML tag";
    
    public static final String ERROR_XML_EMPTY_FILE = "Error loading XML file - The file is empty";
    public static final String ERROR_XML_PROCESSING_FILE = "Error loading XML file - It's not possible processing the file";
    public static final String ERROR_XML_USER_NICKNAME_NO_EXIST = "Error loading XML file - The professor don't exist";
    
    public static final String USERS_XML_PATH = "src/model/users.xml";
    public static final String CLIENTS_XML_PATH = "src/model/clients.xml";
    public static final String PRODUCTS_XML_PATH = "src/model/producto.xml";
    
    public static final String PAGO_PROV_TXT_PATH = "src/Files/PagoProv.txt";
    public static final String DOMIC_TXT_PATH = "src/Files/Domic.txt";
    public static final String COMISIONES_A_COBRAR_TXT_PATH = "src/Files/ComisionesACobrar.txt";
    public static final String COMISIONES_COBRADAS_TXT_PATH = "src/FIles/ComisionesCobradas.txt";
    public static final String BANK_TXT_PATH = "src/FIles/Bank.txt";

    
}
