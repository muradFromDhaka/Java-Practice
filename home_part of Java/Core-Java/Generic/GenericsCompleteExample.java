package GenericEx;

import java.util.*;

public class GenericsCompleteExample {
 

    public static double doubleAvg(double[] arr) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static double intAvg(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
       return sum / arr.length;
    }

    

    // 2. Generic method with bounded type parameter
    public static <T extends Number> double calculateAverage(T[] numbers) {
        double sum = 0.0;
        for (T n : numbers) {
            sum += n.doubleValue();
        }
        return sum / numbers.length;
    }

    public static <T extends Number> double calculateAverage(ArrayList<T> numbers) {
        double sum = 0.0;
        for (T n : numbers) {
            sum += n.doubleValue();
        }
        return sum / numbers.size();
    }



    // 3. Generic sorting method
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // 4. Using wildcards
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 5. Demonstration of all concepts
    public static void main(String[] args) {
        System.out.println("=== GENERICS COMPLETE EXAMPLE ===\n");


        Integer[] intArray = { 5, 2, 8, 1, 9 };
        Double[] doubleArray = { 3.5, 1.2, 4.8, 2.1, 6.3 };
        Float[] floatArray = { 3.5f, 1.2f, 4.8f, 2.1f, 6.3f };

        System.out.println(calculateAverage(intArray));
        System.out.println(calculateAverage(doubleArray));
        System.out.println(calculateAverage(floatArray));  
        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(8);
        intList.add(1);
        intList.add(9);
        System.out.println(calculateAverage(intList));
        System.out.println();   


        // 1. Using generic class
        GenericBox<String> stringBox = new GenericBox<>("Hello Generics!");
        GenericBox<Integer> intBox = new GenericBox<>(42);
        System.out.println(stringBox.getValue());
        System.out.println(intBox.getValue());
        System.out.println();

        // 2. Using generic method
        // Integer[] intArray = { 5, 2, 8, 1, 9 };
        // Double[] doubleArray = { 3.5, 1.2, 4.8, 2.1 };

        System.out.println("Integer average: " + calculateAverage(intArray));
        System.out.println("Double average: " + calculateAverage(doubleArray));
        System.out.println();

        // 3. Generic sorting
        System.out.println("Before sorting: " + Arrays.toString(intArray));
        selectionSort(intArray);
        System.out.println("After sorting: " + Arrays.toString(intArray));
        System.out.println();

        String[] stringArray = { "banana", "apple", "cherry", "date" };
        System.out.println("Before sorting: " + Arrays.toString(stringArray));
        selectionSort(stringArray);
        System.out.println("After sorting: " + Arrays.toString(stringArray));
        System.out.println();

        // 4. Using wildcards
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        System.out.print("Integer list: ");
        printNumbers(integerList);

        System.out.print("Double list: ");
        printNumbers(doubleList);
        System.out.println();

        // 5. Raw types demonstration
        List rawList = new ArrayList();
        rawList.add("String");
        rawList.add(123);
        rawList.add(45.67);

        System.out.println("Raw list contents:");
        for (Object obj : rawList) {
            System.out.println(obj + " (" + obj.getClass().getSimpleName() + ")");
        }
        System.out.println();

        // 6. Comparator example
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        String[] words = { "apple", "banana", "kiwi", "strawberry" };
        System.out.println("Before length sorting: " + Arrays.toString(words));
        Arrays.sort(words, lengthComparator);
        System.out.println("After length sorting: " + Arrays.toString(words));

        System.out.println("\n=== END OF EXAMPLE ===");
    }
}

// 1. Generic class
class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box: " + value;
    }
}
