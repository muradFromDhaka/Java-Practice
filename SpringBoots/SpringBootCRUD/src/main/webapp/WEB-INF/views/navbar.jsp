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
      
        
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
  <div class="container">
    <a class="navbar-brand fw-bold d-flex align-items-center" href="/Home">
      <i class="bi bi-people-fill me-2" style="font-size: 1.5rem;"></i> MicroApp
    </a>

    <!-- Removed the button and collapse -->

    <!-- Navigation items displayed directly -->
    <ul class="navbar-nav ms-auto fw-semibold d-flex flex-row gap-3">
      <li class="nav-item">
        <a class="nav-link d-flex align-items-center" href="${pageContext.request.contextPath}/">
          <i class="bi bi-briefcase me-1"></i> Employees
        </a>
      </li>
	  
	  <li class="nav-item">
	         <a class="nav-link d-flex align-items-center" href="/Home">
	           <i class="bi bi-briefcase me-1"></i> Home
	         </a>
	   </li>
      <li class="nav-item">
        <a class="nav-link d-flex align-items-center" href="${pageContext.request.contextPath}/employeeForm">
          <i class="bi bi-person-plus-fill me-1"></i> Add Employee
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link d-flex align-items-center" href="${pageContext.request.contextPath}/S_List">
          <i class="bi bi-journal-text me-1"></i> Student List
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link d-flex align-items-center" href="${pageContext.request.contextPath}/studentForm">
          <i class="bi bi-person-plus me-1"></i> Add Student
        </a>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>
