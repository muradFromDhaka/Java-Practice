package com.example.SpringBootJDBC.controller;

import com.example.SpringBootJDBC.entity.Student;
import com.example.SpringBootJDBC.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public Student save(@Valid @RequestBody Student s) {
        return service.save(s);
    }

    @PutMapping
    public Student update(@Valid @RequestBody Student s) {
        return service.update(s);
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Student> all() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted";
    }
}