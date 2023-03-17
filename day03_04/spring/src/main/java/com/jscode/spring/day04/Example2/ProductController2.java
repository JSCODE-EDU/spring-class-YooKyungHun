package com.jscode.spring.day04.Example2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController2 {

    private final ProductService2 productService;

    public ProductController2(ProductService2 productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public Product2 createProduct(@RequestBody CreateProductReq createProductInfo) {
        Product2 tmp = productService.createProduct(createProductInfo);
        return tmp;
    }
}
