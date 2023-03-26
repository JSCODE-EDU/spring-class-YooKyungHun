package com.jscode.day05_06.service;

import com.jscode.day05_06.entity.ProductEntity;
import com.jscode.day05_06.repository.ProductJpaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductJpaRepository productJpaRepository;


    public ProductService(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    public List<ProductEntity> findAll() {
        return productJpaRepository.findAll();
    }

    public void save(ProductEntity product) {
        productJpaRepository.save(product);
    }

    public Optional<ProductEntity> findById(Long id) {
        Optional<ProductEntity> product = productJpaRepository.findById(id);
        return product;
    }

    public List<ProductEntity> findByName(String name) {
        return productJpaRepository.findByName(name);
    }

    public List<ProductEntity> findByPriceOrderByNameDesc(long price) {
        return productJpaRepository.findByPriceOrderByNameDesc(price);
    }

    public List<ProductEntity> findByNameAndPrice(String name, long price) {
        return productJpaRepository.findByNameAndPrice(name, price);
    }
}
