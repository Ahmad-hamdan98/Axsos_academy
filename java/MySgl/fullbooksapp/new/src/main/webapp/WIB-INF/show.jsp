<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to books page</h1>
<h2>Book ID :<c:out value="${book.id}"></c:out></h2>
<h2>Book Title :<c:out value="${book.title}"></c:out></h2>
<h2>Book Description :<c:out value="${book.description}"></c:out></h2>
<h2>Book Language :<c:out value="${book.language}"></c:out></h2>
<h2>Number Of Pages :<c:out value="${book.numberOfPages}"></c:out></h2>
</body>
</html>