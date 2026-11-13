package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    private StringService service;

    @BeforeEach
    void setUp() {
        service = new StringService();
    }

    @Test
    void testReverseAndUpper() {
        assertEquals("OLLEH", service.reverseAndUpper("hello"));
        assertEquals("AVAJ", service.reverseAndUpper("java"));
    }

    @Test
    void testNullInput() {
        assertNull(service.reverseAndUpper(null));
    }
}
