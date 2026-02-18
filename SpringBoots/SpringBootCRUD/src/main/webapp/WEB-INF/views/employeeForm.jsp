<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>${employee.empId == null ? "Add Employee" : "Edit Employee"}</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body { background-color: #f4f6f9; font-family: 'Poppins', sans-serif; }
    .container { max-width: 600px; margin-top: 50px; }
    .card { border-radius: 12px; box-shadow: 0 2px 12px rgba(0,0,0,0.1); }
    .btn-primary { background-color: #0d6efd; border: none; }
    .btn-primary:hover { background-color: #0b5ed7; }
  </style>
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container">
  <div class="card p-4">
    <h3 class="text-center mb-4">
      ${employee.empId == null ? "➕ Add New Employee" : "✏️ Edit Employee"}
    </h3>

    <form:form modelAttribute="employee"
               action="${employee.empId == null ? 'saveEmployee' : '/updateEmployee'}"
               method="post">

      <form:hidden path="empId"/>

      <div class="mb-3">
        <label class="form-label">Full Name</label>
        <form:input path="name" cssClass="form-control" placeholder="Enter full name" required="true"/>
      </div>

      <div class="mb-3">
        <label class="form-label">Email</label>
        <form:input path="email" cssClass="form-control" type="email" placeholder="Enter email" required="true"/>
      </div>

      <div class="mb-3">
        <label class="form-label">Salary</label>
        <form:input path="salary" cssClass="form-control" type="number" step="0.01" placeholder="Enter salary" required="true"/>
      </div>

      <div class="mb-3">
        <label class="form-label">Address</label>
        <form:textarea path="address" cssClass="form-control" rows="3" placeholder="Enter address"/>
      </div>

      <div class="d-grid">
        <button type="submit" class="btn btn-primary btn-lg">
          ${employee.empId == null ? "Save Employee" : "Update Employee"}
        </button>
      </div>
    </form:form>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
