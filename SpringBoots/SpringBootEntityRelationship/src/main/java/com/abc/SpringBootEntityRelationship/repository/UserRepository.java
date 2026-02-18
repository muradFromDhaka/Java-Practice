package com.abc.SpringBootEntityRelationship.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.SpringBootEntityRelationship.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {}

