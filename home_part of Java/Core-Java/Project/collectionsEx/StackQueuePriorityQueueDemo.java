/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.collectionsEx;

import java.util.*;

public class StackQueuePriorityQueueDemo {

    public static void main(String[] args) {
  
        // ======== STACK EXAMPLE ========
        System.out.println("===== STACK =====");
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        stack.push("G");

        System.out.println("Stack after push: " + stack); // [A, B, C]

        // Peek at the top
        System.out.println("Top element (peek): " + stack.peek()); // C

        // Pop element
        System.out.println("Popped element: " + stack.pop()); // C
        System.out.println("Popped element: " + stack.pop()); // C

        System.out.println("Stack after pop: " + stack); // [A, B]

        // Search (1-based from top)
        System.out.println("Position of A (from top): " + stack.search("A")); // 2

        // Is empty
        System.out.println("Is stack empty? " + stack.empty());

        System.out.println();

        // ======== QUEUE EXAMPLE (LinkedList) ========
        System.out.println("===== QUEUE (FIFO) =====");
        Queue<String> queue = new LinkedList<>();

        // Offer elements (enqueue)
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        System.out.println("Queue after offer: " + queue); // [One, Two, Three]

        // Peek (head without removing)
        System.out.println("Head element (peek): " + queue.peek()); // One

        // Poll (dequeue)
        System.out.println("Polled element: " + queue.poll()); // One
        System.out.println("Queue after poll: " + queue); // [Two, Three]

        // Element() throws exception if queue is empty (unlike peek)
        System.out.println("Head element (element()): " + queue.element());

        // Remove() removes head, throws exception if empty
        queue.remove();
        System.out.println("Queue after remove(): " + queue); // [Three]

        // Is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println();

        // ======== PRIORITY QUEUE EXAMPLE ========
        System.out.println("===== PRIORITY QUEUE =====");
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-heap by default

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue after add: " + pq); // [10, 30, 20] (internally heapified)
        System.out.println("Polled: ----@@@@@@@@--------" + pq.poll()); // 5
        System.out.println("PriorityQueue after add: " + pq); // [10, 30, 20] (internally heapified)

        // Offer
        pq.offer(5);
        pq.offer(50);
        System.out.println("PriorityQueue after offer(5): " + pq); // [5, 10, 20, 30]

        // Peek (min element)
        System.out.println("Peek: " + pq.peek()); // 5

        // Poll (removes head - smallest element)
        System.out.println("Polled: " + pq.poll()); // 5
        System.out.println("Polled: 2" + pq.poll()); // 5

        System.out.println("After poll: " + pq); // heap structure remains

        // Remove
        pq.remove(30); // remove specific element
        System.out.println("After remove(30): " + pq);

        // Check size
        System.out.println("Size: " + pq.size());

        // Check contains
        System.out.println("Contains 20? " + pq.contains(20));
        // Is empty
        System.out.println("Is priority queue empty? " + pq.isEmpty());
        // Iterating (order not guaranteed)
        System.out.print("Iterating PriorityQueue: ");
        for (int num : pq) {
            System.out.print(num + " ");
        }

        System.out.println();
        
         // Example with Integers (Natural Order: Ascending)
        PriorityQueue<Integer> numPQ = new PriorityQueue<>();
        numPQ.add(10);
        numPQ.add(5);
        numPQ.add(20);
        numPQ.add(1);

        System.out.println("Integer PriorityQueue (Natural Order - Ascending):");
        while (!numPQ.isEmpty()) {
            System.out.print(numPQ.poll() + " "); // Removes and returns the head
        }
        // Output: 1 5 10 20

        System.out.println("\n");

        // Example with Strings (Natural Order: Alphabetical)
        PriorityQueue<String> strPQ = new PriorityQueue<>();
        strPQ.add("Apple");
        strPQ.add("Banana");
        strPQ.add("cherry");
        strPQ.add("Cherry");
        strPQ.add("3cherry");

        strPQ.add("avocado"); // Lowercase has higher ASCII value than uppercase

        System.out.println("String PriorityQueue (Natural Order - Alphabetical):");
        while (!strPQ.isEmpty()) {
            System.out.print("--->"+strPQ.poll() + " ");
        }
        // Output: Apple Banana Cherry avocado
        
        
        // PriorityQueue in Descending Order for Integers
        PriorityQueue<Integer> descPQ = new PriorityQueue<>(Collections.reverseOrder());
        // Alternatively: new PriorityQueue<>((a, b) -> b - a);

        descPQ.add(10);
        descPQ.add(5);
        descPQ.add(20);
        descPQ.add(1);

        for (Integer i : descPQ) {
            
           System.out.println("" + i);
        }
        
        
        
        System.out.println("Integer PriorityQueue (Descending Order):");
        while (!descPQ.isEmpty()) {
            System.out.print(descPQ.poll() + " ");
        }
        
        
        
        PriorityQueue<Student> studentPQ = new PriorityQueue<>();

        studentPQ.add(new Student("Alice", 85));
        studentPQ.add(new Student("Bob", 92));
        studentPQ.add(new Student("Charlie", 78));

        System.out.println("Students processed by highest grade first:");
        while (!studentPQ.isEmpty()) {
            System.out.println(studentPQ.poll());
        }
        // Output: Bob (92), Alice (85), Charlie (78)
        
        
        // Create a PQ that prioritizes employees with the LOWEST salary
        PriorityQueue<Employee> employeePQ = new PriorityQueue<>(
                Comparator.comparingInt(emp -> emp.salary)
        );

        // To prioritize HIGHEST salary, use:
        // Comparator.comparingInt((Employee e) -> e.salary).reversed()

        employeePQ.add(new Employee("John", 75000));
        employeePQ.add(new Employee("Jane", 95000));
        employeePQ.add(new Employee("Doe", 50000));

        System.out.println("Employees processed by lowest salary first:");
        while (!employeePQ.isEmpty()) {
            System.out.println(employeePQ.poll());
        }
        // Output: Doe ($50000), John ($75000), Jane ($95000)
    
    }
}
