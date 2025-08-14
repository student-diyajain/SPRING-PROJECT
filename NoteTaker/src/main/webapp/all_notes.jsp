<!doctype html>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.entities.*"%>
<html lang="en">
<%@page import="com.helper.FactoryProvider"%> 
<%@page import="org.hibernate.Session"  %>
<%@page import="org.hibernate.Query" %>
<%@page import="java.util.List" %>
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%@include file="all_js_css.jsp" %>
         <link  href="css/style.css" rel="stylesheet" >
    <title>Show Notes</title>
  </head>
  
  <body>
  
 <!-- navbar -->
 <div class="container">
      <%@include file="navbar.jsp" %>
      <h1  >All Notes:</h1>
     
      <div class="row">
      <div class="col-12">
      <!--all java code we can write in this -->
      <%
      Session s=FactoryProvider.getFactory().openSession();
      String query="from Note";
      Query q=s.createQuery(query);
      List<Note> list=q.list();
      for(Note note:list){
    	 
      %>
      <!-- card -->
     
        
         <div class="card mt-3 px-5" >
         <img src="img/2.png" class="img-fluid m-4 mx-auto"   style="max-width:100px"  alt="Responsive image">
         <div class="card-body">
         <h5 class="card-title"><%=note.getTitle() %></h5>
         <p class="card-text"><%=note.getContent() %></p>
         <p class="text-primary"><b><%=note.getAddeddate() %></b></p>
         
         <div class="container text-center mx-2">
           <a href="DeleteServlet?note_id=<%=note.getId()%>"  class="btn btn-danger">Delete</a>
           <a href="Edit.jsp?note_id=<%=note.getId()%>" class="btn btn-primary">Update</a>
         </div>
       
         </div>
         </div>
         
     
      <% 
        }
        s.close();
      %>
      </div>
      </div>
   
 </div>
 
 

 
 
 
 
     
   </body>
</html>