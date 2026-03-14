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

        int fact = 1;
        
        fact = getFactorialNormal(num);
        System.out.println("Factorial of " + num + " is " + fact);

        
        fact =  getFactorialUsingRecursion(num);
        
        System.out.println("Factorial of using Recursion" + num + " is " + fact);

    }

    public static int getFactorialNormal(int n) {
        int val = 1;  // 5 * 4 * 3 * 2 * 1  =120
        for (int i = n; i >= 1; i--) {
            val = val * i;
        }
        return val;
    }

    public static int getFactorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * getFactorialUsingRecursion(n - 1));
    }
}
