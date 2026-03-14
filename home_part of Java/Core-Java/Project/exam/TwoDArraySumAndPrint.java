/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Arrays;
import java.util.Collections;

public class TwoDArraySumAndPrint {

    public static void main(String[] args) {
        Integer[][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };

        multyArraySum(arrays);
        multyArrayPrint(arrays);

    }

    public static void multyArraySum(Integer[][] arrays) {
        int totalSum = 0;
        for (int i = 0; i < arrays.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }
            totalSum += sum;
            System.out.println("Sum of " + i + " array: " + sum);
        }
        System.out.println("Total Sum : " + totalSum);
    }

    public static void multyArrayPrint(Integer[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + ", ");
            }
        }
        System.out.println("");
    }
}
