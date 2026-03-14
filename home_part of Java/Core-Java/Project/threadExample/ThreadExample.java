/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;

/**
 *
 * @author Faculty-1
 */
public class ThreadExample {

    public static void main(String[] args) {
//        System.out.println();
//        System.out.println(Thread.currentThread().getName() + "--- ");
//        System.out.println("Print Started");
//
//        MyThread thread1 = new MyThread();
//        thread1.setName("Thread-1");
//        thread1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Print Stopped");

        System.out.println(Thread.currentThread().getName() + ": Started");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Stopped");

    }
}
