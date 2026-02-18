/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.collectionsEx;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        // -------------------- 1. LISTS --------------------
        System.out.println("=== List Example (ArrayList) ===");
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Apple"); // Duplicates allowed
//
//        System.out.println("List: " + fruits);
//
//        System.out.println("Element at index 1: " + fruits.get(1));
//        fruits.remove("Apple"); // Removes first occurrence
//        fruits.set(1, "Mango"); // Replace element
//        System.out.println("Modified List: " + fruits);

        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Initial List: " + fruits);

        // 3. Adding element at specific index
        fruits.add(2, "Blueberry");  // at index 2
        System.out.println("After add(2, 'Blueberry'): " + fruits);
        // 4. Getting element
        System.out.println("Element at index 3: " + fruits.get(3));

        // 5. Changing/replacing element
        fruits.set(1, "Blackberry");
        System.out.println("After set(1, 'Blackberry'): " + fruits);

        // 6. Removing element by index
        fruits.remove(0);
        System.out.println("After remove(0): " + fruits);

        // 7. Removing element by object
        fruits.remove("Cherry");
        System.out.println("After remove('Cherry'): " + fruits);

        // 8. Checking if element exists
        System.out.println("Contains 'Date'? " + fruits.contains("Date"));

        // 9. Size of ArrayList
        System.out.println("Size: " + fruits.size());

        // 10. Checking if fruits is empty
        System.out.println("Is empty? " + fruits.isEmpty());

        // 11. Iterating using for-each loop
        System.out.print("For-each loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i) + " ");
        }
        System.out.println();

        // 12. Iterating using iterator
        System.out.print("Iterator: ");
        //    boolean hasNext();
        //    E next();
        //    void remove(); 
        System.out.println("---------------------------------------------------------------");
        System.out.println(fruits);//Blackberry, Blueberry, Date
        Iterator<String> iterator = fruits.iterator();//Blackberry, Blueberry, Date
//        System.out.println(iterator.next() + " ");//Blackberry
//        System.out.println(iterator.next() + " ");//Blueberry
//        iterator.remove(); //Date
        System.out.println("W 1");

//        while (iterator.hasNext()) {
//            String fruit = iterator.next();
//            if (fruit.equals("Blueberry")) {
//                iterator.remove(); // Safe: after next()
//            } else {
//                System.out.print(fruit + " ");
//            }
//        }
//        System.out.println("W 2");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");

        // 13. Index of element
        //Blackberry, Blueberry, Date
        fruits.add("Date");
        //Blackberry, Blueberry, Date, Date

        System.out.println("List after adding another 'Date': " + fruits);
        System.out.println("Index of 'Date': " + fruits.indexOf("Date"));
        System.out.println("Last index of 'Date': " + fruits.lastIndexOf("Date"));

        // 14. Subfruits
        List<String> subList = fruits.subList(1, 3); // [start, end)
        System.out.println("Full List : " + fruits);
        System.out.println("Subfruits (1,3): " + subList);

        // 15. Converting to Array
        String[] array = fruits.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
        fruits.add(1, "XYZ");

        // 16. Sorting
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);
        // 17. Reversing
        Collections.reverse(fruits);
        System.out.println("Reversed List: " + fruits);

        // 18. Shuffling
        Collections.shuffle(fruits);
        System.out.println("Shuffled List: " + fruits);

        // 19. Clearing the fruits
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Is empty now? " + fruits.isEmpty());

        fruits.add("DDD");
        
        // 20. Adding All elements from another fruits
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Mango", "Papaya", "ABC", "XYZ"));
        newList.add("aa");
        newList.add("adsdas");
        fruits.addAll(newList);
        System.out.println("After addAll(): " + fruits);

        // 21. RetainAll
        ArrayList<String> filterList = new ArrayList<>(Arrays.asList("Papaya", "Papaya","Pineapple"));
//        fruits.retainAll(filterList);
        System.out.println("After retainAll(): " + fruits);

        // 22. RemoveAll
        fruits.removeAll(filterList);
        System.out.println("After removeAll(): " + fruits);

        // 23. Clone (Shallow copy)
//        ArrayList<String> clonedList = (ArrayList<String>) newList.clone();
//        System.out.println("Cloned fruits: " + clonedList);

        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();//5
        System.out.println("Cloned fruits: " + clonedList);
        fruits.remove(0);
        System.out.println("Cloned fruits:2 " + clonedList);

        
        
        
        // 24. Ensure capacity (optional optimization)
        clonedList.ensureCapacity(20);
        System.out.println("Cloned ensureCapacity:2 " + clonedList);

        // 25. Trim to size
        clonedList.trimToSize();  //  Reduces internal array to fit current size
        System.out.println("Cloned trimToSize:2 " + clonedList);

// -------------------- 2. STACK --------------------
        System.out.println("\n=== Stack Example ===");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        // -------------------- 3. QUEUE --------------------
        System.out.println("\n=== Queue Example ===");
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue: " + queue);
        System.out.println("Polled: " + queue.poll());
        System.out.println("Peek: " + queue.peek());

        // -------------------- 4. PRIORITY QUEUE --------------------
        System.out.println("\n=== PriorityQueue Example ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        System.out.println("PriorityQueue (Natural Order): " + pq);
        System.out.println("Polled (Lowest): " + pq.poll());

        // -------------------- 5. COLLECTIONS UTILITY CLASS --------------------
        System.out.println("\n=== Collections Utility Methods ===");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9));
        System.out.println("Original: " + numbers);

        Collections.sort(numbers);         // Sort ascending
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);      // Reverse order
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);      // Shuffle
        System.out.println("Shuffled: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max + ", Min: " + min);

        // -------------------- 6. ITERATORS --------------------
        System.out.println("\n=== Iterator Example ===");
//        Iterator<String> iterator = fruits.iterator();
//        while (iterator.hasNext()) {
//            String fruit = iterator.next();
//            System.out.println("Fruit: " + fruit);
//        }

        // -------------------- 7. LIST INTERFACE WITH LINKEDLIST --------------------
        System.out.println("\n=== List Interface with LinkedList ===");
        List<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        for (String city : cities) {
            System.out.println("City: " + city);
        }

        // -------------------- 8. COMPARATOR INTERFACE --------------------
        System.out.println("\n=== Comparator Example ===");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before Sort:");
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }

        // Sort using Comparator (by age)
        people.sort(new AgeComparator());

        System.out.println("\nAfter Sort by Age:");
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }

        // Sort by name using Lambda
        people.sort((p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\nAfter Sort by Name:");
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }
    }

    // Person class
    static class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Comparator to sort by age
    static class AgeComparator implements Comparator<Person> {

        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.age, p2.age);
        }
    }
}
