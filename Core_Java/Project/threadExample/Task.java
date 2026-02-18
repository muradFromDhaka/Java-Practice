/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;



public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started on " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate heavy work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished on " + Thread.currentThread().getName());
    }
}
