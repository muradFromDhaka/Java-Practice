package com.example.SpringBootJDBC.service;

import com.example.SpringBootJDBC.entity.Student;
import com.example.SpringBootJDBC.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repo;

    public Student save(Student s) {
        repo.save(s);
        return s;
    }

    public Student update(Student s) {
        repo.update(s);
        return s;
    }

    public Student getById(int id) {
        return repo.findById(id);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void delete(int id) {
        repo.delete(id);
    }
}