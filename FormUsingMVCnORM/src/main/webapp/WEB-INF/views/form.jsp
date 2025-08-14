<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .container{
      width:30%;
      border:1px solid black;
      margin:auto;
      padding:20px;
      font-size:20px;
     }
  #myForm table tr td input{
  font-size:20px;}

</style>
</head>
<body>
<div class="container">
<h1>MyForm</h1>
<form id="myForm" action="processform" method="post">
<table>
<tr>
<td>Enter your name:</td>
<td><input type="text" name="name"  placeholder="Enter here!"></td>
</tr>

<tr>
<td>Enter your password:</td>
<td><input type="password" name="password"  placeholder="Enter here!"></td>
</tr>

<tr>
<td>Enter your email:</td>
<td><input type="email" name="email"  placeholder="Enter here!"></td>
</tr>

<tr>
<td>Select Gender:</td>
<td>
<input type="radio" value="male" name="gender">male 
<input type="radio" value="female" name="gender">female
</td>
</tr>

<tr>
<td>Select your Courses:</td>
<td>
<select name="courses">
<option value="Java">Java</option>
<option value="Php">Php</option>
<option value="Python">Python</option>
<option value="Android">Android</option>
</select>
</td>
</tr>

<tr>
<td ></td>
<td>
  <input type="submit" value="Submit">
  <input type="reset" value="Reset"> 
</td>
</tr>

</table>
</form>
</div>
</body>
</html>