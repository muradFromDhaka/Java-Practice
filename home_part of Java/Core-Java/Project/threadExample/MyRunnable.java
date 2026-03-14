/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;

/**
 *
 * @author Faculty-1
 */
public class MyRunnable implements Runnable {
    int sleep = 0;

    public MyRunnable(int sleep) {
        this.sleep = sleep;
    }
    
    @Override
    public void run() {
       loopData();
    }
   
    public void loopData(){
         for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}