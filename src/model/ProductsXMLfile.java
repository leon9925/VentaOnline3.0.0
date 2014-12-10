package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
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
public class ProductsXMLfile {
    
    /**
     *
     * @param NameProductConsult
     * @return
     */
    public static Product readAllProductsFromXML(String NameProductConsult) 
    {//leer todos los productos de XML
        Product         product = null;
        Document        doc;
        Element         root,   child;
        List<Element>   rootChildrens;
        String          NameProduct, provider, quantityMax, quantityMin, price,Image,Description,Category;
        boolean         found = false;
        int             pos = 0;
        

        SAXBuilder builder = new SAXBuilder();

        try 
        {
            doc = builder.build(Util.PRODUCTS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentro de las etiquetas NameProduct
                NameProduct        = child.getAttributeValue(Util.PRODUCT_NAMEPRODUCT_TAG);
                
                if(NameProduct != null && NameProduct.equals(NameProductConsult))
                {
                    NameProduct  = child.getAttributeValue(Util.PRODUCT_NAMEPRODUCT_TAG);
                    provider     = child.getAttributeValue(Util.PRODUCT_PROVIDER_TAG);
                    quantityMax  = child.getAttributeValue(Util.PRODUCT_QUANTITYMAX_TAG);
                    quantityMin  = child.getAttributeValue(Util.PRODUCT_QUANTITYMIN_TAG);
                    price        = child.getAttributeValue(Util.PRODUCT_PRICE_TAG);
                    Image        = child.getAttributeValue(Util.PRODUCT_IMAGE_TAG);
                    Description  = child.getAttributeValue(Util.PRODUCT_DESCRIPTION_TAG);
                    Category     = child.getAttributeValue(Util.PRODUCT_CATEGORY_TAG);
                
                        if (NameProduct != null && provider != null && quantityMax != null && quantityMin != null && price != null && Image != null && Description != null && Category != null)
                        {
                            product = new Product(NameProduct,provider,quantityMax,quantityMin,price,Image,Description,Category);
                            found = true;
                        }
                        else
                        {
                            // Errores posibles en caso de que alguna etiqueta dentro del archivo XML este vacia
                            if (NameProduct == null) {
                                System.out.println(Util.PRODUCT_NAMEPRODUCT_TAG);
                            }

                            if (provider == null) {
                                System.out.println(Util.PRODUCT_PROVIDER_TAG);
                            }

                            if (quantityMax == null) {
                                System.out.println(Util.PRODUCT_QUANTITYMAX_TAG);
                            }

                            if (quantityMin == null) {
                                System.out.println(Util.PRODUCT_QUANTITYMIN_TAG);
                            }

                            if (price == null) {
                                System.out.println(Util.PRODUCT_PRICE_TAG);
                            }
                            if (Image == null) {
                                System.out.println(Util.PRODUCT_IMAGE_TAG);
                            }

                            if (Description == null) {
                                System.out.println(Util.PRODUCT_DESCRIPTION_TAG);
                            }

                            if (Category == null) {
                                System.out.println(Util.PRODUCT_CATEGORY_TAG);
                            }
                        }
                }
                else
                {
                    if (NameProduct == null)
                        System.out.println(Util.ERROR_PRODUCT_NAMEPRODUCT_TAG);
                    
                    pos++;
                }
            }
        } catch (JDOMParseException e) {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        } catch (JDOMException e) {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }

        return(product);    
    }
       
    public static boolean saveProductsInXML(Product product) 
    {//guarda producto en el XML de productos
        Document doc;
        Element root, newChild;

        SAXBuilder builder = new SAXBuilder();

        try 
        {
            doc = builder.build(Util.PRODUCTS_XML_PATH);

            root = doc.getRootElement();

            // Creamos una nueva etiqueta
            newChild = new Element(Util.PRODUCT_TAG);
            

            // Añadimos un atributo
            newChild.setAttribute(Util.PRODUCT_NAMEPRODUCT_TAG, product.getNameProduct());
            newChild.setAttribute(Util.PRODUCT_PROVIDER_TAG, product.getProvider());
            newChild.setAttribute(Util.PRODUCT_QUANTITYMAX_TAG, product.getQuantityMax());
            newChild.setAttribute(Util.PRODUCT_QUANTITYMIN_TAG, product.getQuantityMin());
            newChild.setAttribute(Util.PRODUCT_PRICE_TAG, product.getPrice());
            newChild.setAttribute(Util.PRODUCT_IMAGE_TAG, product.getImg());
            Element setAttribute = newChild.setAttribute(Util.PRODUCT_DESCRIPTION_TAG, product.getDescription());
            newChild.setAttribute(Util.PRODUCT_CATEGORY_TAG, product.getCategory());
                        
                        
            // La añadimos como hija a una etiqueta ya existente
            root.addContent(newChild);

            try 
            {
                Format format = Format.getPrettyFormat();

                /* Se genera un flujo de salida de datos XML */
                XMLOutputter out = new XMLOutputter(format);

                /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                FileOutputStream file = new FileOutputStream(Util.PRODUCTS_XML_PATH);

                /* Se manda el documento generado hacia el archivo XML */
                out.output(doc, file);

                /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
                file.flush();
                file.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (JDOMParseException e) {
            System.out.println(Util.ERROR_XML_EMPTY_FILE);
            e.printStackTrace();
        } catch (JDOMException e) {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(Util.ERROR_XML_PROCESSING_FILE);
            e.printStackTrace();
        }
        
        return true;
    }
    
    public static boolean readProductNameOfProductFromXml(String NameProductRegistration)
    {//leer Nombre De Producto De Xml
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          NameProduct;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.PRODUCTS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();

            while (!found && pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);    
                
                // Se obtine el valor dentro de las etiquetas NameProduct
                NameProduct        = child.getAttributeValue(Util.PRODUCT_NAMEPRODUCT_TAG);
                
                if(NameProduct != null && NameProduct.equals(NameProductRegistration))
                {
                    found = true;
                }
                else
                {
                    if (NameProduct == null)
                        System.out.println(Util.ERROR_PRODUCT_NAMEPRODUCT_TAG);
                    
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
    
    public static boolean removeProductsFromXML(String productToRemove) 
    {//elimina los productos del XML de productos
        Document        doc;
        Element         root,child;
        List <Element>  rootChildrens;
        String          product;
        boolean         found = false;
        int             pos = 0;

        SAXBuilder      builder = new SAXBuilder();

        try
        {
            doc = builder.build(Util.PRODUCTS_XML_PATH);

            root = doc.getRootElement();

            rootChildrens = root.getChildren();
            
            while (pos < rootChildrens.size())
            {
                child = rootChildrens.get(pos);

                product = child.getAttributeValue(Util.PRODUCT_NAMEPRODUCT_TAG);
                    
                if (product != null && product.equals(productToRemove))
                {
                    child.getParent().removeContent(child);
                    
                    found = true;
                    
                    try
                    {
                        Format format = Format.getPrettyFormat();

                        /* Se genera un flujo de salida de datos XML */ 
                        XMLOutputter out = new XMLOutputter(format);

                        /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
                        FileOutputStream file = new FileOutputStream(Util.PRODUCTS_XML_PATH);

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
                    if (productToRemove == null)
                        System.out.println(Util.ERROR_PRODUCT_NAMEPRODUCT_TAG);
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
