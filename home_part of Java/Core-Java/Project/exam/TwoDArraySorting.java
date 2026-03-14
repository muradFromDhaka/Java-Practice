/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Arrays;
import java.util.Collections;

public class TwoDArraySorting {

    public static void main(String[] args) {
        Integer[][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };

        multyArraySort(arrays);

    }
    public static void multyArraySort(Integer[][] a) {

        for (int i = 0; i < a.length; i++) {
            Integer[] arr = a[i];
            for (int j = 0; j < a[i].length; j++) {
                for (int m = j + 1; m < a[i].length; m++) {
                    int k = 0;
                    if (a[i][j] > a[i][m]) {
                        k = a[i][m];
                        a[i][m] = a[i][j];
                        a[i][j] = k;
                    }
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
