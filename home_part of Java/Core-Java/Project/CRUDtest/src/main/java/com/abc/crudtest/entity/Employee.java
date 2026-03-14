/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crudtest.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author B-2
 */
public class Employee {

    private Long id;
    private String name;
    private Integer age;
    private LocalDate dateOfBirth;
    private BigDecimal salary;
    private String address;
    
    Employee(){};

    public Employee(String name, Integer age, LocalDate dateOfBirth, BigDecimal salary, String address) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }

    public Employee(Long id, String name, Integer age, LocalDate dateOfBirth, BigDecimal salary, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getdateOfBirth() {
        return dateOfBirth;
    }

    public void setAteOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + ", address=" + address + '}';
    }
    
    

}
