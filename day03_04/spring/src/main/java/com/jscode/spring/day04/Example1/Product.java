package com.jscode.spring.day04.Example1;

import lombok.Getter;

@Getter
public class Product {

    private final Integer id;
    private final String name;
    private final Long price;

    public Product(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
