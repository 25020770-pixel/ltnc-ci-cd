package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    private DiscountCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DiscountCalculator();
    }

    @Test
    void testVipDiscountLargeAmount() {
        assertEquals(200.0, calculator.calculateDiscount(1000.0, true), 0.001);
    }

    @Test
    void testVipDiscountSmallAmount() {
        assertEquals(50.0, calculator.calculateDiscount(500.0, true), 0.001);
    }

    @Test
    void testStandardDiscountLargeAmount() {
        assertEquals(50.0, calculator.calculateDiscount(1000.0, false), 0.001);
    }

    @Test
    void testStandardDiscountSmallAmount() {
        assertEquals(0.0, calculator.calculateDiscount(500.0, false), 0.001);
    }

    @Test
    void testNegativeAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateDiscount(-10.0, false));
    }
}
