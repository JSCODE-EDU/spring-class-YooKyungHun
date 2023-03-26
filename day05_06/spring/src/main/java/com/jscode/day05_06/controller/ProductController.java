package com.jscode.day05_06.controller;

import com.jscode.day05_06.entity.ProductEntity;
import com.jscode.day05_06.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // 연습문제
    // product 전체 조회
    @GetMapping("/product")
    public List<ProductEntity> findAll() {
        return productService.findAll();
    }

    // 연습문제
    // product 객체 저장
    @PostMapping("/product")
    public String saveProduct(@RequestBody ProductEntity product) {
        productService.save(product);
        return product.getName() + "이 저장되었습니다.";
    }

    // 미션
    // id 로 product 조회
    @GetMapping(value = "/product", params = "id")
    public Optional<ProductEntity> findById(@RequestParam long id) {
        return productService.findById(id);
    }

    // 심화미션
    // name 으로 product 조회
    @GetMapping(value = "/product", params = "name")
    public List<ProductEntity> findByName(@RequestParam String name) {
        return productService.findByName(name);
    }

    // 심화미션
    // price 로 product 조회 후 name 으로 내림차순 정렬
    @GetMapping(value = "/product", params = "price")
    public List<ProductEntity> findByPriceOrderByNameDesc(@RequestParam long price) {
        return productService.findByPriceOrderByNameDesc(price);
    }

    // 심화미션
    // name 과 price 로 product 조회
    @GetMapping(value = "/product", params = {"name", "price"})
    public List<ProductEntity> findByNameAndPrice(@RequestParam String name,
                                                  @RequestParam long price) {
        return productService.findByNameAndPrice(name, price);
    }

}
