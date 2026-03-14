/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 9};
        
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending order: " + Arrays.toString(arr));
    }

}