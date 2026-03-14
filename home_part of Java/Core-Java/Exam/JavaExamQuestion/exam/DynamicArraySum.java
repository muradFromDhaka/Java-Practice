/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;


import java.util.Arrays;
import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input comma separated numbers: ");

        String line = input.nextLine();
        String[] array = line.split(",");
        System.out.print("The array : " + Arrays.toString(array));

        int sum = 0;
        for (String n : array) {
            n = n.trim();
            sum += Integer.parseInt(n);
        }

        System.out.println("\nSum: " + sum);
    }
}
