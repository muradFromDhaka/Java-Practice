import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Exam {
    public static void main(String[] args) {

        Integer[][] matrix = {
                { 1, 2, 3, 4, 2, 4, 5 },
                { 4, 5, 6, 99,6, 7, 9, 10, 45, 78 },
                { 7, 8, 9, 10, 11, 12, 13, 78, 90, 100, 99 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (99 == matrix[i][j]) {
                    System.out.println("Index of 99: matrix[" + i + "][" + j + "]");
                    // break;
                }
            }
        }




        int[] myScores = { 88, 55, 77, 99, 67, 89, 56, 56, 66, 99 };
        Arrays.sort(myScores);
        System.out.println(Arrays.toString(myScores));

        int[] top3 = Arrays.copyOf(myScores, 2);
        System.out.println("Top 3 scores: " + Arrays.toString(top3));

        for (int i = 0; i < myScores.length; i++) {
            if (99 == myScores[i]) {
                System.out.println("Index of 99: " + i);
                break;
            }
        }
        // Searching (binarySearch works on sorted arrays)
        int index = Arrays.binarySearch(myScores, 99);
        System.out.println("Index of 99: " + index);

        int[] numbers = { 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
        Integer[] numbers2 = { 7, 8, 9, 3, 4, 5, 6, 10, 1, 2 };
        String[] names = { "John", "Jane", "Bob", "Alice", "Charlie" };

        System.out.println("Unsorted:" + Arrays.toString(numbers));
        System.out.println("Unsorted:" + Arrays.toString(numbers2));
        System.out.println("Unsorted:" + Arrays.toString(names));

        Arrays.sort(numbers);
        Arrays.sort(numbers2);
        Arrays.sort(names);

        System.out.println("Sorted:" + Arrays.toString(numbers));
        System.out.println("Sorted:" + Arrays.toString(numbers2));
        System.out.println("Sorted:" + Arrays.toString(names));

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // int[] newArr = new int[numbers.length];
        // for (int i : numbers) {
        // newArr[numbers.length - 1 - i] = i;
        // }

        Arrays.sort(numbers2, Collections.reverseOrder());
        Arrays.sort(names, Collections.reverseOrder());

        System.out.println("Reversed:" + Arrays.toString(numbers));
        System.out.println("Reversed:" + Arrays.toString(numbers2));
        System.out.println("Reversed:" + Arrays.toString(names));

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(names));
    }
}
