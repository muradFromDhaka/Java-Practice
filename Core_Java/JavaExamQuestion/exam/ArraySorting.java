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
public class ArraySorting {

    public static void main(String[] args) {

        int[][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };

//        for (int k = 0; k < arrays.length; k++) {
//
//            for (int i = 0; i < arrays[k].length; i++) {
//                for (int j = i + 1; j < arrays[k].length; j++) {
//                    int tmp = 0;
//                    if (arrays[k][i] > arrays[k][j]) {
//                        tmp = arrays[k][i];
//                        arrays[k][i] = arrays[k][j];
//                        arrays[k][j] = tmp;
//                    }
//                }
//                System.out.print(arrays[k][i] + ", ");
//            }
//                    System.out.println("");
//        }
//        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
//        System.out.println("Array elements after sorting:");
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int tmp = 0;
//                if (arr[i] > arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//            System.out.println(arr[i]);
//        }
        int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        int largeNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largeNumber > arr[i]) {
                largeNumber = arr[i];
            }
        }
        System.out.println("L : " + largeNumber);
    }

}
