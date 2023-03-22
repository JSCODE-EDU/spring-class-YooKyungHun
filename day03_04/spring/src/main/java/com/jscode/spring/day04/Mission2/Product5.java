package com.jscode.spring.day04.Mission2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product5 {

    private final String name;
    private Long price;

    public Product5(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
