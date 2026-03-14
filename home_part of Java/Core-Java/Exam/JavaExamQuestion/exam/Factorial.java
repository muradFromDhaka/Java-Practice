/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");  //5,4,3,2,1
        int num = input.nextInt();
        int fact = 1;  // 5 * 4 * 3 * 2 * 1  =120
//        for(int i = num; i >= 1; i--) {
//            fact = fact * i;
//        }
        fact = printFactorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }
    public static int printFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * printFactorial(n - 1));
    }
}
