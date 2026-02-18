package com.example.SpringBootJDBC.repository;


import com.example.SpringBootJDBC.entity.Student;
import com.example.SpringBootJDBC.util.StudentRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final JdbcTemplate jdbc;

    public int save(Student s) {
        String sql = """
                INSERT INTO students(name, email, age, gpa, active, dob, created_at, status)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                """;

        return jdbc.update(sql, s.getName(), s.getEmail(), s.getAge(), s.getGpa(), s.getActive(), s.getDob(), Timestamp.valueOf(s.getCreatedAt()), s.getStatus().name());
    }

    public int update(Student s) {
        String sql = """
                UPDATE students SET name=?, email=?, age=?, gpa=?, active=?, dob=?,
                created_at=?, status=? WHERE id=?
                """;

        return jdbc.update(sql, s.getName(), s.getEmail(), s.getAge(), s.getGpa(), s.getActive(), s.getDob(), Timestamp.valueOf(s.getCreatedAt()), s.getStatus().name(), s.getId());
    }

    public Student findById(int id) {
        return jdbc.queryForObject(
                "SELECT * FROM students WHERE id=?",
                new StudentRowMapper(),
                id);
    }

    public List<Student> findAll() {
        return jdbc.query("SELECT * FROM students",
                new StudentRowMapper());
    }

    public int delete(int id) {
        return jdbc.update("DELETE FROM students WHERE id=?",
                id);
    }

}
