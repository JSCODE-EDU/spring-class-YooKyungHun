package com.jscode.spring.day04.Mission1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products4")
public class ProductController4 {

    private final ProductService4 productService;


    public ProductController4(ProductService4 productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public Product4 createProduct(@RequestBody CreateProductReq4 createProductInfo) {
        return productService.createProduct(createProductInfo);
    }
}
