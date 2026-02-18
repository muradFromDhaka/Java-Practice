<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Student Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body { background-color: #f8f9fa; font-family: 'Poppins', sans-serif; }
    .card { border-radius: 12px; box-shadow: 0 2px 12px rgba(0,0,0,0.1); }
  </style>
</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container mt-5">
  <div class="card p-4">
    <h3 class="text-center mb-4">📝 Student Form</h3>

	<form:form action="${pageContext.request.contextPath}/studentForm" method="post" modelAttribute="student">
      
      <!-- Hidden field for stuID when editing (optional) -->
      <form:hidden path="stuID" />

      <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <form:input path="name" cssClass="form-control" id="name" required="required" />
      </div>

      <div class="mb-3">
        <label for="className" class="form-label">Class</label>
        <form:input path="className" cssClass="form-control" id="className" required="required" />
      </div>

      <div class="mb-3">
        <label for="groupName" class="form-label">Group</label>
        <form:input path="groupName" cssClass="form-control" id="groupName" />
      </div>
      
      <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <form:input path="email" cssClass="form-control" id="email" required="required" />
      </div>

      <div class="mb-3">
        <label for="school" class="form-label">School</label>
        <form:input path="school" cssClass="form-control" id="school" />
      </div>

      <div class="mb-3">
        <label for="address" class="form-label">Address</label>
        <form:textarea path="address" cssClass="form-control" id="address" />
      </div>

      <div class="text-center">
        <button type="submit" class="btn btn-success">💾 Save Student</button>
        <a href="S_List" class="btn btn-secondary">🔙 Back</a>
      </div>

    </form:form>

  </div>
</div>

</body>
</html>
