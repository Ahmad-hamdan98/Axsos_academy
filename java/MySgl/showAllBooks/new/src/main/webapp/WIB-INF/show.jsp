<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
margin-left:60px; 
}
</style>
</head>
<body>
<h1><c:out value="${book.title}"></c:out></h1><br>


<h4>Book ID :<c:out value="${book.id}"></c:out></h4>
<h4>Book Description :<c:out value="${book.description}"></c:out></h4>
<h4>Book Language :<c:out value="${book.language}"></c:out></h4>
<h4>Number Of Pages :<c:out value="${book.numberOfPages}"></c:out></h4>
</body>
</html>