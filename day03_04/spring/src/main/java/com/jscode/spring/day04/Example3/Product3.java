package com.jscode.spring.day04.Example3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product3 {
    private Integer id;
    private final String name;
    private Long price;

    public Product3(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
