/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;

/**
 *
 * @author Faculty-1
 */
public class RunnableExample {
     public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(500), "Runnable-Thread-1");
        Thread thread2 = new Thread(new MyRunnable(700), "Runnable-Thread-2");
        
        thread1.start();
        thread2.start();
    }
}
