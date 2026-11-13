package com.example;

import java.io.File;
import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PathHandlerTest {
    private PathHandler handler;

    @BeforeEach
    void setUp() {
        handler = new PathHandler();
    }

    @Test
    void testCrossPlatformPathResolution() {
        Path path = handler.buildPath("app", "logs", "app.log");
        assertNotNull(path);
        assertTrue(path.endsWith("app.log"));
    }

    @Test
    void testFileSeparatorCompatibility() {
        String relativePath = handler.buildRelativePath("data", "output.csv");
        String expected = "data" + File.separator + "output.csv";
        assertEquals(expected, relativePath);
    }
}
