/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.threadExample;




import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Employee1 {
    int id;
    double salary;

    public Employee1(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class SingleThreadSum {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();

        // Create 5000 employees
        for (int i = 1; i <= 10000; i++) {
            employees.add(new Employee1(i, 10 / i));
        }

        long start = System.currentTimeMillis();

        float total = 0;
        for (Employee1 e : employees) {
            try {
                Thread.sleep(1);
                total += e.getSalary();
            } catch (InterruptedException ex) {
                Logger.getLogger(SingleThreadSum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Total Salary (single-thread): " + total);
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}

