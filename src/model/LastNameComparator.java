package model;

import java.util.Comparator;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class LastNameComparator implements Comparator {
   
    @Override
    public int compare(Object firstObject, Object secondObject)
    {
        int result = ((User) firstObject).getLastName().compareTo(((User) secondObject).getLastName());
        
        if (result <= 0)
            return -1;
        
        return 1;
    }
}
