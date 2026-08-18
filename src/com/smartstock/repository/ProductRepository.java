package com.smartstock.repository;

import com.smartstock.model.Category;
import com.smartstock.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> findAllProducts() {
        return products;
    }

    public Product findById(int productId) {

        return products.stream()
                .filter(product -> product.getProductId() == productId)
                .findFirst()
                .orElse(null);
    }

    public boolean updateProduct(Product updatedProduct) {

        Product product = findById(updatedProduct.getProductId());

        if (product == null) {
            return false;
        }

        product.setProductName(updatedProduct.getProductName());
        product.setCategory(updatedProduct.getCategory());
        product.setPrice(updatedProduct.getPrice());
        product.setStockQuantity(updatedProduct.getStockQuantity());

        return true;
    }

    public boolean deleteProduct(int productId) {

        Product product = findById(productId);

        if (product == null) {
            return false;
        }

        products.remove(product);
        return true;
    }

    public List<Product> findByCategory(Category category) {

        return products.stream()
                .filter(product -> product.getCategory() == category)
                .toList();
    }

    public List<Product> findLowStockProducts(int quantity) {

        return products.stream()
                .filter(product -> product.getStockQuantity() <= quantity)
                .toList();
    }


}
