/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.collectionsEx;




import java.util.*;

public class SetsAndMapsExample {

    public static void main(String[] args) {
        System.out.println("=== SETS EXAMPLES ===");
        demonstrateSets();

        System.out.println("\n=== MAPS EXAMPLES ===");
        demonstrateMaps();
    }

    // ==================== SETS ====================
    public static void demonstrateSets() {
        // 1. HashSet: Unordered, uses hashCode(), fastest for add/remove/contains
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate - will be ignored
        System.out.println("HashSet (Unordered, No duplicates): " + hashSet);

        // 2. LinkedHashSet: Maintains INSERTION order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Zebra");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);

        // 3. TreeSet: Maintains NATURAL SORTING order (alphabetical for String)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Banana");
        System.out.println("TreeSet (Sorted Order): " + treeSet);

        // Common Set Operations
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Union: All elements from both sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union (set1 ∪ set2): " + union);

        // Intersection: Common elements
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection (set1 ∩ set2): " + intersection);

        // Difference: Elements in set1 but not in set2
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);
    }

    // ==================== MAPS ====================
    public static void demonstrateMaps() {
        // 1. HashMap: Key-Value pairs, Unordered, allows one null key
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 50);
        hashMap.put("Banana", 30);
        hashMap.put("Orange", 40);
        hashMap.put("Apple", 55); // Replaces the value for key "Apple"
        hashMap.put(null, 0);     // Allows one null key
        System.out.println("HashMap: " + hashMap);
        System.out.println("Price of Banana: " + hashMap.get("Banana"));

        // 2. LinkedHashMap: Maintains INSERTION order of keys
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Zebra", 100);
        linkedHashMap.put("Apple", 50);
        linkedHashMap.put("Banana", 30);
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);

        // 3. TreeMap: Maintains NATURAL SORTING order of keys
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 100);
        treeMap.put("Apple", 50);
        treeMap.put("Banana", 30);
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // Iterating over a Map (Multiple Ways)
        System.out.println("\nIterating over HashMap:");
        // Method 1: Using keySet()
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Method 2: Using entrySet() (More Efficient)
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Common Map Operations
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Check if a key or value exists
        System.out.println("\nContains key 'A': " + map.containsKey("A"));
        System.out.println("Contains value 2: " + map.containsValue(2));

        // Remove a key
        map.remove("B");
        System.out.println("Map after removing key 'B': " + map);

        // Get all keys and values
        System.out.println("All keys: " + map.keySet());
        System.out.println("All values: " + map.values());
    }
}
