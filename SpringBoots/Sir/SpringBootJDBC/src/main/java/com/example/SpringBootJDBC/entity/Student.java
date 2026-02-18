package com.example.SpringBootJDBC.entity;


import com.example.SpringBootJDBC.enums.StudentStatus;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

//    @Positive(message = "ID must be positive")
    private Integer id;

//    @NotBlank(message = "Name cannot be empty")
//    @Size(min = 2, max = 100, message = "Name must be 2–100 characters")
    private String name;

//    @NotBlank(message = "Email cannot be empty")
//    @Email(message = "Invalid email format")
//    @Size(max = 120, message = "Email must not exceed 120 characters")
    private String email;

//    @NotNull(message = "Age cannot be null")
//    @Min(value = 1, message = "Age must be at least 1")
//    @Max(value = 120, message = "Age cannot exceed 120")
    private Integer age;

//    @NotNull(message = "GPA cannot be null")
//    @DecimalMin(value = "0.0", message = "GPA must be 0.0 or higher")
//    @DecimalMax(value = "4.0", message = "GPA cannot exceed 4.0")
    private Double gpa;

//    @NotNull(message = "Active status must be provided")
    private Boolean active;

//    @NotNull(message = "Date of birth cannot be null")
//    @Past(message = "DOB must be in the past")
    private LocalDate dob;

//    @NotNull(message = "Created date cannot be null")
//    @PastOrPresent(message = "CreatedAt cannot be a future date")
    private LocalDateTime createdAt;

//    @NotNull(message = "Status cannot be null")

    private StudentStatus status;
}
