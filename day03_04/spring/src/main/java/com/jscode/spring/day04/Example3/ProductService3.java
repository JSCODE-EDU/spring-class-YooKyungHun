package com.jscode.spring.day04.Example3;

import org.springframework.stereotype.Service;

@Service
public class ProductService3 {

    private final ProductRepository3 productRepository;

    public ProductService3(ProductRepository3 productRepository) {
        this.productRepository = productRepository;
    }

    public Product3 getProductInfo(Integer id) {
        Product3 product = productRepository.getProductInfo(id);
        product.setPrice(product.getPrice()/1300);
        return product;
    }
}