package com.abc.crud.service;

import com.abc.crud.entity.Student;
import com.abc.crud.repository.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    // Create Student
    public void addStudent(Student student) {
        String sql = "INSERT INTO student (name, email, age, dob) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getAge());
            ps.setDate(4, Date.valueOf(student.getDob()));  // Converting LocalDate to SQL Date

            ps.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read all Students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("id"),//1
                        rs.getString("name"),//ahmad
                        rs.getString("email"),//jahkha
                        rs.getInt("age"),//alkha
                        rs.getDate("dob").toLocalDate() // sadas
                );
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
    // Get Student by ID

    public Student getById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        Student student = null;

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    student = new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getInt("age"),
                            rs.getDate("dob").toLocalDate() // Converting SQL Date to LocalDate
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

    // Update Student
    public void updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, email = ?, age = ?, dob = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getAge());
            ps.setDate(4, Date.valueOf(student.getDob()));  // Converting LocalDate to SQL Date
            ps.setInt(5, student.getId());

            ps.executeUpdate();
            System.out.println("Student updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
