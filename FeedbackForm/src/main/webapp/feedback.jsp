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
    
 <div  class="content_container py-4 d-flex flex-column justify-content-center align-items-center" >
  <h3 style="color:white" >Fill the Feedback Form</h3>
  <!--     form -->
  <form action="<%=application.getContextPath()%>/feedback" method="post"class="mt-3 text-white">
  <!--   email field -->
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input name="email" placeholder="Enter here!" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text text-white">We'll never share your email with anyone else.</div>
  </div>
  
  <!--   phone no. -->
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Phone number</label>
    <input  name="phonenumber" placeholder="Enter here!" type="text" class="form-control" id="exampleInputPassword1">
  </div>
  
  <!--  Your Feedback Message -->
  <div class="mb-3">
     <label class="form-check-label" for="exampleCheck1">Your Feedback Message</label>
    <textarea name="feedback" rows="10" cols="" class="form-control" placeholder="Enter here!"></textarea>
  </div>
  
  <!--  button -->
  <div class="container text-center">
    <button type="submit" class="btn btn-warning">Submit</button>
        <button type="submit" class="btn btn-light">Reset</button>
  </div>
  </form>
 </div>
    
  <%@include file="scripts.jsp"%>
  </body>
</html>