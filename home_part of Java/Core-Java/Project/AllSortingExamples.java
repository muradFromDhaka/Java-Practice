package SortEx;

import java.util.*;

// Custom class for demonstration
class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // For Comparable interface (sort by name by default)
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class AllSortingExamples {

    public static void main(String[] args) {

        // 1. Sort Primitive Array (Ascending)
        int[] nums = {5, 2, 9, 1, 3};
        Arrays.sort(nums);
        System.out.println("Sorted int[] Ascending: " + Arrays.toString(nums));

        // 2. Sort Integer Array (Descending)
        Integer[] numsDesc = {5, 2, 9, 1, 3};
        Arrays.sort(numsDesc, Collections.reverseOrder());
        System.out.println("Sorted Integer[] Descending: " + Arrays.toString(numsDesc));

        // 3. Sort List of Strings (Ascending)
        List<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob"));
        Collections.sort(names);
        System.out.println("Sorted List<String> Ascending: " + names);

        // 4. Sort List of Strings (Descending)
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted List<String> Descending: " + names);

        // 5. Sort Custom Object List by name (using Comparable)
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Charlie", 25),
            new Student("Alice", 22),
            new Student("Bob", 20),
            new Student("Ali-2", 20),
            new Student("Bob", 30)

        ));
        //age ASC, Name Desc



        Collections.sort(students); // uses compareTo (by name)
        System.out.println("Students Sorted by Name (Comparable): " + students);

        // 6. Sort Custom Object by Age (Ascending) - using Comparator
        students.sort(Comparator.comparing((Student s) -> s.name));
        System.out.println("6. ----Students Sorted by Age Ascending: " + students);

        // 7. Sort Custom Object by Age (Descending) - using Comparator
        students.sort(Comparator.comparingInt((Student s) -> s.age).reversed());
        System.out.println("Students Sorted by Age Descending: " + students);

        // 8. Sort by Multiple Fields (Age, then Name)
        students.sort(Comparator.comparingInt((Student s) -> s.age)
                .thenComparing((Student s) -> s.name).reversed());

        System.out.println("------1------Students Sorted by Age, then Name Rev: " + students);
      students.sort(Comparator.comparing((Student a) -> a.name)
                .thenComparingInt((Student s) -> s.age).reversed());

        System.out.println("-----2-----Students Sorted by name, then Age Rev: " + students);
        // 9. Bubble Sort on Array (Manual Sort)
        int[] bubbleArray = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(bubbleArray);
        System.out.println("Bubble Sorted Array: " + Arrays.toString(bubbleArray));
    }

    // Bubble Sort (Ascending)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
