package com.abc.SpringBootEntityRelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.SpringBootEntityRelationship.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
