package com.smartstock.model;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Product(int stockQuantity, int price, Category category, String productName, int productId) {
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.category = category;
        this.productName = productName;
        this.productId = productId;
    }

    private int productId;
    private String productName;
    private Category category;
    private int price;
    private int stockQuantity;

}
