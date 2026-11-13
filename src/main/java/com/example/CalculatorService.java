package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorService {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public int multiply(int a, int b) {
        logger.info("Executing multiply: {} * {}", a, b);
        return a * b;
    }

    public boolean isEven(int number) {
        logger.info("Checking if {} is even", number);
        return number % 2 == 0;
    }
}
