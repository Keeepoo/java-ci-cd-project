package com.example;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Java CI/CD Demo Application ===");
        System.out.println("Version: 1.0.0");
        System.out.println("Current time: " + LocalDateTime.now());

        String message = generateGreeting();
        System.out.println("\n" + message);

        int result = calculateSum(5, 7);
        System.out.println("Calculation test: 5 + 7 = " + result);
    }

    public static String generateGreeting() {
        return "Hello from CI/CD Pipeline!";
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }
}