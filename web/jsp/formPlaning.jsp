<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="myP.utilConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <link rel="stylesheet" href="/applicationPointage/css/style.css">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
       <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <title>add employee Page</title>
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
        
        
       
       
 <p style="color: green ;font-family: cursive;font-size: 20px;padding: 2%; float: left" href="/applicationPointage/jsp/formPlaning.jsp">
     <i class="fa fa-calendar" aria-hidden="true"></i> voila c'est le planning monsuel:</p> 

           
            
     <table class="table">  
    <thead class="thead-dark">
    <tr>
      <th scope="col">jour</th>
      <th scope="col">heure debut</th>
      <th scope="col">heure fin</th>
     
       <th scope="col"> heure debut pause</th> 
       <th scope="col">heure fin pause</th>
     </tr>
  </thead>
  <tbody>
   <%
      GregorianCalendar cal = new GregorianCalendar();
     
    %>
    <tr>
        
      <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH));%></th>
      <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
  

    </tr>
   <tr>
        
      <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+1);%></th>
       <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
     <tr>
      <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+2);%></th>
       <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
    <tr>
      <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+3);%></th>
       <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
    <tr>
     <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+4);%></th>
       <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
     <tr>
     <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+5);%></th>
       <td>weekend</td>
      <td>weekend</td>
      <td>weekend</td>
       <td>weekend</td>
    </tr>
     <tr>
     <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+6);%></th>
       <td>weekend</td>
      <td>weekend</td>
      <td>weekend</td>
       <td>weekend</td>
    </tr>
      <tr>
     <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+7);%></th>
     <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
     <tr>
     <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+8);%></th>
    <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
     <tr>
     <th scope="row"> <% out.print(cal.get(Calendar.YEAR));%>/<% out.print(cal.get(Calendar.MONTH)+1);%>/<% out.print(cal.get(Calendar.DAY_OF_MONTH)+9);%></th>
      <td>08:30</td>
      <td>16:00</td>
      <td>12:30</td>
       <td>13:30</td>
    </tr>
  </tbody> 
  
</table>
          

 </div>
            
       
    </body>
</html>
