import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayEx5_6{    
    public static void main(String[] args) {

        // 1. One-Dimensional Array;
        // ==============================
        System.out.println("1. One-Dimensional Array;");
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        // Modifying an elements;
        numbers[4] = 100;
        System.out.println("Modifying third elements:" + numbers[4]);

        // Iterating using for loop ;
        System.out.println("All elements (for loop):");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // For-each loop;
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        // While Loop;

        int x = 0;
        while (x < numbers.length) {
            System.out.print(numbers[x] + " ");
            x++;
        }

        // 2. Multi-Dimensionl Array;
        // ===============================
        System.out.println("2. Multi-Dimensionl Array;");

        int[][] matrix = {
                { 1, 2, 4, 5, 0, 8 },
                { 10, 12, 41, 78, 54, 25 },
                { 12, 54, 65, 14, 32, 35, 45, 26 }
        };
        System.out.println(matrix[0][3]);
        matrix[2][5] = 1000;
        System.out.println(matrix[2][5]);

        // Multi-Dimentional Array using for_each loop;
        System.out.println("2.1 Multi-Dimentional Array using  Enchanced for loop;");
        for (int[] arr : matrix) {
            for (int num : arr) {
                System.out.println(num + " ");
            }
            System.out.println();
        }

        // Multi-Dimentional Array using for i loop;
        System.out.println("2.2 Multi-Dimentional Array using for i loop;");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

        // 3. Jagged (Ragged) Array;
        // ================================
        System.out.println("\n3. Jagged(Ragged) Array;");
        String[] numbersNew = new String[10];
        numbersNew[0] = "Murad";
        numbersNew[1] = "Shovon";
        numbersNew[2] = "Hafiz";
        numbersNew[3] = "Tanvir";
        numbersNew[4] = "Imam";

        System.out.println("\n3.1 Jagged(Ragged) Array;");
        int[][] jagged = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[] { 1, 2 };
        jagged[2] = new int[] { 1, 2, 3 };

        // 4. Using java.util.Arrays Methods;

        System.out.println("\n4. Using java.util.Arrays Methods;");

        int[] scores = { 88, 55, 77, 99, 66 };
        String[] names = { "Alice", "Bob", "Karim", "David", "Eve" };

        // Converting Array to String;
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Scores: " + Arrays.toString(names));

        // Converting 2-Dimentional array to string;
        String[][] array2D = { { "f", "a", "i" }, { "d", "e", "b" }, { "g", "h", "c" } };
        System.out.println("2DArray sort: " + Arrays.deepToString(array2D));

        // Sorting;
        Arrays.sort(scores);
        System.out.println("Sorted Scores: " + Arrays.toString(scores));

        // Sorted Asc and Desc;
        Arrays.sort(names);
        System.out.println("Scores Asc: " + Arrays.toString(scores));
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Scores Desc: " + Arrays.toString(names));

        // 2-Dimentional array sort;
        for (String[] is : array2D) {
            Arrays.sort(is);
        }
        System.out.println("Multi-Dimensional Array: " + Arrays.deepToString(array2D));

        // Primitive data sort(new Array declaration.);
        int[] myArr = { 10, 8, 6, 4, 3, 8, 7 };
        Arrays.sort(myArr);
        System.out.println("myArr Sorted Asce: " + Arrays.toString(myArr));

        int[] newArr = new int[myArr.length];
        for (int i = 0; i < myArr.length; i++) {
            newArr[i] = myArr[myArr.length - i - 1];
        }
        System.out.println("myArr Sorted Desc:" + Arrays.toString(newArr));
       

        System.out.println();

        // Primitive data sort(Without new Array declaration.);
        for (int i = 0; i < myArr.length / 2; i++) {
            int temp = myArr[i];
            myArr[i] = myArr[myArr.length - i - 1];
            myArr[myArr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArr));

        // Searching (binarySearch works on sorted arrays);

        Integer[] myScores = { 88, 55, 77, 99, 66, 67, 89, 56, 56 };
        Arrays.sort(myScores);
        for (Integer i = 0; i < myScores.length; i++) {
            if (66 == myScores[i]) {
                System.out.println("Index of 66: " + i);
                break;
            }
        }

        // binarySearch works on sorted arrays;

        Integer index = Arrays.binarySearch(myScores, 66);
        System.out.println("Index of 66: " + index);


        // Find Top 3 scores(Copypf);
        Integer[] myScores1 = { 88, 55, 77, 99, 66, 67, 89, 56, 56 };
        Arrays.sort(myScores1);
        System.out.println(Arrays.toString(myScores1));

        Integer[] top3 = Arrays.copyOf(myScores1, 3);
        System.out.println("Top 3 scores: " + Arrays.toString(top3)) ; 


        // Find Multi-Dimensional Array's index;

         int[][] matrix1 = {
                { 1, 2, 4, 5, 0, 8 },
                { 10, 12, 41, 26, 54, 25 },
                { 12, 54, 65, 14, 32, 35, 45, 26 }
        };

        for (int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[i].length; j++){
                if( 99 == matrix[i][j]){
                    System.out.println("Index of 26: matrix[" + i + "][" + j + "]");
                }
            }
        }


        // Comparing arrays ;
        int[] copy = {55,66,77,88,99};
        boolean areEqual = Arrays.equals(scores, copy);
        System.out.println("Are scores and copy equal? " + areEqual);

        // Filling an Arrray;
        int[] filled = new int[5];
        Arrays.fill(filled, 5);
        System.out.println("Filled with 1 value: " + Arrays.toString(filled));

        // Deep Comparison ( for multidimensional arrays);
        int[][] deepArr1 = {{1,2}, {3,4}};
        int[][] deepArr2 = {{1,2}, {3,4}};
        boolean deepEqual =Arrays.deepEquals(deepArr1, deepArr2);  //Deep Comparision
        System.out.println("Deep arrays are equal: " + deepEqual);
        








        int[] arr = { 1, 5, 2, 9, 7 };

        Integer[] InArr = { 10, 45, 21, 21, 65, 45 };

        String[] StrArr = { "a", "c", "e", "b", "d" };

        Arrays.sort(arr);
        System.out.println("Sorted arr: " + Arrays.toString(arr));

        Arrays.sort(InArr);
        System.out.println("sort InArr: " + Arrays.toString(InArr));
        Arrays.sort(InArr, Collections.reverseOrder());
        System.out.println("sort Desc InArr:" + Arrays.toString(InArr));

        Arrays.sort(StrArr);
        System.out.println("Sorted strArr array: " + Arrays.toString(StrArr));
        Arrays.sort(StrArr, Collections.reverseOrder());
        System.out.println("sort Desc StrArr:" + Arrays.toString(StrArr));

        for (int y : arr) {
            System.out.println("using for loop: " + y);
        }

    }
}
