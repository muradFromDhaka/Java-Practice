/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextIOEx;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author B-2
 */
public class ScannerExample {
    public static void main(String[] args) {
        consoleIO();
    }
    // 1. Console IO;
     public static void consoleIO(){
             System.out.println("==== Console IO ====");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "!");
        System.out.println("Age is = " + age + "!");
        }
    
}
