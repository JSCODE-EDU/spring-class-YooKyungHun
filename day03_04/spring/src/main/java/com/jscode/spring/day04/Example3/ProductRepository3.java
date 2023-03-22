package com.jscode.spring.day04.Example3;

import com.jscode.spring.day04.Example3.Product3;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository3 {

    private final List<Product3> products = List.of(
        new Product3(1000, "키보드", 10000L),
        new Product3(1001, "마우스", 20000L),
        new Product3(1002, "모니터", 30000L)
    );

    public Product3 getProductInfo(Integer id) {
        for (Product3 product: products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
