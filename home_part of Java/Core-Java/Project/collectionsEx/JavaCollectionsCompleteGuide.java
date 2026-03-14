/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.collectionsEx;


import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;

public class JavaCollectionsCompleteGuide {
    
    public static void main(String[] args) {
        System.out.println("=== JAVA COLLECTIONS FRAMEWORK COMPLETE GUIDE ===\n");
        
        // 1. List Implementations
        arrayListExample();
        linkedListExample();
        vectorExample();
        stackExample();
        
        // 2. Set Implementations
        hashSetExample();
        linkedHashSetExample();
        treeSetExample();
        
        // 3. Queue Implementations
        priorityQueueExample();
        arrayDequeExample();
        linkedListQueueExample();
        
        // 4. Map Implementations
        hashMapExample();
        linkedHashMapExample();
        treeMapExample();
        hashTableExample();
        
        // 5. Concurrent Collections
        concurrentHashMapExample();
        copyOnWriteArrayListExample();
        
        // 6. Utility Classes
        collectionsUtilityExample();
        arraysUtilityExample();
    }
    
    // ==================== LIST IMPLEMENTATIONS ====================
    
    private static void arrayListExample() {
        System.out.println("1. ARRAYLIST EXAMPLE:");
        
        // Create ArrayList
        List<String> arrayList = new ArrayList<>();
        
        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add(1, "Blueberry"); // Add at specific index
        
        // Access elements
        System.out.println("Element at index 2: " + arrayList.get(2));
//        System.out.println("First element: " + arrayList.getFirst());
//        System.out.println("Last element: " + arrayList.getLast());
        
        // Modify elements
        arrayList.set(0, "Apricot");
        
        // Check properties
        System.out.println("Size: " + arrayList.size());
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        System.out.println("Is empty: " + arrayList.isEmpty());
        
        // Iterate
        System.out.print("Elements: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Remove elements
        arrayList.remove("Banana");
        arrayList.remove(0);
        
        // Convert to array
        String[] array = arrayList.toArray(new String[0]);
        
        // Clear list
        arrayList.clear();
        System.out.println("After clear - Size: " + arrayList.size() + "\n");
    }
    
    private static void linkedListExample() {
        System.out.println("2. LINKEDLIST EXAMPLE:");
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(5);    // Add at beginning
        linkedList.addLast(30);    // Add at end
        linkedList.add(1, 15);     // Add at specific position
        
        // Queue operations
        linkedList.offer(35);      // Add to end
        System.out.println("Peek (first element): " + linkedList.peek());
        System.out.println("Poll (remove first): " + linkedList.poll());
        
        // Stack operations
        linkedList.push(2);        // Add to beginning
        System.out.println("Pop (remove first): " + linkedList.pop());
        
        // Access elements
        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());
        
        // Iterate using ListIterator (bidirectional)
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }
    
