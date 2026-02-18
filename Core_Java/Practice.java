package Method8;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        Integer[] array = { 45, 25, 89, 13, 15 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
         bubbleSort1(array);
        System.out.println(Arrays.toString(array));

        int num = 5;
        factorial(num);
        System.out.println("factorial " + num);

    }

    // Array sort Ascending;
    static void bubbleSort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Array sort descending;
    static void bubbleSort1(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
