<%-- 
    Document   : listDeparetemet
    Created on : 21 avr. 2021, 16:00:39
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

        <title>Deparetement Page</title>
    </head>
    <body>
        
          <div class="container">
        <div style="background-color: #55efc4;color: black; padding: 2%;">
            
            <a style="background-color: #55efc4;color: black; text-decoration: none; " href="/applicationPointage/jsp/formAddDept.jsp"> 
                <i class="fa fa-plus" aria-hidden="true"></i>
                <b>ajouter un deparetement </b>  
            </a>
             <a style="background-color: #55efc4;color: black; text-decoration: none;padding-left: 20%; " href="/applicationPointage/jsp/formAddEmp.jsp"> 
                <i class="fa fa-plus" aria-hidden="true"></i>
                <b>ajouter un employee</b>  
            </a>
            <a style="float: right; background-color: #55efc4;color: black; text-decoration: none; " href="/applicationPointage/jsp/pricipal.jsp"> 
                <i class="fa fa-arrow-left" aria-hidden="true"></i> 
                <b>retour a la page principal</b>
            </a>
        </div>
            <br>
            <div style="padding-left: 5%">
          <a  style="color: green;padding: 3%;font-size: 30px;
              " href="/applicationPointage/jsp/tableauxDept.jsp"><i class="fa fa-list" aria-hidden="true"  style="padding-right:  2%;"></i>afficher la list des deparetements :</a>
            <br><br>
          <a  style="color: green;padding: 3%;font-size: 30px;" href="/applicationPointage/jsp/tableauxEmp.jsp">
              <i class="fa fa-list" aria-hidden="true"  style="padding-right:  2%;"></i>
              afficher la list des employee :
          </a>
            <br><br>
            <a  style="color: green;padding: 3%;font-size: 30px;" href="/applicationPointage/jsp/listPointage.jsp">
              <i class="fa fa-list" aria-hidden="true"  style="padding-right:  2%;"></i>
              pointer sur les employes  :
            </a>
         </div>
            <br><br>
            <h2 style="text-decoration: underline"><i class="fa fa-search" aria-hidden="true"></i>   rechercher tout les employées :</h2>
            <br><br>
            
            
            <form action="/applicationPointage/rechercheParPrenom"  method="POST">
            Rechercher par prénom :                                     
            <input type="text" name="txtPrenom" style="margin-left: 3%;">
            <input id="id1" type="submit" name="reprenom" value="rechercher">   
            </form>
            
            
            
            <br><br> 
            
            
            <form action="/applicationPointage/rechercheParId" method="POST">
                
            <span style="margin-left: 3%;">
                Rechercher par id :</span>  
                <input type="text" name="txtId" style="margin-left: 3%;">
                <input  type="submit" name="reid" checked="faulse" value="rechercher">  
            
            
            </form>
            <br><br>
            <%
            if(session.getAttribute("idemp")!=null){
            %>
            
            <table class="table">  
    <thead class="thead-dark">
    <tr>
      <th scope="col">id</th>
      <th scope="col">nom</th>
      <th scope="col">prenom</th>
      <th scope="col">email</th>
     </tr>
  </thead>
  <tbody>
      
      <tr>
        
          <td><%=session.getAttribute("idemp") %></td>
      <td><%=session.getAttribute("nom") %></td>
      <td><%=session.getAttribute("prenom") %></td>
       <td><%=session.getAttribute("mail") %></td>
  

    </tr>
  </tbody>
            </table>
            
            <%
           }
            %>
            <br><br>
            <%
           if(request.getAttribute("noEmp")!=null){
            %>
            <h2 style="color: red"><%=request.getAttribute("noEmp") %></h2>
            
             <%
           }
            %>
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>  
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    </body>
</html>
