/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.exceptionExample;


// ExceptionHandlingExamples.java
public class ExceptionHandlingExamples {

    // 1. Try-Catch Example
    public static void tryCatchExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. Try-Catch: " + e.getMessage());
        }
    }

    // 2. Multiple Catch Blocks
    public static void multipleCatchExample() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("2. Arithmetic Exception occurred.");
        } catch (NullPointerException e) {
            System.out.println("2. Null Pointer Exception occurred.");
        }
    }

    // 3. Catch with Finally
    public static void catchFinallyExample() {
        try {
            int[] arr = new int[2];
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3. Array index out of bounds.");
        } finally {
            System.out.println("3. Finally block executed.");
        }
    }

    // 4. Try-Finally (No Catch)
    public static void tryFinallyExample() {
        try {
            System.out.println("4. Try block executed.");
        } finally {
            System.out.println("4. Finally without catch.");
        }
    }

    // 5. Throw Keyword
    public static void throwExample() {
        int age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("5. You must be 18+");
        }
    }

    // 6. Throws Keyword
    public static void throwsExample() throws java.io.IOException {
        throw new java.io.IOException("6. File not found.");
    }

    // 7. Custom Exception
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void customExceptionExample() throws InvalidAgeException {
        int age = 16;
        if (age < 18) {
            throw new InvalidAgeException("7. Not eligible for license.");
        }
    }

    public static void main(String[] args) {
        // 1
        tryCatchExample();

        // 2
        multipleCatchExample();

        // 3
        catchFinallyExample();

        // 4
        tryFinallyExample();

        // 5
        try {
            throwExample();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 6
        try {
            throwsExample();
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

        // 7
        try {
            customExceptionExample();
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
