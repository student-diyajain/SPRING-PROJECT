<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="base.jsp" %>
</head>
<body class="bg-dark text-white" >

<div class="container mt-3">
<div class="row">
<div class="col-md-12">
<!-- heading -->
    <h1 class="text-center mb-3">Welcome to Product App</h1>
<!-- table -->
    <table class="table table-bordered">
    <!--     head part -->
    <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${products}" var="p" >
   <tr>
      <th scope="row">TECHONLY${p.id }</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td class="font-weight-bold"> &#8377;${p.price }</td>
      <td>
      <a href="deleteForm/${p.id }"><i class="fa-solid fa-trash text-danger"></i></a>
      <a href="updateForm/${p.id }"><i class="fa-solid fa-marker"></i></a></td>
    </tr>
  </c:forEach>
   
 
  </tbody>
  
</table>
<!-- button     -->
    <div class="container text-center">
    <a href="addForm" class="btn btn-outline-success">Add Product</a>
    </div>
</div>
</div>
</div>

</body>
</html>