/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;



import java.util.*;

class Employee3 {
    int id;
    double salary;

    public Employee3(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class MultiThreadSum {
    public static void main(String[] args) {
        List<Employee3> employees = new ArrayList<>();

        // Create 5000 employees
        for (int i = 1; i <= 10000; i++) {
            employees.add(new Employee3(i, 10 / i));
        }
        long start = System.currentTimeMillis();
        double total = employees
                .parallelStream()  // run in multiple threads
                .mapToDouble(emp -> {
                    return emp.getSalary();
                })
                .sum();
        long end = System.currentTimeMillis();
        System.out.println("Total Salary (multi-thread): " + total);
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
