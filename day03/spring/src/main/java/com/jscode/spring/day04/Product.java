package com.jscode.spring.day04;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import lombok.Getter;

@Getter
//@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Product {

    private final String name;
    private final Long price;

    public Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }

}
