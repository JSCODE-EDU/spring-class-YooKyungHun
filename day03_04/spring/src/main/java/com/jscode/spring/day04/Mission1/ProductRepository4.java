package com.jscode.spring.day04.Mission1;

import com.jscode.spring.day04.Mission1.Product4;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository4 {

    private final List<Product4> products = new ArrayList<>();


    public Product4 createProduct(Product4 product) {
        products.add(product);
        return product;
    }
}
