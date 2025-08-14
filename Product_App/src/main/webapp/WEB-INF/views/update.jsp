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
<body>
<div class="container mt-3">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="text-center mb-3">Change the product detail</h1>

            <form action="${pageContext.request.contextPath}/handle-product" method="post">
                <input type="text" class="form-control" id="id" 
                            name="id" value="${p.id}" hidden>
                <div class="form-group">
                    <label for="name">Product Name</label>
                    <input type="text" class="form-control" id="name" 
                           aria-describedby="emailHelp" name="name" value="${p.name}">
                </div>

                <div class="form-group">
                    <label for="description">Product Description</label>
                    <textarea class="form-control" name="description" 
                              id="description" rows="5" >${p.description}   
                    </textarea>
                </div>

                <div class="form-group">
                    <label for="price">Product Price</label>
                    <input type="text" 
                           name="price" class="form-control" id="price" value="${p.price}">
                </div>

                <div class="container text-center">
                    <a href="${pageContext.request.contextPath}/" 
                       class="btn btn-outline-danger">Back</a>
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>


