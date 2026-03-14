import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ArrayExamples {
    public static void main(String[] args) {

        // ------------------------------
        // 1. One-Dimensional Array
        // ------------------------------
        System.out.println("=== 1. One-Dimensional Array ===");
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };

        String[] abc = new String[10];
        abc[1] = "20";
        abc[2] = "30";
        abc[3] = "40";
        abc[4] = "50";
        abc[5] = "60";
        abc[6] = "70";
        abc[0] = "10";

        // for (int i = 0; i < numbersNew.length; i++) {
        // System.out.print(numbersNew[i] + " ");
        // }
        System.out.println();

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        // Modifying an element
        numbers[4] = 100;
        System.out.println("Modified third element: " + numbers[2]);

        // Iterating using for loop
        System.out.println("All elements (for loop):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int a = 0;
        while (a < numbers.length) {
            System.out.print(numbers[a] + " ");
            a++;
        }

        // Iterating using enhanced for loop
        System.out.println("\nAll elements (for-each loop):");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        int[] numbers2 = { 10, 20, 30, 40, 50 };

        // ------------------------------
        // 2. Multi-Dimensional Array
        // ------------------------------
        System.out.println("\n\n=== 2. Multi-Dimensional Array (2D) ===");

        Integer[][] matrix = {
                { 1, 2, 3, 4, 2, 4, 5 },
                { 4, 5, 6, 6, 7, 9, 10, 45, 78 },
                { 7, 8, 9, 10, 11, 12, 13, 78, 90, 100 }
        };

        for (Integer[] arr : matrix) {
            Arrays.sort(arr, Collections.reverseOrder());
        }

        System.out.println("Multi-Dimensional Array:" + Arrays.deepToString(matrix));
        // for loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // enhanced for loop
        for (Integer[] arr : matrix) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println(matrix[2][8]);

        // Accessing elements
        System.out.println("Element at [0][1]: " + matrix[0][1]);

        // Printing the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ------------------------------
        // 3. Jagged (Ragged) Array
        // ------------------------------
        System.out.println("\n=== 3. Jagged (Ragged) Array ===");
        int[][] jagged = new int[3][];

        System.out.println(jagged.length);

        jagged[0] = new int[7];
        jagged[1] = new int[] { 3, 4, 5 };
        jagged[2] = new int[] { 6 };
        jagged[0][0] = 1;

        System.out.println("Jagged Array:");
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[] myArr = { 10, 8, 6, 4, 3, 8, 7 };

        Arrays.sort(myArr);

        for (int i = 0; i < myArr.length / 2; i++) {
            int temp = myArr[i];
            myArr[i] = myArr[myArr.length - 1 - i];
            myArr[myArr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(myArr));

        // ------------------------------
        // 4. Using java.util.Arrays Methods
        // ------------------------------
        System.out.println("\n=== 4. java.util.Arrays Utility Methods ===");

        String[][] array2D = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };

        System.out.println("2D Array: " + Arrays.deepToString(array2D));

        int[] scores = { 88, 55, 77, 99, 66 };
        String[] names = { "Charlie", "Alice", "David", "Bob", "Eve" };

        // Converting array to string
        System.out.println("Scores: " + Arrays.toString(names));
        // Sorting
        Arrays.sort(names);
        System.out.println("Scores ASC: " + Arrays.toString(names));

        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Sorted scores DSC: " + Arrays.toString(names));

        // Searching (binarySearch works on sorted arrays)
        int index = Arrays.binarySearch(scores, 77);
        System.out.println("Index of 77: " + index);

        // Copying part of an array
        int[] top3 = Arrays.copyOf(scores, 3);
        System.out.println("Top 3 scores: " + Arrays.toString(top3));

        // Comparing arrays
        int[] copy = { 55, 66, 77, 88, 99 };
        boolean areEqual = Arrays.equals(scores, copy);
        System.out.println("Are scores and copy equal? " + areEqual);

        // Filling an array
        int[] filled = new int[5];
        Arrays.fill(filled, 5);
        System.out.println("Filled with 1s: " + Arrays.toString(filled));

        // 1. Sorting Arrays
        int[] intArray = { 5, 2, 8, 1, 3 };
        Arrays.sort(intArray); // Sorts array in ascending order
        System.out.println("Sorted int array: " + Arrays.toString(intArray));

        // 2. Sorting with Comparator
        String[] strArray = { "banana", "apple", "cherry" };
        Arrays.sort(strArray, Comparator.reverseOrder()); // Sort in reverse order
        System.out.println("Sorted string array (reverse order): " + Arrays.toString(strArray));

        // 3. Searching Arrays
        // int index = Arrays.binarySearch(intArray, 3); // Perform binary search
        System.out.println("Index of 3 in sorted array: " + index);

        // 4. Array Comparison
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 3, 2 };
        // boolean areEqual = Arrays.equals(arr1, arr2); // Compare arrays for equality
        System.out.println("Arrays are equal: " + areEqual);

        // 5. Deep Comparison (for multidimensional arrays)
        int[][] deepArr1 = { { 1, 2 }, { 3, 4 } };
        int[][] deepArr2 = { { 1, 2 }, { 3, 4 } };
        boolean deepEqual = Arrays.deepEquals(deepArr1, deepArr2); // Deep comparison
        System.out.println("Deep arrays are equal: " + deepEqual);

        // 6. Filling Arrays
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 10); // Fill entire array with value 10
        System.out.println("Filled array: " + Arrays.toString(fillArray));

        // 7. Filling a range of indices
        int[] rangeArray = { 1, 2, 3, 4, 5 };
        Arrays.fill(rangeArray, 1, 3, 0); // Fill a subrange of the array

        System.out.println("Range filled array: " + Arrays.toString(rangeArray));

        // 8. Copying Arrays
        int[] copiedArray = Arrays.copyOf(arr1, 5); // Copy array and resize
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // 9. Copying a Range of Arrays
        int[] rangeCopiedArray = Arrays.copyOfRange(arr1, 1, 3); // Copy subrange
        System.out.println("Range copied array: " + Arrays.toString(rangeCopiedArray));

        // 10. Convert Array to String
        System.out.println("String representation of int array: " + Arrays.toString(arr1));

        // 11. Deep Convert Array to String
        System.out.println("String representation of deep array: " + Arrays.deepToString(deepArr1));

        // 12. Converting Array to List
        List<String> strList = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Array as list: " + strList);

        Integer[] intArr = new Integer[5];
        intArr[0] = 50;
        intArr[1] = 100;
        intArr[3] = 120;
        intArr[4] = 150;

        Integer sum = 0;

        sum = Arrays.stream(intArr).filter(Objects::nonNull).mapToInt(Integer::intValue).sum();

        // For Each Loop
        for (Integer value : intArr) {
            if (value != null) {
                sum += value;
            }
        }
        // //For Loop
        // for (int i = 0; i < intArr.length; i++) {
        // if (intArr[i]!=null) {
        // sum += intArr[i];
        // }
        // }

        System.out.println("Total sum: " + sum);

        System.out.println("Array --: " + Arrays.toString(intArr));

        List<Integer> intList = new ArrayList<>();
        intList.add(50);
        intList.add(100);
        intList.add(120);

        // intList = Arrays.asList(intArr);

        System.out.println("ArrayList----: " + intList);

        // 13. Convert Array to Stream and Perform Operations
        sum = Arrays.stream(intArray).sum(); // Sum of elements in array

        System.out.println("Sum of intArray: " + sum);

        // 14. Array Hash Code
        int hash = Arrays.hashCode(arr1); // Get hash code for an array
        System.out.println("Hash code of arr1: " + hash);

        // 15. Parallel Sorting
        int[] parallelArray = { 10, 4, 2, 6, 8 };
        Arrays.parallelSort(parallelArray); // Sort using parallelism
        System.out.println("Parallel sorted array: " + Arrays.toString(parallelArray));

        // 16. Array Mismatch
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 1, 2, 4 };
        int mismatchIndex = Arrays.mismatch(arr3, arr4); // Find index of first mismatch
        System.out.println("First mismatch at index: " + mismatchIndex);
    }
}
