

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
        <div style="background-color: #55efc4;color: black; padding: 2%;">
            
       
            
            <img src="/applicationPointage/image/signin.png" class="pic1">
            <p style="display: inline;font-weight: bold;" class="link1" ><%= session.getAttribute("nom") %></p>
            <a style="color: black ;text-decoration: underline;padding-left: 4px;" href="/applicationPointage/jsp/formModifier.jsp">
                <i class="fa fa-cog" aria-hidden="true"></i> <b> modifier le compte</b> 
            </a>
           
           
        
            <a style="float: right; background-color: #55efc4;color: black; text-decoration: none; " href="/applicationPointage/jsp/pricipal.jsp"> 
                <i class="fa fa-arrow-left" aria-hidden="true"></i> 
                <b>retour a la page principal</b>
            </a>
        </div>
            <br>
            <br>
             <%
            if(request.getAttribute("scc")!=null){
            
            %>
            <div class="alert alert-success">
      <%=request.getAttribute("scc") %>
           </div>
           <%
           
            }
            %> 
            <br>
            <h3  style="float: left;padding-right:42%;"> <i class="fa fa-check" aria-hidden="true"></i>la list des employee :</h3> 
            
            <div style="">
             <a style="color: green ;text-decoration: underline;font-family: cursive;font-size: 20px;" href="/applicationPointage/jsp/pointageDubut.jsp">
                 <i class="fa fa-calendar" aria-hidden="true"></i> <b>valider votre presence quotidien </b> 
            </a></div>
            <br><br>
           
            
     <table class="table">  
    <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">nom</th>
      <th scope="col">prenom</th>
     
       <th scope="col">email</th> 
       <th scope="col">deparetement</th>
     </tr>
  </thead>
  <tbody>
  
    <tr>
        <% 
             Connection con=utilConnection.seConnecter();
             Statement s=con.createStatement();
             ResultSet res=s.executeQuery("select distinct * from employee");
             while(res.next()){
            %>
            
      <th scope="row"><%=res.getInt(1)%></th>
      <td><%=res.getString(2)%></td>
      <td><%=res.getString(3)%></td>
       <td><%=res.getString(4)%></td>
      <td><%=res.getString(6)%></td>
    </tr>
  
  </tbody> 
  <% 
            }
  %>
</table>
          

 </div>
            
       
    </body>
</html>
