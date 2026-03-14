/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.crud.service;

import com.abc.crud.entity.Student;
import com.abc.crud.repository.DatabaseConnection;
import com.sun.source.tree.TryTree;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B-2
 */
public class StudentService {

    public void addStudent(Student student) {
        String aql = "INSERT INTO student  ( name, email, age, dob) VALUES (?, ? , ? , ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(aql)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getAge());
            ps.setDate(4, Date.valueOf(student.getDob()));
            
            ps.executeUpdate();
            System.out.println("Student added successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Read all Students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

       String sql = "SELECT * FROM student";
        try {
            Connection conn = DatabaseConnection.getConnection();
//            Statement ps = conn.createStatement();
//            ResultSet rs = ps.executeQuery(sql);
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Student student = new Student(
                                   rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getDate("dob").toLocalDate()
// Converting SQL date;
                  )  ;      
                students.add(student);
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    
       return students;
    }

    
    //Get Student by Id
    public Student getById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        Student student = null;
        try {
            Connection  conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()){
                       student = new Student(
                              rs.getInt("id"),
                              rs.getString("name"),
                              rs.getInt("age"),
                              rs.getString("email"),
                              rs.getDate("dob").toLocalDate()
                       );
                }
            } catch (SQLException e) {
                
            }
        } catch (Exception e) {
        }
        return student;
    }

  
    // Update Student
    public void updateStudent(Student student) {
        String sql = "UPDATE student SET name = ? , email = ?, age = ?, dob = ? WHERE id = ?";
        
        try {
            Connection  conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, student.getName());
             ps.setString(2, student.getEmail());
              ps.setInt(3, student.getAge());
               ps.setDate(4, Date.valueOf(student.getDob()));
                ps.setInt(5, student.getId());
                
             ps.executeUpdate();
             System.out.println("Student updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        String sql = "DELETE FROM  student WHERE id = ?";
        
        try {
            Connection  conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            
             ps.setInt(1, id); 
             ps.executeUpdate();
             
             System.out.println("Student deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}
