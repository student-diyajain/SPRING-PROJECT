<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${first}</h1>
<h2>${second}</h2>
<hr>


<!-- using request.getParameter() -->
<%-- <h2>Name:${name}</h2> --%>
<%-- <h2>Email:${email}</h2> --%>
<%-- <h2>Password:${password}</h2> --%>
<%-- <h2>Gender:${gender}</h2> --%>
<%-- <h2>Course:${course}</h2> --%>


<!-- using @RequestParam  -->
<%-- <h2>Name:${user.name}</h2> --%>
<%-- <h2>Email:${user.email}</h2> --%>
<%-- <h2>Password:${user.password}</h2> --%>
<%-- <h2>Gender:${user.gender}</h2> --%>
<%-- <h2>Course:${user.courses}</h2> --%>

<!-- using @ModelAttribute :automatically set the data in model with name(lowercase of class) -->
<h2>Name:${student.name}</h2>
<h2>Email:${student.email}</h2>
<h2>Password:${student.password}</h2>
<h2>Gender:${student.gender}</h2>
<h2>Course:${student.courses}</h2>
</body>
</html>