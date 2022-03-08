<%-- 
    Document   : formLogin
    Created on : 19 avr. 2021, 17:33:35
    Author     : khaoula ouifaya
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="myP.utilConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/applicationPointage/css/styleLogin.css">
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
       
        <title>JSP Page</title>
    </head>
    <body class="mybody">
          <%if(request.getAttribute("msg")!=null){  %>
            
            <div  style="margin-left: 2%;margin-right:  2%;margin-top:4px;" class="alert alert-danger alert-dismissible"> 
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <strong> <i class="fa fa-check" aria-hidden="true"></i><%=request.getAttribute("msg") %></strong>
            </div>
            
            <%}%>
        <form action="/applicationPointage/AuthentificationAdmine"  method="post">
            
    <div class="myDiv1">
        <b style="padding-left: 14%">    bienvenue en espace admine</b>
    <img src="/pffNetbeans/image/signin.png"  class="avatar">
    <br>
     <label id="lbl1"  > <b>email:</b>    </label>
     <input type="text" id="input1" name="email"><br><br>
    
      <label    id="lbl2"> <b>password :</b>    </label>
      <input type="password"  id="input2" name="mdp"><br><br>
       
      
        
        <button   class="myBtn" >  connection </a></button>
       
        
        
      
      <br>
      <%if(request.getAttribute("msg")!=null){ %>
      <p style="color: red;padding-left: 30px">   <%=request.getAttribute("msg")%>   </p>
      <% } %>
      <br>
      
  </div>
       </form>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>  
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
   
    
    
    </body>
</html>
