package com.jscode.spring.day04.Example3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController3 {

    private final ProductService3 productService;


    public ProductController3(ProductService3 productService) {
        this.productService = productService;
    }

    // 상품 조회
    @GetMapping("/id/{id}")
    public Product3 getProductInfo(@PathVariable("id") String id) {
        return productService.getProductInfo(Integer.valueOf(id));
    }
}
