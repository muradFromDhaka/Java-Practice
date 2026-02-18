package com.example.SpringMVCCRUD.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employeees")
@Data
public class Employeee {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, unique = true, length = 120)
    private String email;

    @Column(length = 15)
    private String phone;

    @Column(nullable = false, length = 100)
    private String department;

    @Column(nullable = false)
    private Double salary;

    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Column(length = 200)
    private String address;

    public Employeee() {}

    public Employeee(String firstName, String lastName, String email, String phone, String department, Double salary, LocalDate hireDate, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
        this.address = address;
     }

	
}
