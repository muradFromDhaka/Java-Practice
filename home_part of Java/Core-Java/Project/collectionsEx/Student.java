/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.myfirstproject.collectionsEx;

/**
 *
 * @author Faculty-1
 */
public class  Student implements Comparable<Student> {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Define priority: Higher grade has higher priority
    @Override
    public int compareTo(Student other) {
        // Descending order by grade
        return other.grade - this.grade;
    }

    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}