package com.jscode.spring.day04.Example1;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // 전체 상품을 조회하는 메소드
    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    // 특정 상품을 조회하는 메소드
    @GetMapping("/product")
    public Product findOne(@RequestParam Integer id) {
        return productService.findOne(id);
    }
}