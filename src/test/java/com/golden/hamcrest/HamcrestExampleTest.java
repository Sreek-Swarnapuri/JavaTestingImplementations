package com.golden.hamcrest;

import com.golden.cafeshop.Coffee;
import com.golden.cafeshop.CoffeeType;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.*;

public class HamcrestExampleTest {

    /*
     Using Hamcrest to validate values in a HashMap
     */
    @Test
    public void mapMustContainValue() {
        Map<String, Integer> values = new HashMap<>();
        values.put("A", 1);
        values.put("B", 2);
        values.put("C", 3);

        //Using Hamcrest
        MatcherAssert.assertThat(values, Matchers.hasKey("B"));
    }

    /*
    Using Hamcrest to check the numbers in a list irrespective of any order
     */
    @Test
    public void listOrderingIsIrrelevant() {
        List<Integer> integers = Arrays.asList(5, 4, 1, 2, 3);

        MatcherAssert.assertThat(integers, Matchers.containsInAnyOrder(1, 2, 3, 4, 5));
    }

    /*
    Using Hamcrest to check the property value in an object
     */
    @Test
    public void checkProperties() {
        Coffee coffee = new Coffee(CoffeeType.Espresso, 7, 0);

        MatcherAssert.assertThat(coffee, Matchers.hasProperty("beans", Matchers.is(7)));
    }

    /*
    Using Hamcrest to check the objects in a list
     */
    @Test
    public void composition() {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(CoffeeType.Espresso,7,0));
        coffees.add(new Coffee(CoffeeType.FilterCoffee,10,0));

        MatcherAssert.assertThat(coffees, Matchers.contains(
                Matchers.hasProperty("beans", Matchers.is(7)),
                Matchers.hasProperty("beans",Matchers.is(10))
        ));
    }

}
