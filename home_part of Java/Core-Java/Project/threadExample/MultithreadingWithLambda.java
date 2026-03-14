/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;

public class MultithreadingWithLambda {

    public static void main(String[] args) {
        // Create and start a thread using a lambda expression
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500); // Pause for 500ms
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        },"Tread - 1: --");
        
        // Create and start another thread using a lambda expression
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500); // Pause for 500ms
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        },"Tread - 2: --");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
