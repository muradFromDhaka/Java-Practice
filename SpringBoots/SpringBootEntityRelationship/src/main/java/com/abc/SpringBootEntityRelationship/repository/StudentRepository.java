package com.abc.SpringBootEntityRelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.SpringBootEntityRelationship.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
