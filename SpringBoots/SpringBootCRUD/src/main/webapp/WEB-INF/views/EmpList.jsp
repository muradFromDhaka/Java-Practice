<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Employee List</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body { background-color: #f8f9fa; font-family: 'Poppins', sans-serif; }
    .container { margin-top: 40px; }
    .card { border-radius: 12px; box-shadow: 0 2px 12px rgba(0,0,0,0.1); }
    .table thead { background-color: #0d6efd; color: white; }
    .btn-sm { font-size: 0.8rem; }
  </style>
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
  <div class="card p-4">
    <h3 class="text-center mb-4">👥 Employee List</h3>

    <div class="text-end mb-3">
      <a href="employeeForm" class="btn btn-primary">➕ Add Employee</a>
    </div>

    <table class="table table-bordered table-hover align-middle">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Salary</th>
          <th>Address</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="emp" items="${employees}">
          <tr>
            <td>${emp.empId}</td>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.salary}</td>
            <td>${emp.address}</td>
            <td class="text-center">
              <a href="editEmployee/${emp.empId}" class="btn btn-sm btn-warning">Edit</a>
              <a href="deleteEmployee/${emp.empId}" class="btn btn-sm btn-danger" 
                 onclick="return confirm('Are you sure to delete this employee?');">Delete</a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