    private static void vectorExample() {
        System.out.println("3. VECTOR EXAMPLE:");
        
        Vector<String> vector = new Vector<>();
        
        // Synchronized methods
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        
        // Enumeration (legacy iterator)
        Enumeration<String> enumeration = vector.elements();
        System.out.print("Vector elements: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();
        
        // Capacity methods
        System.out.println("Capacity: " + vector.capacity());
        vector.ensureCapacity(20);
        System.out.println("New capacity: " + vector.capacity() + "\n");
    }
    
    private static void stackExample() {
        System.out.println("4. STACK EXAMPLE:");
        
        Stack<Integer> stack = new Stack<>();
        
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peek and pop
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        
        // Search (returns position from top, 1-based)
        System.out.println("Position of 10: " + stack.search(10));
        System.out.println("Is empty: " + stack.empty() + "\n");
    }
    
    // ==================== SET IMPLEMENTATIONS ====================
    
    private static void hashSetExample() {
        System.out.println("5. HASHSET EXAMPLE:");
        
        Set<String> hashSet = new HashSet<>();
        
        // Add elements (no duplicates)
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // Duplicate, won't be added
        
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contains 'Green': " + hashSet.contains("Green"));
        
        // Iterate (no guaranteed order)
        System.out.print("Elements: ");
        for (String color : hashSet) {
            System.out.print(color + " ");
        }
        System.out.println();
        
        // Remove elements
        hashSet.remove("Blue");
        
        // Convert to array
        Object[] colors = hashSet.toArray();
        System.out.println();
    }
    
    private static void linkedHashSetExample() {
        System.out.println("6. LINKEDHASHSET EXAMPLE:");
        
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        
        // Maintains insertion order
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10); // Duplicate
        
        System.out.print("Elements in insertion order: ");
        for (Integer num : linkedHashSet) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
    
    private static void treeSetExample() {
        System.out.println("7. TREESET EXAMPLE:");
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Sorted set
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(70);
        treeSet.add(20);
        
        System.out.println("Elements in sorted order: " + treeSet);
        
        // Navigable methods
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
        System.out.println("Ceiling(35): " + treeSet.ceiling(35)); // >= 35
        System.out.println("Floor(35): " + treeSet.floor(35));     // <= 35
        System.out.println("Higher(30): " + treeSet.higher(30));   // > 30
        System.out.println("Lower(30): " + treeSet.lower(30));     // < 30
        
        // Subsets
        System.out.println("HeadSet(50): " + treeSet.headSet(50));      // < 50
        System.out.println("TailSet(50): " + treeSet.tailSet(50));      // >= 50
        System.out.println("SubSet(30, 70): " + treeSet.subSet(30, 70)); // 30 <= x < 70
        
        // Descending set
        System.out.println("Descending order: " + treeSet.descendingSet() + "\n");
    }
    
    // ==================== QUEUE IMPLEMENTATIONS ====================
    
    private static void priorityQueueExample() {
        System.out.println("8. PRIORITYQUEUE EXAMPLE:");
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Natural ordering (min-heap)
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        
        System.out.print("Elements in priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        
        // Max-heap using comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(10);
        maxHeap.add(30);
        
        System.out.println("Max element: " + maxHeap.peek() + "\n");
    }
    
    private static void arrayDequeExample() {
        System.out.println("9. ARRAYDEQUE EXAMPLE:");
        
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        // Add at both ends
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("VeryFirst");
        deque.offerLast("VeryLast");
        
        // Remove from both ends
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        
        // Peek both ends
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());
        
        System.out.println("Final deque: " + deque + "\n");
    }
    
    private static void linkedListQueueExample() {
        System.out.println("10. LINKEDLIST AS QUEUE EXAMPLE:");
        
        Queue<String> queue = new LinkedList<>();
        
        // Queue operations
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");
        
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue + "\n");
    }
    
    // ==================== MAP IMPLEMENTATIONS ====================
    
    private static void hashMapExample() {
        System.out.println("11. HASHMAP EXAMPLE:");
        
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Put elements
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 28);
        hashMap.put("John", 26); // Update existing key
        
        // Access elements
        System.out.println("John's age: " + hashMap.get("John"));
        System.out.println("Contains key 'Alice': " + hashMap.containsKey("Alice"));
        System.out.println("Contains value 30: " + hashMap.containsValue(30));
        
        // Iterate through entries
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Iterate through keys
        System.out.println("Keys: " + hashMap.keySet());
        
        // Iterate through values
        System.out.println("Values: " + hashMap.values());
        
        // Remove element
        hashMap.remove("Bob");
        System.out.println("After removal: " + hashMap);
        
        // Compute methods
        hashMap.compute("John", (k, v) -> v + 1); // Increment age
        hashMap.computeIfAbsent("Charlie", k -> 35); // Add if absent
        hashMap.computeIfPresent("Alice", (k, v) -> v + 2); // Update if present
        
