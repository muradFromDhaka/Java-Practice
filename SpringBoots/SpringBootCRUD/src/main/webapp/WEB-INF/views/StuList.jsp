<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Student List</title>
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
    <h3 class="text-center mb-4">🎓 Student List</h3>

    <div class="text-end mb-3">
      <a href="studentForm" class="btn btn-primary">➕ Add Student</a>
    </div>

    <table class="table table-bordered table-hover align-middle">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Class</th>
          <th>Group</th>
          <th>Email</th>
          <th>School</th>
          <th>Address</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="stu" items="${students}">
          <tr>
            <!-- id ফিল্ড নাম এখানে stuID -->
            <td>${stu.stuID}</td>
            <td>${stu.name}</td>
            <td>${stu.className}</td>
            <td>${stu.groupName}</td>
            <td>${stu.email}</td>
            <td>${stu.school}</td>
            <td>${stu.address}</td>
            <td class="text-center">
              <!-- Edit/Delete লিঙ্কে ফিল্ড নামের সাথে মিল রেখে পরিবর্তন -->
              <a href="editStudent/${stu.stuID}" class="btn btn-sm btn-warning">Edit</a>
              <a href="deleteStudent/${stu.stuID}" class="btn btn-sm btn-danger" 
                 onclick="return confirm('Are you sure to delete this student?');">Delete</a>
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
