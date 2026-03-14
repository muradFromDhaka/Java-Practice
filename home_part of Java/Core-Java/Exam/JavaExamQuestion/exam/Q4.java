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
public class Q4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else {
            grade = "F"; // Failed
        }
        System.out.println("Your grade is: " + grade);
    }
}
