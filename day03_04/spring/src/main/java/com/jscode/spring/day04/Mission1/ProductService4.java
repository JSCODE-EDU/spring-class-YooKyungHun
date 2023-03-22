package com.jscode.spring.day04.Mission1;

import org.springframework.stereotype.Service;

@Service
public class ProductService4 {


    private final ProductRepository4 productRepository;

    public ProductService4(ProductRepository4 productRepository) {
        this.productRepository = productRepository;
    }

    public Product4 createProduct(CreateProductReq4 createProductInfo) {
        Product4 product = new Product4(createProductInfo.name, createProductInfo.price);
        return productRepository.createProduct(product);
    }
}
