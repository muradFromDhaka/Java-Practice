/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;

import java.util.*;
import java.util.concurrent.*;

class Employee4 {

    int id;
    double salary;

    public Employee4(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


}

public class ThreadPoolSum {

    public static void main(String[] args) throws Exception {
        List<Employee4> employees = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            employees.add(new Employee4(i, 10 / i));
        }

        int numThreads = 20; // we will use 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        List<Future<Double>> results = new ArrayList<>();
        int chunkSize = employees.size() / numThreads;//1000
//        int chunkSize = 500;

        long start = System.currentTimeMillis();

        // Divide list into chunks and submit to threads
        for (int i = 0; i < numThreads; i++) {
            int startIdx = i * chunkSize;//0-1000, 1000-2000,
            int endIdx = (i == numThreads - 1) ? employees.size() : startIdx + chunkSize;
            List<Employee4> sublist = employees.subList(startIdx, endIdx);

            Callable<Double> task = () -> {
                double sum = 0;
                for (Employee4 e : sublist) {
                    sum += e.getSalary();
                }
                return sum;
            };
            results.add(executor.submit(task));
        }

        double total = 0;
        for (Future<Double> f : results) {
            total += f.get(); // wait for result
        }

        long end = System.currentTimeMillis();
        executor.shutdown();

        System.out.println("Total Salary (ThreadPool): " + total);
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
