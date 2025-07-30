<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USERSAPP</title>
</head>
<body>

<form:form action="createform" modelAttribute="user" method="post" >

<label>Id : </label><form:input path="id" type="text"/><br>
<label>Name : </label><form:input path="name" type="text"/><br>
<label>Email : </label><form:input path="email" type="text"/><br>
<label>Department : </label><form:input path="dept" type="text"/><br>
<input type="submit" value="Submit">
</form:form>

</body>
</html>