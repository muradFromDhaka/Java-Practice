<h1>Welcome to employee management system</h1>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>Employee List</h2>
	<div class="btn-container">
	       <a class="back-link" href="${pageContext.request.contextPath}/employees/form">Employee From</a>
	   </div>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Department</th>
                <th>Salary</th>
                <th>Hire Date</th>
                <th>Address</th>
				<th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${employees}">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.firstName}</td>
                    <td>${emp.lastName}</td>
                    <td>${emp.email}</td>
                    <td>${emp.phone}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                    <td>${emp.hireDate}</td>
                    <td>${emp.address}</td>
				   <td>
					<a class="back-link" href="${pageContext.request.contextPath}/employees/edit/${emp.id}">Edit</a>
					<a class="back-link" href="${pageContext.request.contextPath}/employees/delete/${emp.id}">Delete</a>&nbsp;
				   </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
