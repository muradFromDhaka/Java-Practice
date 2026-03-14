/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericEx;

import java.util.ArrayList;

/**
 *
 * @author B-2
 */
public class Average {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 3, 6};
        double[] arr = {1, 3, 6, 7, 3, 6};
        average1(array);
        average2(arr);
        System.out.println();

        Integer[] intArr = {5, 2, 8, 1, 9};
        Double[] doubleArr = {3.5, 1.2, 5.6, 8.4, 9.2};
        Float[] floatArr = {3.5f, 1.2f, 5.6f, 8.4f, 9.2f};

        System.out.println(calculateAverage(intArr));
        System.out.println(calculateAverage(doubleArr));
        System.out.println(calculateAverage(floatArr));
        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(4);
        intList.add(3);
        intList.add(8);
        intList.add(2);
        intList.add(1);
        intList.add(7);

        System.out.println(calculateAverage(intList));

    }

    // Generic method with bounded type parameter:
    public static <T extends Number> double calculateAverage(T[] numbers) {
        double sum = 0;
        for (T n : numbers) {
            sum += n.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T extends Number> double calculateAverage(ArrayList<T> numbers) {
        double sum = 0;
        for (T n : numbers) {
            sum += n.doubleValue();
        }
        return sum / numbers.size();
    }

    public static double average1(int[] arr) {
        int avg = 0;
        for (int x : arr) {
            avg += x;
        }
        System.out.println("intAverage: " + avg / arr.length);

        return 0;
    }

    public static double average2(double[] arr) {
        double avg = 0;
        for (double x : arr) {
            avg += x;
        }
        System.out.printf("Average: %.2f", avg / arr.length);

        return 0;
    }

}
