package model;

import java.util.Comparator;

/**
 *
 * @author Yetsenia G
 */
class NameComparator implements Comparator {

    public NameComparator() {
    }

    @Override
    public int compare(Object firstObject, Object secondObject) 
    {
        int result = ((Category) firstObject).getNameCategory().compareTo(((Category) secondObject).getNameCategory());
        
        if (result <= 0)
            return -1;
        
        return 1;
    }
    
}
