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
public class UsersList {
    
     SortedSet <User> listUsers;
    Comparator sortedComparator;
    
    /**
     * Method for initializing the usersList attributes
     */
    public UsersList()
    {
        sortedComparator = new LastNameComparator();
        this.listUsers = new TreeSet(sortedComparator);
    }
    
    /**
     * Method to initializing the iterator of userList
     * @return userList Attribute
     */
    public Iterator iterator()
    {
        return this.listUsers.iterator();
    }
    
    /**
     * Method to add a user in userList
     * @param user User attribute
     * @return userList with the added user
     */
    public boolean addUser(User user)
    {
        return this.listUsers.add(user);
    }
    
}
