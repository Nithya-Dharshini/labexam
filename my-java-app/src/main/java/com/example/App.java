package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Keep the application running indefinitely
        try {
            // Sleep for 1 hour (3600000 milliseconds)
            Thread.sleep(3600000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

