package com.jscode.spring.day04.Mission2;

import org.springframework.stereotype.Service;

@Service
public class ProductService5 {

    private final ProductRepository5 productRepository;

    public ProductService5(ProductRepository5 productRepository) {
        this.productRepository = productRepository;
    }

    public Product5 productInfo(String name, String monetaryUnit) {

        Product5 product = productRepository.productInfo(name);
        if (monetaryUnit.equals("dollar")) {
            product.setPrice(product.getPrice()/1300);
        }
        return product;
    }
}
