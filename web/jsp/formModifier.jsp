<%-- 
    Document   : formModifier
    Created on : 20 avr. 2021, 13:09:55
    Author     : khaoula ouifaya
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
       <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="/applicationPointage/css/styleModifier.css">
       
        <title>update employer</title>
          </head>
    <body>
    <form action="/applicationPointage/UpdateEmp?paraId<%=session.getAttribute("paraId") %>" method="post">
         <div class="myDiv1"> 
    <img src="/pffNetbeans/image/signin.png"  class="avatar">

    <br>
     <label class="lbl1"  > <b>nom:</b>    </label>
     <input type="text" class="input1" name="fieldNom" value= "<%=session.getAttribute("nom") %>"><br><br>
    
      <label    class="lbl1"> <b>prenom :</b>    </label>
      <input type="text"  class="input1" name="fieldPrenom" value="<%=session.getAttribute("prenom") %>"><br><br>
       
        <label    class="lbl1"> <b>email :</b>    </label>
        <input type="text"  class="input1" name="fieldEmail" value="<%=session.getAttribute("email") %>" ><br><br>
         <label    class="lbl1"> <b>mot de pass :</b>    </label>
      <input type="text"  class="input1" name="fieldMdp" value="<%=session.getAttribute("mdp") %>"><br><br>
         <label    class="lbl1"> <b>deparetement  :</b>    </label>
         <select class="input1" name="fieldDeparetement" >
             <option> <%=session.getAttribute("deparetement")%></option>
             <option>commerce</option>
             <option>informatique</option>
             <option>logistique</option>
         </select>
        
             <button  style="color: black ; text-decoration: none;" class="myBtn" > modifier  </button>
             <button   class="myBtn1" > <a style="color: black;text-decoration: none;" href="/applicationPointage/jsp/pricipal.jsp">annuler</a>  </button> 
             <div>  <button  style="margin-top: 4%;margin-left:25%;width: 170px;border-radius: 10px;border-color: red;border-style: solid; " class="myBtn1" > <a style="color: black;text-decoration: none;" href="/applicationPointage/removeEmp">supprimer mon compte</a>  </button> 
</div>
                 
        
      <br>
      <br>
     
      <br>
     
  </div>
      </form>
  
         
    </body>
</html>
