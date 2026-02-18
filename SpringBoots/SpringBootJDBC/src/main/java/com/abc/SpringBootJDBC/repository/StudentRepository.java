package com.abc.SpringBootJDBC.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abc.SpringBootJDBC.entity.Student;
import com.abc.SpringBootJDBC.util.StudentRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

	private final JdbcTemplate jdbc;
	
	public int save(Student s) {
		String sql = """
			    INSERT INTO student
			        (name, email, age, gpa, active, dob, created_at, status)
			    VALUES (?, ?, ?, ?, ?, ?, ?, ?)
			""";
	
	
	
	return jdbc.update(sql,
			s.getName(),
			s.getEmail(),
			s.getAge(),
			s.getGpa(),
			s.getActive(),
			s.getDob(),
			s.getName(),
			Timestamp.valueOf(s.getCreatedAt()),
			s.getStatus().name()
			
			);
	
	}

	
	
	public int update(Student s) {
		String sql = """
			    Update student set name=?, email=?, age=?, gpa=?, active=?, dob=?, created_at=?, status=? where id=?
			    VALUES (?, ?, ?, ?, ?, ?, ?, ?)
			""";
	
	
	
	return jdbc.update(sql,
			s.getName(),
			s.getEmail(),
			s.getAge(),
			s.getGpa(),
			s.getActive(),
			s.getDob(),
			s.getName(),
			Timestamp.valueOf(s.getCreatedAt()),
			s.getStatus().name(),
			s.getId()
			);
	
	}
	
	
	public Student findById(int id) {
		return jdbc.queryForObject("select * from student where id=?" , new StudentRowMapper(),id);
	}
	
	
	public List<Student> findAll(){
		
		return jdbc.query("select * from student where id=?" , new StudentRowMapper());
	}
	
	
	public int delete(int id) {
		return jdbc.update("delete from student where id=?" ,id);
	}

}
