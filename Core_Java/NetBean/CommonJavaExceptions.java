package com.abc.myfirstproject.exceptionExample;


// CommonJavaExceptions.java
import java.io.*;

public class CommonJavaExceptions {

       public static void main(String[] args) {
        nullExample();
        System.out.println("Hello");
        
        
        
//        arithmeticExample();
//        arrayIndexOutOfBoundsExample();
//        ioExceptionExample();
//        numberFormatExceptionExample();
//        classNotFoundExceptionExample();
    }
    
    
    // 1. NullPointerException
    public static void nullExample() {
            String s = null;
            System.out.println(s.length()); 
    }

    // 2. ArithmeticException
    public static void arithmeticExample() {
        try {
            int result = 10 / 0; // Causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // 3. ArrayIndexOutOfBoundsException
    public static void arrayIndexOutOfBoundsExample() {
        try {
            int[] arr = new int[3];
            arr[5] = 100; // Causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // 4. IOException
    public static void ioExceptionExample() {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt"); // Causes IOException
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // 5. NumberFormatException
    public static void numberFormatExceptionExample() {
        try {
            int num = Integer.parseInt("abc"); // Causes NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    // 6. ClassNotFoundException
    public static void classNotFoundExceptionExample() {
        try {
            Class.forName("com.fake.ClassName"); // Causes ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }

    // Main method to run all examples
//    public static void main(String[] args) {
//        nullPointerExample();
//        arithmeticExample();
//        arrayIndexOutOfBoundsExample();
//        ioExceptionExample();
//        numberFormatExceptionExample();
//        classNotFoundExceptionExample();
//    }
}

