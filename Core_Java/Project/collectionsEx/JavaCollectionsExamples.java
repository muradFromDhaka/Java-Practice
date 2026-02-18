/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.collectionsEx;
import java.util.*;
import java.util.Map.Entry;

public class JavaCollectionsExamples {

    public static void main(String[] args) {
        // -------------------- LIST --------------------
        System.out.println("==== List Example ====");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana"); // duplicates allowed
        System.out.println("List: " + list);

        list.remove("Banana");  // removes first occurrence
        list.set(0, "Grape");   // replace index 0
        System.out.println("Modified List: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Contains 'Apple': " + list.contains("Apple"));

        // -------------------- LINKEDLIST --------------------
        System.out.println("\n==== LinkedList Example ====");
        LinkedList<String> linkedList = new LinkedList<>(list);
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First Element: " + linkedList.getFirst());

        // -------------------- SET --------------------
        System.out.println("\n==== HashSet Example ====");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate, won't be added
        System.out.println("Set: " + set);

        // -------------------- LINKEDHASHSET --------------------
        System.out.println("\n==== LinkedHashSet Example ====");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        System.out.println("LinkedHashSet (Preserves Order): " + linkedHashSet);

        // -------------------- TREESET --------------------
        System.out.println("\n==== TreeSet Example ====");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        System.out.println("TreeSet (Sorted): " + treeSet);

        // -------------------- QUEUE --------------------
        System.out.println("\n==== Queue Example (LinkedList) ====");
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll()); // removes head
        System.out.println("Peek: " + queue.peek()); // view head
        System.out.println("Queue after Poll: " + queue);

        // -------------------- PRIORITY QUEUE --------------------
        System.out.println("\n==== PriorityQueue Example ====");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue (Natural Order): " + pq);
        System.out.println("Poll (Min): " + pq.poll());

        // -------------------- STACK (LEGACY) --------------------
        System.out.println("\n==== Stack Example ====");
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Blue");
        stack.push("Green");
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        // -------------------- DEQUE AS STACK --------------------
        System.out.println("\n==== Deque as Stack Example ====");
        Deque<String> dequeStack = new ArrayDeque<>();
        dequeStack.push("A");
        dequeStack.push("B");
        dequeStack.push("C");
        System.out.println("Deque Stack: " + dequeStack);
        System.out.println("Pop: " + dequeStack.pop());

        // -------------------- MAP --------------------
        System.out.println("\n==== HashMap Example ====");
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("Science", 85);
        map.put("English", 92);
        map.put("Math", 95); // overwrite
        System.out.println("HashMap: " + map);
        System.out.println("Value for 'Math': " + map.get("Math"));
        map.remove("Science");
        System.out.println("After removing Science: " + map);

        // Iterating Map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // -------------------- LINKEDHASHMAP --------------------
        System.out.println("\n==== LinkedHashMap Example ====");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("B", "Banana");
        linkedHashMap.put("A", "Apple");
        linkedHashMap.put("C", "Cherry");
        System.out.println("LinkedHashMap (Order Preserved): " + linkedHashMap);

        // -------------------- TREEMAP --------------------
        System.out.println("\n==== TreeMap Example ====");
        Map<String, String> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // -------------------- ITERATOR --------------------
        System.out.println("\n==== Iterator Example ====");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }

        // -------------------- COMPARATOR --------------------
        System.out.println("\n==== Comparator Example (Custom Sort) ====");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort by age using Comparator
        Collections.sort(people, new AgeComparator());
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }

        // Using Lambda
        System.out.println("Sort by name (Lambda):");
        people.sort((p1, p2) -> p1.name.compareTo(p2.name));
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }
    }

    // Person class for Comparator example
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Custom Comparator
    static class AgeComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.age, p2.age);
        }
    }
}

