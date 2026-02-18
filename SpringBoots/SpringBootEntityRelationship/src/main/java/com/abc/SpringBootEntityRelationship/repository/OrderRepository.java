package com.abc.SpringBootEntityRelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.SpringBootEntityRelationship.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
