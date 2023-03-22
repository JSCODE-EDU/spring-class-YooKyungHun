package com.jscode.spring.day04.Mission2;

import com.jscode.spring.day04.Example3.Product3;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository5 {

    private final List<Product5> products = List.of(
        new Product5("키보드", 10000L),
        new Product5("마우스", 20000L),
        new Product5("모니터", 30000L)
    );

    public Product5 productInfo(String name) {
        for (Product5 product: products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
