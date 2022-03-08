
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/applicationPointage/css/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
       <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
       <title>home Page</title>
    </head>

    <body>
        <div class="container">
          <nav class="navbar navbar-expand-lg navbar-light bg-info">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/applicationPointage/jsp/pricipal.jsp"> pointageEnligne  </a>
      
    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
      <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
        <li class="nav-item active">
            <a class="nav-link" href="/applicationPointage/jsp/pricipal.jsp"> HOME   <span class="sr-only">(current)</span></a>
        </li>
        <script>
            
        </script>
      </ul>
      <form class="form-inline my-2 my-lg-0" >
          <input class="form-control mr-sm-2" type="search" placeholder="rechercher" aria-label="Search" disabled="true">
        <button class="btn btn-outline-dark my-2 my-sm-0" type="submit">rechercher</button>
      </form>
       
    </div>
  </nav>
         
            <%if(request.getAttribute("msg")!=null){  %>

            <div  style="margin-left: 2%;margin-right:  2%;margin-top:  2%" class="alert alert-success alert-dismissible"> 
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <strong> <i class="fa fa-check" aria-hidden="true"></i><%=request.getAttribute("msg") %></strong>
            </div>

            <%}%>
            
        <div class="d1">
            <a href="/applicationPointage/jsp/formLoginAdmine.jsp" class="mya">  <b>espace administrateur </b>  </a>  
        </div>   
        
        <div class="di2">
            <a href="/applicationPointage/jsp/formLogin.jsp" class="mya"> <b>espace employer</b>  </a>  
        </div>
            <div  class="di5">
                <a href="formPlaning.jsp" class="mya"> <b>voir le planing des employee </b></a>
            </div>
 
            <div>
                <img src="/applicationPointage/image/mm.jpeg" class="mytof" >
            </div> 
             
       
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>  
    </div>
    </body>
</html>
