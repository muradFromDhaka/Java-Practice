/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Arrays;
import java.util.Collections;

public class TwoDArraySort {

    public static void main(String[] args) {
        Integer[][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };

        
//////Print Sum of Array 
//     int totalSum = 0;
//        for (int i = 0; i < arrays.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arrays[i].length; j++) {
//               sum+=arrays[i][j];
////               totalSum+=arrays[i][j];
//            }
//            totalSum+=sum;
//            System.out.println("Sum of " + i +" array: " + sum);
//        }
//  System.out.println("Total Sum : " + totalSum);



        //////Print Sum of Array 02

//        int sumTotal = 0;
//        for (Integer[] array : arrays) {
//            int sum = 0;
//            for (Integer integer : array) {
//                sum+= integer;
//            }
//            sumTotal+= sum;
//            System.out.println("Local Sum: "+ sum);
//        }
//    System.out.println("Total Sum: "+ sumTotal);



//////Print val 01
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println("SubArray no: "+ i);
//            for (int j = 0; j < arrays[i].length; j++) {
//               System.out.println("   " + j +" value: " + arrays[i][j]);
//            }
//        }

//////Print val 02

//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println("");
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.print(arrays[i][j] + ", ");
//            }
//        }
//        System.out.println("");
        
        
        System.out.println("Assending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val);
            System.out.println(Arrays.toString(val));
        }
        
        System.out.println("Dccending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val, Collections.reverseOrder());
            System.out.println(Arrays.toString(val));
        }
    }
}
