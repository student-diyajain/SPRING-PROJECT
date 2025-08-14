<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="links.jsp"%>
  </head>
  <body>
  <%@include file="header.jsp" %>
    
    <div style="height:80vh" class="content_container py-4 d-flex flex-column justify-content-center align-items-center" >
    <a href="<%= application.getContextPath() %>/feedback.jsp" class="btn btn-light  mt-2 ">GiveUs Feedback</a>
     <a href="<%= application.getContextPath() %>/Servlet1" class="btn btn-primary  mt-2 ">Servlet1</a>
      <a href="<%= application.getContextPath() %>/Servlet2" class="btn btn-primary  mt-2 ">Servlet2</a>
    </div>
    
    <%@include file="scripts.jsp"%>
  </body>
</html>