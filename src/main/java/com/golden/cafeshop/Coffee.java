package com.golden.cafeshop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Coffee {

    private final CoffeeType type;
    private final int beans;
    private final int milk;

}
