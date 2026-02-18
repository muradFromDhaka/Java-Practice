package com.example.SpringBootJDBC.util;

import com.example.SpringBootJDBC.entity.Student;
import com.example.SpringBootJDBC.enums.StudentStatus;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        return Student.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .email(rs.getString("email"))
                .age(rs.getInt("age"))
                .gpa(rs.getDouble("gpa"))
                .active(rs.getBoolean("active"))
                .dob(rs.getDate("dob").toLocalDate())
                .createdAt(rs.getTimestamp("created_at").toLocalDateTime())
                .status(StudentStatus.valueOf(rs.getString("status")))
                .build();
    }
}