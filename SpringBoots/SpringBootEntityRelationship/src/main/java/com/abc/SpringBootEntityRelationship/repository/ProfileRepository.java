package com.abc.SpringBootEntityRelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.SpringBootEntityRelationship.entity.Profile;



public interface ProfileRepository extends JpaRepository<Profile, Long> {
}