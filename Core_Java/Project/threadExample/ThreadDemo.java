/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;




public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("=== Single Thread Execution ===");
        long start1 = System.currentTimeMillis();

        // Running tasks one by one (single-threaded)
        new Task("Task 1").run();
        new Task("Task 2").run();
        new Task("Task 3").run();

        long end1 = System.currentTimeMillis();
        System.out.println("Total time (single-thread): " + (end1 - start1) + " ms\n");

        System.out.println("=== Multi Thread Execution ===");
        long start2 = System.currentTimeMillis();

        // Running tasks simultaneously (multi-threaded)
        Thread t1 = new Thread(new Task("Task 1"));
        Thread t2 = new Thread(new Task("Task 2"));
        Thread t3 = new Thread(new Task("Task 3"));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        long end2 = System.currentTimeMillis();
        System.out.println("Total time (multi-thread): " + (end2 - start2) + " ms");
    }
}

