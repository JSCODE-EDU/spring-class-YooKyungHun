package com.jscode.spring.day04.Example2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository2 {
    private final List<Product2> products = new ArrayList<>();

    public Product2 createProduct(Product2 product) {
        products.add(product);
        return products.get(products.size()-1);
    }
}
