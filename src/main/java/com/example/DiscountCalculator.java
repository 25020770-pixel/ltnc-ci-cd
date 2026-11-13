package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscountCalculator {
    private static final Logger logger = LoggerFactory.getLogger(DiscountCalculator.class);

    public double calculateDiscount(double amount, boolean isVip) {
        logger.info("Calculating discount for amount: {}, isVip: {}", amount, isVip);
        if (amount < 0) {
            logger.error("Invalid negative amount: {}", amount);
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (isVip) {
            if (amount >= 1000) {
                return amount * 0.20;
            } else {
                return amount * 0.10;
            }
        } else {
            if (amount >= 1000) {
                return amount * 0.05;
            }
            return 0.0;
        }
    }
}
