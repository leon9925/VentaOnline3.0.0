
package model;

import java.util.Comparator;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class ProductComparator implements Comparator {

    @Override
    public int compare(Object firstObject, Object secondObject)
    {
        int result = ((Product) firstObject).getNameProduct().compareTo(((Product) secondObject).getNameProduct());
        
        if (result <= 0)
            return -1;
        
        return 1;
    }
}
