package com.jscode.spring.day04.Example2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ProductService2 {

    private final ProductRepository2 productRepository;

    private Random random = new Random();

    public ProductService2(ProductRepository2 productRepository) {
        this.productRepository = productRepository;
    }

    public Product2 createProduct(CreateProductReq createProductInfo) {
        String name = createProductInfo.name;
        Long price = createProductInfo.price;

        int id = random.nextInt(100000);
        Product2 product = new Product2(id, name, price);

        return productRepository.createProduct(product);
    }
}
