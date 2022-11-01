<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style >
h1{text-align: center;}
.s{
border: 2px  solid  black;
margin-left:580px; 
width:30%;
}
.d{
padding: 10px;}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Send an Omikuji !</h1>

    <div class="s">
    <div class="d">
    
    <form action="/login" method="post">
     
        <label>Pick any number from 1 to 25</label><br>
        <input type="number" name="pick" min="1" max="25">     <br><br>
        
        <label>Enter the name of any city</label><br>
        <input type="text" name="city">     <br><br>
        <br>
        <label>Enter the name of any real person</label>     <br>
        <input type="text" name="person">     <br><br>
        
        <label>Enter the name of any hobby</label>     <br><br>
        <input type="text" name="living">     <br><br>
        
        <label>Enter the name of any living thing </label>     <br><br>
          
      <textarea name="mass" rows="5" cols="45"></textarea>  <br>     <br>
        <input type="submit"><br>   
          <br>
        <h3>Send it and show friend</h3>
    </form>
    </div>
    </div>
<!--   ...   -->



</body>
</html>