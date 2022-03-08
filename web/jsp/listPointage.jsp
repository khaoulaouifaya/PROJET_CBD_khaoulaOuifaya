<%-- 
    Document   : listPointage
    Created on : 27 avr. 2021, 15:48:50
    Author     : khaoula ouifaya
--%>

<%@page import="myP.utilConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
       <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
       
        <title>JSP Page</title>
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
       
      </ul>
     
       
    </div>
  </nav>
            <h3  style="padding: 1%;color: red;text-decoration: underline;"> <i class="fa fa-check" aria-hidden="true"></i>la présence quotidien : </h3>
        
         <table class="table">  
    <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">idemp</th>
       <th scope="col">nom employe</th>
      <th scope="col">date</th>
     <th scope="col">heur</th>
       <th scope="col">type</th> 
        <th scope="col">position</th>
       <th scope="col">message</th>
       <th scope="col">supprimer ce pointage</th>
       <th scope="col"> modifier ce ligne</th>
     </tr>
  </thead>
  <tbody>
  
    <tr>
        <% 
             Connection con=utilConnection.seConnecter();
             Statement s=con.createStatement();
             ResultSet res=s.executeQuery("select p.IDP, e.ID,e.NOM,p.DATEP,to_char(datep,'HH24:MI:SS'),p.typep,p.position,p.message from pointageempdebut p, employee e where p.idemp=e.id   order by p.DATEP  desc");
             while(res.next()){
            %>
      <th scope="row" name="myRow"><%=res.getInt(1)%></th>
      <td name=""><%=res.getInt(2)%></td>
       <td><%=res.getString(3)%></td>
      <td><%=res.getDate(4)%></td>
       <td><%=res.getString(5)%></td>
      <td><%=res.getString(6)%></td>
       <td><%=res.getString(7)%></td>
       <td><%=res.getString(8)%></td>
       <td><a href="/applicationPointage/deleteP?para1=<%=res.getInt(1)%>">supprimer</a></td>
       <td><a href="/applicationPointage/UpdateP?p1=<%=res.getInt(1)%>">modifier</a></td>
    </tr>
  
  </tbody> 
  <% 
             }
  %>
</table>
     </div>   
        
        
        
        
        
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>  
   
    </body>
</html>
