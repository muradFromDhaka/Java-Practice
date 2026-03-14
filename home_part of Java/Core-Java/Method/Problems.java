package Method;

import java.util.Arrays;
import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {

        // Array sorted Asc;
        int[] arr = { 5, 3, 8, 4, 2 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int num : arr) {
            System.out.println(num + " ");
        }

        // factorial;
        int num = 5;
        factorial(num);
        System.out.println("factorial " + num);
       
        

        Scanner sc = new Scanner(System.in); // Create Scanner Object;

        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Read a full line ;
        System.out.println("Your name is: " + name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(number));

    }

    // Array sorted Asce;
    static void bubbleSort(int[] array10) {
        for (int i = 0; i < array10.length - 1; i++) {
            for (int j = 0; j < array10.length - i - 1; j++) {
                if (array10[j] > array10[j + 1]) {
                    int temp = array10[j];
                    array10[j] = array10[j + 1];
                    array10[j + 1] = temp;
                }
            }
        }
    }

    // factorial number;
    static int factorial(int number) {
        int result = 1;
        String val = "1";
        for (int i = 1; i <= number; i++) {
            result *= i;
            val += " * " + i;
        }
        System.out.println(val + " = " + result);

        return result;
    }
}
