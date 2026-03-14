/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crudtest.Service;

import com.abc.crudtest.entity.Employee;
import com.abc.crudtest.repository.DatabaseConnectionTest;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B-2
 */
public class EmployeeService {

    // Employee add;
    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employees (name,age,dateOfBirth,salary,address) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = DatabaseConnectionTest.getConnetion();
            PreparedStatement ps = conn.prepareStatement(sql);

            // ps.setLong(1, emp.getId());
            ps.setString(1, emp.getName());
            ps.setInt(2, emp.getAge());
            ps.setDate(3, Date.valueOf(emp.getdateOfBirth()));
            ps.setBigDecimal(4, emp.getSalary());
            ps.setString(5, emp.getAddress());

            ps.executeUpdate();
            System.out.println("Employee added successfully.");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    //Read All Employee;
    public List<Employee> getAllEmployee() {
        List<Employee> emp = new ArrayList<>();
        String sql = "select * from employees";
        try {
            Connection conn = DatabaseConnectionTest.getConnetion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee s = new Employee(
                        rs.getObject("id", Long.class),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDate("dateOfBirth").toLocalDate(),
                        rs.getBigDecimal("salary"),
                        rs.getString("address")
                );

                emp.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Employee employee : emp) {
            System.out.println(employee);
        }

        return emp;
    }
    
    //Update Employee;
    public void updateEmployee(Employee e){
        String sql = "update employees set name =?, age =?, dateOfBirth =?, salary =?, address =? where id =?";
        try {
            Connection conn = DatabaseConnectionTest.getConnetion();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, e.getName());
            ps.setInt(2, e.getAge());
            ps.setDate(3, Date.valueOf(e.getdateOfBirth()));
            ps.setBigDecimal(4, e.getSalary());
            ps.setString(5, e.getAddress());
            ps.setLong(6, e.getId());
            ps.executeUpdate();
            System.out.println("employee Updated successfully.");
        } catch (Exception a) {
            a.printStackTrace();
        }
    }
    
    public void deleteEmployee(Employee x){
        String sql = "delete from employees where id = ?";
        
        try {
            Connection conn = DatabaseConnectionTest.getConnetion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, x.getId());
            ps.executeUpdate();
            System.out.println("Employee deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
