package com.jscode.spring.day04.Mission1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product4 {

    private final String name;
    private final Long price;

    public Product4(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
