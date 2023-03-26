package com.jscode.day05_06.repository;

import com.jscode.day05_06.entity.ProductEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByName(String name);

    List<ProductEntity> findByPriceOrderByNameDesc(long price);

    List<ProductEntity> findByNameAndPrice(String name, long price);

}
