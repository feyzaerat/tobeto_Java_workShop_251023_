package org.example.models;

public class Product {
    int productId;

    int categoryId;

    String productName;
    int unitPrice;
    int quantityStock;
    boolean isInStock;

    public Product(){}

    public Product(int productId, int categoryId, String productName, int unitPrice, int quantityStock, boolean isInStock){
        this.productId     = productId;
        this.categoryId    = categoryId;
        this.productName   = productName;
        this.unitPrice     = unitPrice;
        this.quantityStock = quantityStock;
        this.isInStock     = isInStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


}

