package com.abc.StudentToDoApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.StudentToDoApp.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

	
}