        System.out.println("After computations: " + hashMap + "\n");
    }
    
    private static void linkedHashMapExample() {
        System.out.println("12. LINKEDHASHMAP EXAMPLE:");
        
        // Maintains insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Zebra", 1);
        linkedHashMap.put("Apple", 2);
        linkedHashMap.put("Banana", 3);
        
        System.out.println("Insertion order preserved: " + linkedHashMap);
        
        // Access order (LRU cache)
        Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("A", 1);
        accessOrderMap.put("B", 2);
        accessOrderMap.put("C", 3);
        
        accessOrderMap.get("A"); // Access moves to end
        accessOrderMap.get("B"); // Access moves to end
        
        System.out.println("Access order: " + accessOrderMap + "\n");
    }
    
    private static void treeMapExample() {
        System.out.println("13. TREEMAP EXAMPLE:");
        
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Sorted map
        treeMap.put("Orange", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 4);
        treeMap.put("Cherry", 6);
        
        System.out.println("Sorted keys: " + treeMap);
        
        // Navigable map methods
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        System.out.println("Ceiling key (B): " + treeMap.ceilingKey("B"));
        System.out.println("Floor key (B): " + treeMap.floorKey("B"));
        
        // Submaps
        System.out.println("HeadMap (C): " + treeMap.headMap("C"));
        System.out.println("TailMap (B): " + treeMap.tailMap("B"));
        System.out.println("SubMap (A-C): " + treeMap.subMap("A", "C"));
        
        // Descending map
        System.out.println("Descending map: " + treeMap.descendingMap() + "\n");
    }
    
    private static void hashTableExample() {
        System.out.println("14. HASHTABLE EXAMPLE:");
        
        Hashtable<String, String> hashtable = new Hashtable<>();
        
        // Synchronized map
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        hashtable.put("key3", "value3");
        
        // Enumeration for keys
        Enumeration<String> keys = hashtable.keys();
        System.out.print("Keys: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();
        
        // Enumeration for values
        Enumeration<String> values = hashtable.elements();
        System.out.print("Values: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println("\n");
    }
    
    // ==================== CONCURRENT COLLECTIONS ====================
    
    private static void concurrentHashMapExample() {
        System.out.println("15. CONCURRENTHASHMAP EXAMPLE:");
        
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        
        // Thread-safe operations
        concurrentMap.put("A", 1);
        concurrentMap.put("B", 2);
        concurrentMap.put("C", 3);
        
        // Atomic operations
        concurrentMap.compute("A", (k, v) -> v + 10);
        concurrentMap.merge("B", 5, (oldVal, newVal) -> oldVal + newVal);
        
        System.out.println("ConcurrentHashMap: " + concurrentMap);
        
        // Search methods
        Integer result = concurrentMap.search(1, (k, v) -> v > 2 ? v : null);
        System.out.println("Search result: " + result + "\n");
    }
    
    private static void copyOnWriteArrayListExample() {
        System.out.println("16. COPYONWRITEARRAYLIST EXAMPLE:");
        
        CopyOnWriteArrayList<String> copyOnWriteList = new CopyOnWriteArrayList<>();
        
        // Thread-safe list (good for read-heavy operations)
        copyOnWriteList.add("Read");
        copyOnWriteList.add("Update");
        copyOnWriteList.add("Delete");
        
        // Snapshot iterator (immune to modifications)
        Iterator<String> iterator = copyOnWriteList.iterator();
        copyOnWriteList.add("New Element"); // Won't affect current iterator
        
        System.out.print("Elements (snapshot): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\nActual list: " + copyOnWriteList + "\n");
    }
    
    // ==================== UTILITY CLASSES ====================
    
    private static void collectionsUtilityExample() {
        System.out.println("17. COLLECTIONS UTILITY METHODS:");
        
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3));
        
        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        
        // Reverse
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        
        // Shuffle
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        
        // Binary search
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);
        
        // Min/Max
        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Max: " + Collections.max(numbers));
        
        // Frequency
        System.out.println("Frequency of 5: " + Collections.frequency(numbers, 5));
        
        // Synchronized collections
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("thread-safe");
        System.out.println("Synchronized list: " + syncList + "\n");
    }
    
    private static void arraysUtilityExample() {
        System.out.println("18. ARRAYS UTILITY METHODS:");
        
        int[] array = {5, 2, 8, 1, 9};
        
        // Sort
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        // Binary search
        int index = Arrays.binarySearch(array, 8);
        System.out.println("Index of 8: " + index);
        
        // Fill
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
        
        // Copy
        int[] copiedArray = Arrays.copyOf(array, 3);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        
        // Compare
        int[] array2 = {1, 2, 5, 8, 9};
        System.out.println("Arrays equal: " + Arrays.equals(array, array2));
        
        // Stream
        System.out.println("Sum: " + Arrays.stream(array).sum() + "\n");
    }
}