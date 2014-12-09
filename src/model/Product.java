package model;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class Product {
    
    private String nameProduct;
    private String quantityMax;
    private String quantityMin;
    private String provider;
    private String price;
    private String category;
    private String description;
    private String img;
    
    public Product(String nameProduct, String quantityMax, String quantityMin, String provider, String price, String category, String description, String img)
    {
        this.nameProduct = nameProduct;
        this.quantityMax = quantityMax;
        this.quantityMin = quantityMin ;
        this.provider = provider;
        this.price = price;
        this.category = category;
        this.description = description ;
        this.img = img;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getQuantityMax() {
        return quantityMax;
    }

    public void setQuantityMax(String quantityMax) {
        this.quantityMax = quantityMax;
    }

    public String getQuantityMin() {
        return quantityMin;
    }

    public void setQuantityMin(String quantityMin) {
        this.quantityMin = quantityMin;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
