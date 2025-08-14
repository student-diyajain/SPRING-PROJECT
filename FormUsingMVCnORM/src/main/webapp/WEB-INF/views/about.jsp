<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>about page</h1>

<h1><c:out value="jstl works!"></c:out></h1>

<h1>Friends:</h1>
<c:forEach var="item" items="${friends}">
<h2>${item}</h2>
</c:forEach>






</body>
</html>