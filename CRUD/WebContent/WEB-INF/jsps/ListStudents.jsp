<%-- 
Author : Kartavya Goswami
Purpose : This page will fetch all saved data. 
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Student</title>
</head>

<body>
	<h1 align="center">List of Students</h1>
	<hr />

	<p align="right">
		<button onclick="window.location.href = 'Add '" ; returnfalse;>Add
			Student</button>
	</p>
	<center>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${studentList}" var="student">

				<c:url var="updateLink" value="showUpdateForm">
					<c:param name="studentName" value="${student.name}"></c:param>
				</c:url>

				<c:url var="deleteLink" value="deleteRecord">
					<c:param name="studentName" value="${student.name}"></c:param>
				</c:url>

				<tr>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td><a href="${updateLink}">Update</a> | <a
						onclick="if(!(confirm('Are you sure that you want delete the student recored?'))) return false;"
						href="${deleteLink}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<hr />
	</center>
</body>
</html>