

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <link rel="stylesheet" href="/applicationPointage/css/styleModifier.css">

                <title>ajouter employer</title>

    </head>
    <body>
      <form action="/applicationPointage/addEmp" method="post">
         <div class="myDiv1"> 
    <img src="/pffNetbeans/image/signin.png"  class="avatar">

    <br>
     <label class="lbl1"  > <b>nom:</b>    </label>
     <input type="text" class="input1" name="fieldNom" ><br><br>
    
      <label    class="lbl1"> <b>prenom :</b>    </label>
      <input type="text"  class="input1" name="fieldPrenom"  ><br><br>
       
        <label    class="lbl1"> <b>email :</b>    </label>
        <input type="text"  class="input1" name="fieldEmail"  ><br><br>
         <label    class="lbl1"> <b>mot de pass :</b>    </label>
      <input type="text"  class="input1" name="fieldMdp" ><br><br>
         <label    class="lbl1"> <b>deparetement  :</b>    </label>
         <select class="input1" name="fieldDeparetement" >
             <option> it</option>
             <option>commerce</option>
             <option>informatique</option>
             <option>logistique</option>
         </select>
        
         <button  style="color: black ; text-decoration: none; margin-left: 30%;margin-top: 10%; border-radius: 10px;" class="myBtn" > <b>ajouter </b>  </button>
</div>
                 
        
      <br>
      <br>
     
      <br>
     
  </div>
      </form>   
    </body>
</html>
