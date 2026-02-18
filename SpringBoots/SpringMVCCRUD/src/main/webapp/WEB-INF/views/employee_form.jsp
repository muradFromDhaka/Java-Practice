<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f4f6f8;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 50%;
            margin: 50px auto;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0px 4px 12px rgba(0,0,0,0.1);
            padding: 30px 40px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        label {
            font-weight: bold;
            color: #333;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 14px;
        }

        input:focus {
            border-color: #007bff;
            outline: none;
        }

        .btn-container {
            text-align: center;
            margin-top: 20px;
        }

        button {
            background: #007bff;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 15px;
            transition: background 0.3s ease;
        }

        button:hover {
            background: #0056b3;
        }

        .back-link {
            display: inline-block;
            margin-top: 15px;
            text-decoration: none;
            color: #007bff;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>${employee.id == null ? "Add New Employee" : "Edit Employee"}</h2>

    <form action="${pageContext.request.contextPath}/employees/save" method="post">
        <c:if test="${employee.id != null}">
            <input type="hidden" name="id" value="${employee.id}">
        </c:if>

        <label>First Name:</label>
        <input type="text" name="firstName" value="${employee.firstName}" placeholder="Enter first name" required>

        <label>Last Name:</label>
        <input type="text" name="lastName" value="${employee.lastName}" placeholder="Enter last name" required>

        <label>Email:</label>
        <input type="email" name="email" value="${employee.email}" placeholder="Enter email" required>

        <label>Phone:</label>
        <input type="text" name="phone" value="${employee.phone}" placeholder="Enter phone number">

        <label>Department:</label>
        <input type="text" name="department" value="${employee.department}" placeholder="Enter department" required>

        <label>Salary:</label>
        <input type="number" name="salary" step="0.01" value="${employee.salary}" placeholder="Enter salary" required>

        <label>Hire Date:</label>
        <input type="date" name="hireDate" value="${employee.hireDate}" required>

        <label>Address:</label>
        <input type="text" name="address" value="${employee.address}" placeholder="Enter address">

        <div class="btn-container">
            <button type="submit">Save</button>
        </div>
    </form>

    <div class="btn-container">
        <a class="back-link" href="${pageContext.request.contextPath}/employees/list">← Back to List</a>
    </div>
</div>
</body>
</html>
