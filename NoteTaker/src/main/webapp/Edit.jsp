<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"  %>
<%@page import="com.entities.*"%>
<head>
<meta charset="UTF-8">
    <%@include file="all_js_css.jsp" %>
<link  href="css/style.css" rel="stylesheet" >

<title>Edit Notes</title>
</head>
<body>
 <!-- navbar -->
 <div class="container">
      <%@include file="navbar.jsp" %>
      <h1 class="text-uppercase" >edit note:</h1>
     
      <div class="row">
      <div class="col-12">
      
      
      
    
      
         <%
           //fetch noteid
	       int noteId=Integer.parseInt(request.getParameter("note_id").trim());
		 
		   //Get session from FactoryProvider
	       Session s=FactoryProvider.getFactory().openSession();
		   Note note=(Note)s.get(Note.class,noteId);
		   
		  %>
      
     <!-- form -->
     <div class="container">
     <form action="UpdateServlet"   method="post">
    <input value=<%=note.getId()%> name="ID" type="hidden" />
   
  <div class="form-group">
 
    <label for="title">Note Title</label>
    <input 
     required 
     name="TITLE"
     type="text" 
     class="form-control" 
     id="title" 
     aria-describedby="emailHelp" 
     placeholder="Enter here!"
     value="<%= note.getTitle()%>">
  </div>
  
  <div class="form-group">
    <label for="content">Note Content</label>
   <textarea 
   required  
   name="CONTENT"
   id="title" 
   class="form-control"  
   placeholder="Enter your Context here!"
   style="height:300px;"><%=note.getContent()%></textarea>
  </div>
  
  <div  class="container text-center">
    <button type="submit" class="btn btn-success">Save Your Note</button>
  </div>

</form>
     </div>

      
      
      
      
</body>
</html>