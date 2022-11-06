<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
h1{margin-left:200px }
h3{
margin-left: 900px;
}
</style>
</head>
<body >
<h1>Show Language</h1>
<h3><a href="/">Dashboard</a></h3>
<hr>
<h1>Id :<c:out value="${shit.id }"></c:out></h1>
<h1>Name :<c:out value="${shit.name}"></c:out></h1>

<h1> version :<c:out value="${shit.version }"></c:out></h1>
<h1>creater<c:out value="${shit.creater }"></c:out></h1>
<h4><a href="/edit/${shit.id}">Edit</a>  </h4>


<form action="/delete/${shit.id}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
</body>
</html>