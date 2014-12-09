package controller;

import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Product;
import model.ProductList;
import model.ProductsXMLfile;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class ManagerWindowController {
        
    public static JTextField nameProduct;
    public static JTextField provider;
    public static JTextField quantityMax;
    public static JTextField quantityMin;
    public static JTextField price;
    public static JTextField Image;
    public static JTextArea  description;
    public static JComboBox  category;
    public static String     CBCategory;
    public static String     TADescription;
    private static JComboBox productList;
    
    /**
     *
     * @param nameProduct
     * @param provider
     * @param quantityMax
     * @param quantityMin
     * @param price
     * @param Image
     * @param description
     * @param category
     */
    public static void initOutletsProductRegistration(JTextField nameProduct,JTextField provider,JTextField quantityMax,JTextField quantityMin,JTextField price,JTextField Image,
                                                     JTextArea  description,JComboBox  category){
        
        ManagerWindowController.nameProduct = nameProduct;
        ManagerWindowController.provider = provider;
        ManagerWindowController.quantityMax = quantityMax;
        ManagerWindowController.quantityMin = quantityMin;
        ManagerWindowController.price = price;
        ManagerWindowController.Image = Image;
        ManagerWindowController.description = description;
        ManagerWindowController.category = category;
        
        //Se asigna el valor del combobox a un String
        CBCategory = (String) ManagerWindowController.category.getSelectedItem();
        
        //Se asigna el valor del textaerea a un String
        TADescription = (String) ManagerWindowController.description.getSelectedText();
    }


        public static void saveProductsInXml()
    {
        Product product = new  Product(ManagerWindowController.nameProduct.getText(),
                                    ManagerWindowController.provider.getText(),
                                    ManagerWindowController.quantityMax.getText(),
                                    ManagerWindowController.quantityMin.getText(),
                                    ManagerWindowController.price.getText(),
                                    ManagerWindowController.Image.getText(),
                                    ManagerWindowController.TADescription,
                                    ManagerWindowController.CBCategory);
        
        ProductsXMLfile.saveProductsInXML(product);
    } 
        
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
}
