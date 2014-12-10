package controller;

import static controller.SingInWindowController.toLowerCaseUserName;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Category;
import model.Product;
import model.ProductComparator;
import model.CategoryList;
import model.ProductList;
import model.ProductsXMLfile;
import model.User;
import model.UsersXMLfile;


/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class ManagerWindowController {
    
    public static JComboBox categoryList;
        
    /**
     *
     * @param nameProduct
     * @param provider
     * @param quantityMax
     * @param quantityMin
     * @param price
     * @param Image
     */
    public static void saveProductsInXml(String nameProduct, String provider, String quantityMax, String quantityMin, String price, String Image, String TADescription, String CBCategory)
    {
        Product product = new  Product(nameProduct, provider, quantityMax, quantityMin, price, Image,  TADescription, CBCategory);
        
        ProductsXMLfile.saveProductsInXML(product);
    } 
    
    public static boolean checkProductName (String productNameRegistration)
    {
        toLowerCaseUserName = productNameRegistration.toLowerCase();
        
        return(ProductsXMLfile.readProductNameOfProductFromXml(toLowerCaseUserName));
    }
    
    public static Product ConsultProduct(String nameProduct)
    {
        return(ProductsXMLfile.readAllProductsFromXML(nameProduct));
    }
    
    public static boolean CleanProduct(String nameProduct)
    {
        boolean found;
        
        found = ProductsXMLfile.removeProductsFromXML(nameProduct);
        return found;      
    }
    
    public static boolean checkUserName (String userNameRegistration)
    {
        toLowerCaseUserName = userNameRegistration.toLowerCase();
        
        return(UsersXMLfile.readUsernameOfUserFromXml(toLowerCaseUserName));
    }
        
    public static User ConsultUser(String nameUser) 
    {
        return(UsersXMLfile.readAllUsersFromXml(nameUser));
    }
    
    public static void saveCategoryInXml(String nameCategory)
    {
        Category category = new  Category(nameCategory);
        ProductsXMLfile.saveCategoryInXML(category);
    } 
    
    public static boolean checkCategory(String category)
    {
        toLowerCaseUserName = category.toLowerCase();        
        return(ProductsXMLfile.readCategoryFromXml(toLowerCaseUserName));
    }
    
    public static boolean CleanCategory(String nameCategory)
    {
        boolean found;
        
        found = ProductsXMLfile.removeCategoryFromXML(nameCategory);
        return found;      
    }
    
    public static void loadAllCategoryInComboBox()
    {
        CategoryList List = new  CategoryList(); 
        
        ProductsXMLfile.readAllCategoryFromXMLCB(List);
        
        categoryList.removeAllItems();
        
        Iterator iterator = List.iterator();
        
        while (iterator.hasNext())
        {
            Category actualCategory = (Category) iterator.next();
            
            String format = actualCategory.getNameCategory(); //+ " - " + actualProduct.getRif();
            
            categoryList.addItem(format);
        }
    }
    
    public static void initComboBoxCategory(JComboBox categoryList)
    {
        ManagerWindowController.categoryList = categoryList;
    }     
}
