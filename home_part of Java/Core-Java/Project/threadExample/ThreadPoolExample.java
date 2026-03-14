/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerTask implements Runnable {
    private String name;
    public WorkerTask(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Create a pool with 3 threads
        ExecutorService pool = Executors.newFixedThreadPool(10);

        // Submit 6 tasks
        for (int i = 1; i <= 20; i++) {
            pool.execute(new WorkerTask("Task " + i));
        }
        pool.shutdown(); 
    }
}
