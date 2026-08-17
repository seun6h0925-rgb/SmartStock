package com.smartstock.controller;

import com.smartstock.repository.ProductRepository;

public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }
}