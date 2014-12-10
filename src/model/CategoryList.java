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
public class CategoryList {
    SortedSet <Category> categoryList;
    Comparator sortedComparator;
    
    /**
     * Method for initializing the usersList attributes
     */
    public CategoryList()
    {
        sortedComparator = new NameComparator();
        this.categoryList = new TreeSet(sortedComparator);
    }
    
    /**
     * Method to initializing the iterator of userList
     * @return userList Attribute
     */
    public Iterator iterator()
    {
        return this.categoryList.iterator();
    }
    
    /**
     * Method to add a user in userList
     * @param category
     * @return userList with the added user
     */
    public boolean addCategory(Category category)
    {
        return this.categoryList.add(category);
    }
}
