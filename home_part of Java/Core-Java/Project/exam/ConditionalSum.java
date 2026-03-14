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

import java.util.Scanner;

public class ConditionalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers to calculate the conditional sum: ");

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            sum += input;
        }

        System.out.println("Conditional sum: " + sum);
    }
}
