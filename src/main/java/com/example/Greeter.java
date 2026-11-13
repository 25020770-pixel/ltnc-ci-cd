package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Greeter service for greeting users.
 */
public class Greeter {

  private static final Logger logger = LoggerFactory.getLogger(Greeter.class);

  /**
   * Generates greeting message for a user.
   *
   * @param name person name
   * @return greeting message
   */
  public String greet(String name) {
    logger.info("Greeting user: {}", name);
    if (name == null || name.trim().isEmpty()) {
      return "Hello, Guest!";
    }
    return "Hello, " + name.trim() + "!";
  }
}
