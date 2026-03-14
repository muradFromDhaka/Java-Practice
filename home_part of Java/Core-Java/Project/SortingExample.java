
package com.abc.myfirstproject.collectionsEx;



import java.util.*;

public class SortingExample {

    // Built-in Sorting using Arrays.sort() and Collections.sort()
    public static void builtInSorting() {
        System.out.println("==== Built-in Sorting ====");

        // Arrays.sort()
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array (Arrays.sort()): " + Arrays.toString(arr));

        // Collections.sort()
        List<String> list = Arrays.asList("Banana", "Apple", "Mango");
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List (Collections.sort()): " + list);

        // Custom comparator (reverse order)
        Collections.sort(list, (a, b) -> b.compareTo(a));
        System.out.println("Sorted List (Reverse Order): " + list);
    
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA", 1));
        employees.add(new Employee("bbb", 2));
        employees.add(new Employee("CCC", 5));
        employees.add(new Employee("ddd", 7));
        employees.add(new Employee("EEE", 3));
        employees.add(new Employee("FFF", 10));
    
        Collections.sort(employees, (a, b) -> b.salary - a.salary);
        System.out.println("employees Sorted List by salary (Reverse Order): " + employees);
        
        Collections.sort(employees, (a, b) -> a.name.compareTo(b.name));
        System.out.println("employees Sorted List by Name (Reverse Order): " + employees);
    
    
    }

    // Custom Sorting using Comparable
    static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
            return this.name.compareTo(other.name); // Ascending by marks
//            return Integer.compare(this.marks, other.marks); // Ascending by marks
        }

        @Override
        public String toString() {
            return name + ": " + marks;
        }
    }

    public static void customComparableSorting() {
        System.out.println("\n==== Custom Sorting with Comparable ====");

        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 70),
                new Student("Charlie", 90)
        );
        System.out.println("Original Students List: " + students);
        Collections.sort(students);
        System.out.println("Sorted by Marks (Ascending): " + students);
    }

    // Selection Sort Implementation
    // 12, 5, 9, 1, 13, 7
    // 1, 5, 9, 12, 13, 7
    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;//1, 3
            for (int j = i + 1; j < arr.length; j++) {//1 2 3
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // Bubble Sort Implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort Implementation 
        
        //12, 5, 9, 1, 13, 7
        //5, 12, 9, 1 , 13, 7
      
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {//1,2
            int key = arr[i];//5,9
            int j = i - 1;   //0,-1, 1
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort Implementation
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Quick Sort Implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Heap Sort Implementation
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Built-in Sorting
        builtInSorting();

        // Custom Sorting with Comparable
        customComparableSorting();

        // Sorting Algorithms Demonstration
        System.out.println("\n==== Sorting Algorithms Demonstration ====");

        // Selection Sort
        int[] selectionArray = {12, 5, 9, 1, 13, 7};
        System.out.println("Original Array: " + Arrays.toString(selectionArray));
        selectionSort(selectionArray);
        System.out.print("Selection Sort: ");
        printArray(selectionArray);

        // Bubble Sort
        int[] bubbleArray = {12, 5, 9, 1, 13, 7};
        bubbleSort(bubbleArray);
        System.out.print("Bubble Sort: ");
        printArray(bubbleArray);

        // Insertion Sort
        int[] insertionArray = {12, 5, 9, 1, 13, 7};
        insertionSort(insertionArray);
        System.out.print("Insertion Sort: ");
        printArray(insertionArray);

        // Merge Sort
        int[] mergeArray = {12, 5, 9, 1, 13, 7};
        mergeSort(mergeArray);
        System.out.print("Merge Sort: ");
        printArray(mergeArray);

        // Quick Sort
        int[] quickArray = {12, 5, 9, 1, 13, 7};
        quickSort(quickArray, 0, quickArray.length - 1);
        System.out.print("Quick Sort: ");
        printArray(quickArray);

        // Heap Sort
        int[] heapArray = {12, 5, 9, 1, 13, 7};
        heapSort(heapArray);
        System.out.print("Heap Sort: ");
        printArray(heapArray);
    }
}
