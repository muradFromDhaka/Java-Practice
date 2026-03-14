/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author B-4
 */

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;
        
        System.out.print("The array : " + Arrays.toString(array));
        
        for (int n : array) {
            sum += n;
        }
        System.out.println("\nSum: " + sum);
    }

}
