package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreeterTest {

  private Greeter greeter;

  @BeforeEach
  void setUp() {
    greeter = new Greeter();
  }

  @Test
  void testGreetValidName() {
    assertEquals("Hello, Alice!", greeter.greet("Alice"));
  }

  @Test
  void testGreetEmptyOrNullName() {
    assertEquals("Hello, Guest!", greeter.greet(null));
    assertEquals("Hello, Guest!", greeter.greet("   "));
  }
}
