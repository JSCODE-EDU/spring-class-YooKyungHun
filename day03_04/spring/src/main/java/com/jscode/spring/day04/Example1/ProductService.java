package com.jscode.spring.day04.Example1;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // 전체 상품을 조회하는 메소드
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // 특정 상품을 조회하는 메소드
    public Product findOne(Integer id) {
        return productRepository.findOne(id);
    }
}