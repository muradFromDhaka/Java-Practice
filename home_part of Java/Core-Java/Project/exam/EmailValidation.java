/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EmailValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        String mail = input.next();

        if (checkMAil(mail)) {
            System.out.println("Valid Mail");
        } else {
            System.out.println("Invalid Mail");
        }

    }

    public static boolean checkMAil(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }
}
