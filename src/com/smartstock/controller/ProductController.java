package com.smartstock.controller;

import com.smartstock.repository.ProductRepository;
import com.smartstock.model.Product;
import com.smartstock.model.Category;

public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    public void registerProduct(int productId, String productName,
                                Category category, int price, int stockQuantity) {

        Product product = new Product(
                stockQuantity,
                price,
                category,
                productName,
                productId
        );

        repository.addProduct(product);
    }

    public void showAllProducts() {

        for (Product product : repository.findAllProducts()) {
            System.out.println(product);
        }
    }


    public void showProductById(int productId) {

        Product product = repository.findById(productId);

        if (product == null) {
            System.out.println("[오류] 해당 상품이 없습니다.");
            return;
        }

        System.out.println(product);
    }

    public void updateProduct(int productId, String productName,
                              Category category, int price, int stockQuantity) {

        Product product = new Product(
                stockQuantity,
                price,
                category,
                productName,
                productId
        );

        boolean result = repository.updateProduct(product);

        if (result) {
            System.out.println("상품이 수정되었습니다.");
        } else {
            System.out.println("[오류] 해당 상품이 없습니다.");
        }
    }
    public void deleteProduct(int productId) {

        boolean result = repository.deleteProduct(productId);

        if (result) {
            System.out.println("상품이 삭제되었습니다.");
        } else {
            System.out.println("[오류] 해당 상품이 없습니다.");
        }
    }

    public void showProductsByCategory(Category category) {

        for (Product product : repository.findByCategory(category)) {
            System.out.println(product);
        }
    }

    public void showLowStockProducts(int quantity) {

        for (Product product : repository.findLowStockProducts(quantity)) {
            System.out.println(product);
        }
    }


}