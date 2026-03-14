/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author B-4
 */
public class ArraySorting {

    public static void main(String[] args) {

        int[][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };

        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        arraySortNormalOrder(arr);
        System.out.println("");
        arraySortReverseOrder(arr);
        System.out.println("");

    }

    public static void arraySortNormalOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {  //5  -2
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {  //(12 > 5)
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Array elements in ascending order:");
//accessing element of the array  
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arraySortReverseOrder(int[] a) {
        int temp;
//initializing an array  
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
//accessing element of the array  
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void arraySortUsingArraysMethodNormalOrder(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Ascending order: " + Arrays.toString(arr));
    }

    public static void arraySortUsingArraysMethodReverseOrder(Integer[] arr) {

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending order: " + Arrays.toString(arr));
    }

}
