/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author B-4
 */
public class Exercise25 {

    public static void main(String args[]) {
        exercise1();

        exercise2();

        exercise3();
    }

    public static void exercise3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) {

            for (int spc = n - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }

    public static void exercise1() {
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println("");
        }
    }

    public static void exercise2() {
        int i, j, n, s, x;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        s = n + 4 - 1;
        for (i = 1; i <= n; i++) {
            for (x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
