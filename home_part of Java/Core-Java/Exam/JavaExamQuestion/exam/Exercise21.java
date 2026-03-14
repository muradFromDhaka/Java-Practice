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
public class Exercise21 {

    public static void main(String[] args) {
        int i, j, r;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt(); //5
        for (i = 0; i <= r; i++) {  //0 1 2 3 4 5
            for (j = 1; j <= r - i; j++) {
                System.out.print(".");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++) {
                System.out.print(".");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
