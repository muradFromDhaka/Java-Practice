package com.abc.SpringBootCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Student {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stuID;
	private String name;
	private String className;
	private String groupName;
	private String email;
	private String school;
	private String address;
	
	
}
