package com.abc.SpringBootJDBC.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.abc.SpringBootJDBC.enums.StudentStatus;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

	
	@NotBlank(message="ID must be positive")
	private Integer id;
	private String name;
	private String email;
	private Integer age;
	private Double gpa;
	private Boolean active;
	private LocalDate dob;
	private LocalDateTime createdAt;
	private StudentStatus status;
	
	
}
