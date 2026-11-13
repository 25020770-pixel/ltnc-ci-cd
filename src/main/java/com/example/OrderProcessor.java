package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderProcessor {
    private static final Logger logger = LoggerFactory.getLogger(OrderProcessor.class);

    public double processOrder(String orderId, double price, int quantity) {
        logger.info("Starting order processing: orderId={}, price={}, quantity={}", orderId, price, quantity);

        if (orderId == null || orderId.trim().isEmpty()) {
            logger.error("Order processing rejected: Invalid empty orderId");
            throw new IllegalArgumentException("Order ID cannot be empty");
        }

        if (price <= 0 || quantity <= 0) {
            logger.error("Order processing failed for orderId={}: Non-positive values (price={}, quantity={})",
                    orderId, price, quantity);
            throw new IllegalArgumentException("Price and quantity must be positive");
        }

        double total = price * quantity;
        logger.info("Order processed successfully: orderId={}, totalAmount={}", orderId, total);
        return total;
    }
}
