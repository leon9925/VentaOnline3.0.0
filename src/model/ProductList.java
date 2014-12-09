package model;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class ProductList {
    
    SortedSet <Product> productList;
    Comparator sortedComparator;
    
    /**
     * Method for initializing the ProductList attributes
     */
    public ProductList()
    {
        sortedComparator = new ProductComparator();
        this.productList = new TreeSet(sortedComparator);
    }
    
    /**
     * Method to initializing the iterator of productList
     * @return ProductList Attribute
     */
    public Iterator iterator()
    {
        return this.productList.iterator();
    }
    
    /**
     * Method to add a product in ProductList
     * @param product Product attribute
     * @return ProductList with the added product
     */
    public boolean addProduct(Product product)
    {
        return this.productList.add(product);
    }
 
    
        public boolean removeProduct(Product product)
    {
        return this.productList.remove(product);
    }
    
}
