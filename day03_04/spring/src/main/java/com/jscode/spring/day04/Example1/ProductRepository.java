package com.jscode.spring.day04.Example1;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private final List<Product> products = List.of(
        new Product(1, "키보드", 50000L),
        new Product(2, "마우스", 10000L),
        new Product(3, "모니터", 200000L)
    );

    // 전체 상품을 조회하는 메소드
    public List<Product> findAll() {
        return products;
    }

    // 특정 상품을 조회하는 메소드
    public Product findOne(Integer id) {
        for (Product product: products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}