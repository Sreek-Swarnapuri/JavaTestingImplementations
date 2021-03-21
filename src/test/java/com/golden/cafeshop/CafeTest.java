package com.golden.cafeshop;

import org.junit.jupiter.api.*;

public class CafeTest {

    public static final int ESPRESSO_BEANS_IN_GRAMS = 7;
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;

    Cafe cafe;

    /*
        BeforeAll is used to execute the block of static code
        Before all tests in this class are executed
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("---------Start---------");
    }

    /*
        BeforeEach is used to execute the block of code
        before each test in this class
     */
    @BeforeEach
    public void setup() {
        cafe = new Cafe();
        System.out.println("Before");
    }

    /*
        AfterEach is used to execute the block of code
        After each test in this class
     */
    @AfterEach
    public void afterEach() {
        System.out.println("After");
    }

    /*
        AfterAll is used to execute the block of static code
        After all tests in this class are executed
     */
    @AfterAll
    public static void afterAll() {
        System.out.println("----------End----------");
    }

    @Test
    public void shouldBrewEspresso() {
        // Given - Precondition
        cafe.restockBeans(ESPRESSO_BEANS_IN_GRAMS);

        // When - Behaviour
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        // Then - Post-condition
        Assertions.assertEquals(ESPRESSO_BEANS_IN_GRAMS, coffee.getBeans(), "Incorrect number of beans");
        Assertions.assertEquals(NO_MILK, coffee.getMilk(), "Incorrect quantity of milk");
        Assertions.assertEquals(CoffeeType.Espresso, coffee.getType(), "Incorrect CoffeeType");
    }

    @Test
    public void shouldUpdateStockLevels() {
        // Given
        cafe.restockBeans(ESPRESSO_BEANS_IN_GRAMS);

        // When
        cafe.brew(CoffeeType.Espresso);

        // Then
        Assertions.assertEquals(NO_BEANS, cafe.getBeansInStock());
    }

    @Test
    public void shouldRequireBeansToBrew() {
        // Given - Created in setup

        // Then
        Assertions.assertThrows(IllegalStateException.class, () -> {
            // When
            cafe.brew(CoffeeType.Espresso);
        });

    }

}
