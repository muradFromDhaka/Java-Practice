/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dhyaka
 */
public class Solving1 {

    //1.Find out the conditional Sum until input (-1). 
    public static void sum() {
        Scanner s = new Scanner(System.in);
        int sum = 0, input;
        System.out.println("Enter the numbers ( if input given -1, sum complete...");
        while ((input = s.nextInt()) != -1) {
            sum += input;
        }
        System.out.println("The Sum: " + sum);
        System.out.println();
    }

    //2. Print an Array and sum of the Array elements.
    public static void arrayPrint(int[] n) {
        int sum = 0;
        for (int x : n) {
            sum += x;
            System.out.println(x);
        }
        System.out.println("Total: " + sum);
    }

    //3.Print an 2d Array and sum of the Array elements.
    public static void array2dPrint(int[][] arr) {
        for (int[] x : arr) {
            System.out.println("2d ArrayPrint: " + Arrays.toString(x));
        }

        int sum = 0;
        for (int[] x : arr) {
            for (int y : x) {
                sum += y;
            }
        }
        System.out.println("Total value: " + sum);
    }

    //4.Calculate factorial value of a number.
    public static long factorialValue(long n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        System.out.println("The factorialValue: " + sum);
        return 0L;
    }

    //5.Check prime number using Scanner
    public static void Prime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }

    //6.0 Array Sorting ascending or descending order.(Ascending)
    public static void bubblAscSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Asc Sort: " + Arrays.toString(array));
    }

    //6.1 Array Sorting ascending or descending order.(Descending)
    public static void bubblDescSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Desc Sort: " + Arrays.toString(array));
        System.out.println();
    }

    //7.0 2dArray Sorting ascending or descending order.(Ascending)
    public static void SortAsc(Integer[][] a) {
        for (Integer[] x : a) {
            Arrays.sort(x);
            System.out.println("Asc Sort: " + Arrays.toString(x));
        }
        System.out.println();
    }

    //7.1 2dArray Sorting ascending or descending order.(Descending)
    public static void SortDesc(Integer[][] a) {
        for (Integer[] x : a) {
            Arrays.sort(x, Collections.reverseOrder());
            System.out.println("Desc Sort: " + Arrays.toString(x));
        }
        System.out.println();
    }

    //8.Check the largest number among the three numbers.
    public static void largestNum(int a, int b, int c) {
        int largest;
        if (a > b && b > c) {
            largest = a;
            System.out.println("The largestValue: " + largest);
        } else if (b > a && b > c) {
            largest = b;
            System.out.println("The largestValue: " + largest);
        } else {
            largest = c;
            System.out.println("The largestValue: " + largest);
        }
    }

    //9. Check the largest number from an array.
    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("the largest value:" + largest);
        System.out.println();
        return largest;
    }
    //10.Retrieve Email address from a text field and validate whether “@” symbol  

    //11.Find out the Max-Min number among n number of values.
    public static void Max_Min(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("largest numbers:" + max);
        System.out.println("smallest numbers:" + min);
        System.out.println();
    }

    //12.Find out the ten unique Random numbers.
    public static void randomValue(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println("Random value " + (i + 1) + ": " + rand.nextInt(100));
        }
    }

    //13.Check the odd or even number by giving input during runtime.
    public static void Odd_even(int n) {
        if (n % 2 == 1) {
            System.out.println(n + " is an odd number.");
            return;
        }
        System.out.println(n + " is an even number.");
    }

    public static void main(String[] args) {
        int[] arr = {23, 21, 34, 21, 12, 14, 53};
        int[][] array = {{2, 5, 3, 6, 3}, {3, 7, 4, 2}};
        Integer[][] array1 = {{9, 5, 21, 6, 3}, {12, 7, 15, 17}};

        sum();
        arrayPrint(arr);
        array2dPrint(array);
        factorialValue(9);
        bubblAscSort(arr);
        bubblDescSort(arr);
        SortAsc(array1);
        SortDesc(array1);
        largest(arr);
        Max_Min(arr);
        randomValue(10);
        Odd_even(22);

        //Prime:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = s.nextInt();
        Prime(n);

        //find largest Number:
        System.out.println("Enter First value:");
        int a = s.nextInt();
        System.out.println("Enter 2nd value:");
        int b = s.nextInt();
        System.out.println("Enter 3rd value:");
        int c = s.nextInt();
        largestNum(a, b, c);

    }
}
