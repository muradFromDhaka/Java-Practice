package com.example.SpringMVCCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMVCCRUD.entities.Employeee;

@Repository
public interface EmployeeeRepository extends JpaRepository<Employeee, Long> {

}
