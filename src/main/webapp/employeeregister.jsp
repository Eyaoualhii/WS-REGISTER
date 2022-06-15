<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WS REGISTER </title>
<style media="screen">
 *:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #080710;
}

.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}


h1{
color:#FFFFFF;
font-size: 32px;
    font-weight: 500;
    line-height: 42px;
    text-align: center;}
form{
    height: 520px;
    width: 400px;
    background-color: rgba(255,255,255,0.13);
    
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 60px 50px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #C0C0C0;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}


label{
color: #FFFFFF ;
    display: block;
    font-size: 15px;
    font-weight: 500;
}

input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}

::placeholder{
    color: #e5e5e5;
}

button{
    margin-top: 50px;
    width: 100%;
    background-color: #E67E22;
    color:#FFFFFF ;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
 
   </style>
</head>
<body>
 <div align="center">
  <h1>CREER UN COMPTE</h1>
  <form action="EmployeeServlet" method="post" >
  
     <label for="prenom">prenom</label>
    <input type="text" placeholder="Votre Prenom" id="prenom" name="prenom"/>
   
   <label for="nom">nom</label>
    <input type="text" placeholder="Votre Nom" id="nom" name="nom" />
   
    <label for="username">username</label>
    <input type="text" placeholder="Votre Username" id="username" name="username"/>
    
   
     <label for="Password">password</label>
     <input type="password" placeholder="Votre Mot de passe" id="password" name="password"/>
  
    
    <label for="address">address</label>
    <input type="text" placeholder="Votre addresse" id="address" name="address"/>
  
   <label for="contact">contact</label>
     <input type="text" placeholder="Votre contact" id="contact" name="contact"/>
   
 
  <button type="Submit" value="Enregistrer">Enregistrer</button>
  </form>
 </div>
</body>
</html>