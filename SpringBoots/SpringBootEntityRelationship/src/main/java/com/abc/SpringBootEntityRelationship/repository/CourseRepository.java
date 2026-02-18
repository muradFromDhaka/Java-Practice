package com.abc.SpringBootEntityRelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.SpringBootEntityRelationship.entity.Course;



public interface CourseRepository extends JpaRepository<Course, Long> {
}
