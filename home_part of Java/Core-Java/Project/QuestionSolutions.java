/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.problemSolving;

import java.util.*;

public class QuestionSolutions {

    // Q01: Fibonacci Number
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Q02: Factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Q03: Prime Numbers from 1 to n
    public static void primes(int n) {
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();
    }

    // Q04: Sort Multidimensional Array
    public static void sort2DArray(int[][] arr) {
        int rows = arr.length, cols = arr[0].length;
        int[] flat = new int[rows * cols];
        int k = 0;
        for (int[] row : arr)
            for (int val : row)
                flat[k++] = val;
        Arrays.sort(flat);
        k = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = flat[k++];
        System.out.println("Sorted 2D Array:");
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }

    // Q05: Sort Array in Reverse Order
    public static void reverseSortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Reverse Sorted Array: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Q06: Max and Min among n values
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    // Q07: Ten Unique Random Numbers
    public static void uniqueRandomNumbers() {
        Set<Integer> numbers = new LinkedHashSet<>();
        Random rand = new Random();
        while (numbers.size() < 10)
            numbers.add(rand.nextInt(100));
        System.out.println("10 Unique Random Numbers: " + numbers);
    }

    // Q08: Conditional Sum until input 0
    public static void conditionalSum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, input;
        System.out.println("Enter numbers (0 to stop):");
        while ((input = sc.nextInt()) != 0)
            sum += input;
        System.out.println("Conditional Sum: " + sum);
    }

    // Q09: Odd-Even from n numbers
    public static void oddEven(int[] arr) {
        for (int val : arr)
            System.out.println(val + " is " + (val % 2 == 0 ? "Even" : "Odd"));
    }

    // Q10: Power Calculation
    public static double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Q11: Conditional Sum until input -1
    public static void conditionalSumUntilMinusOne() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, input;
        System.out.println("Enter numbers (-1 to stop):");
        while ((input = sc.nextInt()) != -1)
            sum += input;
        System.out.println("Conditional Sum: " + sum);
    }

    // Q12: Print Array and Sum
    public static void printArraySum(int[] arr) {
        int sum = 0;
        System.out.print("Array Elements: ");
        for (int val : arr) {
            sum += val;
            System.out.print(val + " ");
        }
        System.out.println("\nSum: " + sum);
    }

    // Q13: 2D Array and Sum
    public static void print2DArraySum(int[][] arr) {
        int sum = 0;
        System.out.println("2D Array:");
        for (int[] row : arr) {
            for (int val : row) {
                sum += val;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }

    // Q14: Check Prime Number using Scanner
    public static void checkPrimeScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Prime: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2) isPrime = false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        System.out.println(n + " is " + (isPrime ? "Prime" : "Not Prime"));
    }

    // Q15: Sort Array Asc/Desc
    public static void sortArray(int[] arr, boolean ascending) {
        Arrays.sort(arr);
        System.out.print(ascending ? "Ascending: " : "Descending: ");
        if (ascending)
            for (int val : arr) System.out.print(val + " ");
        else
            for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Q16: Largest among three numbers
    public static void largestOfThree(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + max);
    }

    // Q17: Largest in Array
    public static void largestInArray(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        System.out.println("Largest: " + max);
    }

    // Q18: Validate Email Address
    public static void validateEmail(String email) {
        if (email.contains("@"))
            System.out.println("Valid email");
        else
            System.out.println("Invalid email (missing '@')");
    }

    // Q19: Class and Interface Example
    interface Human {
        void exampleMethod();
    }

    abstract static class Pakna {
        abstract void searchThePakna();
    }

    static class Student extends Pakna implements Human {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public void exampleMethod() {
            System.out.println("Implemented Human interface.");
        }

        @Override
        void searchThePakna() {
            System.out.println("Searching the Pakna...");
        }
    }

    // Main Method to Test
    public static void main(String[] args) {
        fibonacci(10);
        System.out.println("Factorial: " + factorial(5));
        primes(20);

        int[][] array2D = {{9, 2}, {6, 3}};
        sort2DArray(array2D);

        int[] array = {5, 2, 9, 1};
        reverseSortArray(array);
        findMaxMin(array);
        uniqueRandomNumbers();
        conditionalSum();
        oddEven(array);
        System.out.println("Power: " + calculatePower(2, 3));
        conditionalSumUntilMinusOne();
        printArraySum(array);
        print2DArraySum(array2D);
        checkPrimeScanner();
        sortArray(array, true);
        sortArray(array, false);
        largestOfThree(7, 15, 3);
        largestInArray(array);
        validateEmail("test@example.com");

        Student s = new Student(1, "Rahim");
        s.exampleMethod();
        s.searchThePakna();
    }
}
