package com.golden.cafeshop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CoffeeType {

    Espresso(7,0),
    Latte(7,227),
    FilterCoffee(10,0);

    private final int requiredBeans;
    private final int requiredMilk;

}
