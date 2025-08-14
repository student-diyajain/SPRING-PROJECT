<!doctype html>
<html lang="en">
 
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%@include file="all_js_css.jsp" %>
         <link  href="css/style.css" rel="stylesheet" >
    <title>Add Notes</title>
  </head>
  
  
  <body>
  
  
      <!-- navbar -->
     <div class="container">
      <%@include file="navbar.jsp" %>
     </div>
     
     <!-- form -->
     <div class="container">
       <h1>Add Note:</h1>
       
    <form action="ServletPage"   method="post">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input 
     required 
     name="TITLE"
     type="text" 
     class="form-control" 
     id="title" 
     aria-describedby="emailHelp" 
     placeholder="Enter here!">
  </div>
  <div class="form-group">
     <label for="content">Note Content</label>    
     <textarea 
     required
     class="form-control"
      name="CONTENT"
      id="title"   placeholder="Enter your context here!" style="height:300px;"></textarea>
  </div>
  <div  class="container text-center">
    <button type="submit" class="btn btn-primary btn-lg">Add</button>
  </div>

</form>   
    
  
  

     </div>
  </body>



</html>