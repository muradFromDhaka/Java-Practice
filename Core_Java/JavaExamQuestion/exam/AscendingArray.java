/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;


import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        
        Arrays.sort(arr);

        System.out.println("Ascending order: " + Arrays.toString(arr));
    }

}

