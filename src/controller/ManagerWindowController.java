package controller;

import static controller.RegisterWindowController.toLowerCaseUserName;
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
import model.Product;
import model.ProductComparator;
import model.ProductList;
import model.ProductsXMLfile;
import model.UsersXMLfile;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class ManagerWindowController {
        
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
    
  /*
    public static void loadAllProductsInComboBox()
    {
        ProductList List = new  ProductList(); 
        
        ProductsXMLfile.readAllProductsFromXML(List);
        
        productList.removeAllItems();
        
        Iterator iterator = List.iterator();
        
        while (iterator.hasNext())
        {
            Product actualProduct = (Product) iterator.next();
            
            String format = actualProduct.getNameProduct(); //+ " - " + actualProduct.getRif();
            
            productList.addItem(format);
        }
    }
    
    public static void initComboBox(JComboBox productList)
    {
        ManagerWindowController.productList = productList;
    }     
    
    public static void clearAllOutletsProduct(JTextField nameProduct, JTextField provider, JTextField quantityMax, JTextField quantityMin, JTextField price, JTextField Image, JTextArea description)
    {
        //se inicializan los atributos
        ManagerWindowController.nameProduct.setText(null);
        ManagerWindowController.provider.setText(null);
        ManagerWindowController.quantityMax.setText(null);
        ManagerWindowController.quantityMin.setText(null);
        ManagerWindowController.price.setText(null);
        ManagerWindowController.Image.setText(null);
        ManagerWindowController.description.setText(null);
    }*/
}
