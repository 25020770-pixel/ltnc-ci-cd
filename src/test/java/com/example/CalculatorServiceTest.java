package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService service;

    @BeforeEach
    void setUp() {
        service = new CalculatorService();
    }

    @Test
    void testMultiply() {
        assertEquals(20, service.multiply(4, 5));
        assertEquals(-15, service.multiply(3, -5));
    }

    @Test
    void testIsEven() {
        assertTrue(service.isEven(4));
        assertFalse(service.isEven(7));
    }
}
