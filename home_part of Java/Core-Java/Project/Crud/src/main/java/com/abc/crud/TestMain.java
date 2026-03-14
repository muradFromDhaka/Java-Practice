/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crud;

import com.abc.crud.entity.Student;
import com.abc.crud.service.StudentService;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author B-2
 */
public class TestMain {
    public static void main(String[] args) {
//        StudentService studentDAO = new  StudentService();
//        
//        //Student student1 = new Student("Ahmad", " ahmad@gmail.com", 40, LocalDate.now());
//        //studentDAO.addStudent(student1);
//        
//        // Student student2 = new Student("ABC", " ABC@gmail.com", 40, LocalDate.of(2020,06,12));
//        //studentDAO.addStudent(student2);
//        
//        Student studentUpdate = new Student(3,"DEF", 50, " DEF@gmail.com", LocalDate.of(2020,06,15));
//        studentDAO.updateStudent(studentUpdate);
//        
//        //Student studentDelete = new Student();
//        studentDAO.deleteStudent(7);
//        
//        List<Student> students = studentDAO.getAllStudents();
//        for (Object s : students) {
//             System.out.println(s);
//        }
        


          Scanner s = new Scanner(System.in);
          StudentService studentDAO = new  StudentService();
          while(true){
              System.out.println("Student Management System.");
              System.out.println("1. Add Student");
              System.out.println("2. View All Students");
              System.out.println("3. Update Student");
              System.out.println("4. Delete Student");
              System.out.println("5. Get Student");
              System.out.println("6. Exit");
              System.out.println("Choose an Option: ");
              
              int choice = s.nextInt();
              s.nextLine();
              
              switch(choice){
                  case 1:
                      // Add Student
                      System.out.println("Enter  Name: ");
                      String name = s.nextLine();
                      System.out.println("Enter  Email: ");
                      String email = s.nextLine();
                      System.out.println("Enter  Age: ");
                      String age = s.nextLine();
                      s.nextLine(); // Consume newLine
                      
                      System.out.println("Enter DOB (YYY-MM-DD): ");
                      String dodbInput = s.nextLine();
                      LocalDate dob = LocalDate.parse(dodbInput);
                      
                      Student student = new Student(name,email,age,dob);
                      studentDAO.addStudent(student);
                      break;
                  case 2:
                      // View All Students
                      List<Student> students = studentDAO.getAllStudents();
                      for (Student x : students) {
                           System.out.println(x);
                      }
                      break;
                  
                  case 3:
                      // Update Student
                      System.out.println("Enter Student ID  to Update:");
                      int updateId = s.nextInt();
                      s.nextLine(); // consume newLine
                      System.out.println("Enter New Name: ");
                      String updateName = s.nextLine();
                      System.out.println("Enter New Email: ");
                      String updateEmail = s.nextLine();
                      System.out.println("Enter New Age: ");
                      int updateAge = s.nextInt();
                      s.nextLine(); // Consume newLine;
                      
                      
                    
              }
              
              
          }




    }
}
