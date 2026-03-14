CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    email VARCHAR(100) 
);

DELETE  FROM users WHERE id IN (6,7);
SELECT * FROM users;


CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    age INT N`users`OT NULL,
    dob DATE NOT NULL
);

SELECT * FROM student;studentusersstudent


CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    dateOfBirth DATE,
    salary DECIMAL(10,2),
    address VARCHAR(100)
);

SELECT * FROM employees;