package model;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class Category {
    
        private String nameCategory;
        
    public Category(String Category)
    {
        this.nameCategory = Category;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
