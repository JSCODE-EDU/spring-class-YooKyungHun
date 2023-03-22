package com.jscode.spring.day04.Mission2;

import com.jscode.spring.day04.Mission1.ProductService4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products5")
public class ProductController5 {

    private final ProductService5 productService;

    public ProductController5(ProductService5 productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public Product5 productInfo(@RequestParam String name, @RequestParam String monetaryUnit) {
        return productService.productInfo(name, monetaryUnit);
    }
}
