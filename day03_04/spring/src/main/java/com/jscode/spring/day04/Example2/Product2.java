package com.jscode.spring.day04.Example2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product2 {

    private Integer id;
    private final String name;
    private final Long price;

    public Product2(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
