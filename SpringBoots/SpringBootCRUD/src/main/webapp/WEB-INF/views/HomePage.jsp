<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home | Spring CRUD App</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .hero {
            padding: 100px 0;
            text-align: center;
            background: linear-gradient(135deg, #007bff, #6610f2);
            color: white;
        }
        .btn-custom {
            min-width: 200px;
            margin: 10px;
            font-weight: 500;
        }
    </style>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
 
  

    <!-- Hero Section -->
    <section class="hero">
        <div class="container">
            <h1 class="display-5">Welcome to the Spring Boot CRUD App</h1>
            <p class="lead">Manage Employees and Students with ease</p>
            <div class="d-flex flex-wrap justify-content-center mt-4">
                <a href="/employees" class="btn btn-light btn-custom"><i class="bi bi-people-fill me-1"></i> View Employees</a>
                <a href="/employeeForm" class="btn btn-outline-light btn-custom"><i class="bi bi-person-plus-fill me-1"></i> Add Employee</a>
                <a href="/S_List" class="btn btn-light btn-custom"><i class="bi bi-journal-text me-1"></i> View Students</a>
                <a href="/studentForm" class="btn btn-outline-light btn-custom"><i class="bi bi-person-plus me-1"></i> Add Student</a>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer class="text-center text-muted py-4">
        &copy; 2025 Spring CRUD App. All rights reserved.
    </footer>

</body>
</html>
