/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;



import java.util.*;

class Employee {
    int id;
    double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class SalaryTask extends Thread {
    private List<Employee> employees;
    private double partialSum = 0;

    public SalaryTask(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void run() {
        for (Employee e : employees) {
            partialSum += e.getSalary();
        }
    }

    public double getPartialSum() {
        return partialSum;
    }
}

public class CustomThreadSum {
    public static void main(String[] args) throws InterruptedException {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            employees.add(new Employee(i, 10/ i));
        }

        int numThreads = 10;
        int chunkSize = employees.size() / numThreads;

        SalaryTask[] tasks = new SalaryTask[numThreads];

        long start = System.currentTimeMillis();

        // Divide work
        for (int i = 0; i < numThreads; i++) {
            int startIdx = i * chunkSize;
            int endIdx = (i == numThreads - 1) ? employees.size() : startIdx + chunkSize;

            tasks[i] = new SalaryTask(employees.subList(startIdx, endIdx));
            tasks[i].start();
        }

        double total = 0;
        for (int i = 0; i < numThreads; i++) {
            tasks[i].join(); // wait until thread finishes
            total += tasks[i].getPartialSum();
        }

        long end = System.currentTimeMillis();

        System.out.println("Total Salary (Custom Threads): " + total);
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
