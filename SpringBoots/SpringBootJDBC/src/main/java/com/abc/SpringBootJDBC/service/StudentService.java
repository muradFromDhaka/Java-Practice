package com.abc.SpringBootJDBC.service;

import org.springframework.stereotype.Service;

import com.abc.SpringBootJDBC.entity.Student;
import com.abc.SpringBootJDBC.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository repo;
	
	
	public Student save(Student s) {
		repo.save(s);
		
		return s;
	}
	

	
	
	
}
