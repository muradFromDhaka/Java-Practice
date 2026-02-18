package com.abc.SpringBootCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.SpringBootCRUD.entity.Student;
import com.abc.SpringBootCRUD.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository stu;
	
	public List<Student> getAllData(){
		List<Student> s = stu.findAll();
		return s;
	}
	
	public Student getById(Long id) {
		Student s = stu.findById(id).orElse(null);
		return s;
	}
	
	public Student save(Student s) {
		Student x = stu.save(s);
		return x;
	}
	
	public Student deleteData(Long id) {
		Optional<Student> s = stu.findById(id);
		
		if(s.isPresent()) {
		    Student x = s.get();
			stu.deleteById(id);
			return x;
		}else {
			return null;
		}
	}
	
	public Student getByName(String name) {
		Optional<Student> s = stu.findByName(name);
		return s.orElse(null);
	}
	
	public Student getByEmail(String email) {
		Optional<Student> s = stu.findByEmail(email);
		return s.orElse(null);
	}
}
