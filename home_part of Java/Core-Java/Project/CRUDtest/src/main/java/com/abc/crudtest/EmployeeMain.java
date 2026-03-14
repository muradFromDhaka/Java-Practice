/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crudtest;

import com.abc.crudtest.Service.EmployeeService;
import com.abc.crudtest.entity.Employee;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author B-2
 */
public class EmployeeMain {
    public static void main(String[] args) {
        
        //Add employee;
        EmployeeService emp = new EmployeeService();
        
        for (int i = 1; i < 10; i++) {
            Employee employee = new Employee("Habib"+i, 25+i, LocalDate.now(),new  BigDecimal(250000.02*i), "Dhaka");
           // emp.addEmployee(employee);
        }


        //Read All employee;
        //emp.getAllEmployee();
        
        // update employee
        Employee x = new Employee(11l,"abc",25,LocalDate.now(),BigDecimal.valueOf(250000),"Dhaka");
       // emp.updateEmployee(x);
        
        //delete employee;
        emp.deleteEmployee(x);
        
    }
    
}
