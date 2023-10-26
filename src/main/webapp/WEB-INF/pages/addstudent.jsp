<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>STUDENT REGISTRATION</h1>
		<form:form action="register" method="post" modelAttribute="student">
			Id:<form:input path="id" required="required"/>
			<br>
			Name:<form:input path="name" required="required"/>
			<br>
			Address:<form:input path="address" required="required"/>
			<form:button>Submit</form:button>
		</form:form> 
</body>
</html>