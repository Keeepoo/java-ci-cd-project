package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGenerateGreeting() {
        String greeting = App.generateGreeting();
        assertNotNull(greeting);
        assertTrue(greeting.contains("CI/CD"));
    }

    @Test
    public void testCalculateSum() {
        assertEquals(12, App.calculateSum(5, 7));
        assertEquals(0, App.calculateSum(0, 0));
        assertEquals(-5, App.calculateSum(2, -7));
    }

    @Test
    public void testMainMethod() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}