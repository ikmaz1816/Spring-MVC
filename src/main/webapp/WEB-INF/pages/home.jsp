<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Students</title>
</head>
<body>
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Address</td>
		</tr>
		<c:forEach  items="${students}" var="stud" >
			<tr> 
				<td>${stud.id}</td>
				<td>${stud.name}</td>
				<td>${stud.address}</td>
			</tr>
		</c:forEach> 
	</table>
	<a href='<c:url value='/addstudent'></c:url>'>Add Student</a>
</body>
</html>