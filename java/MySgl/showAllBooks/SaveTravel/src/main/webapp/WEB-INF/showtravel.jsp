<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
h1{margin-left:200px }
</style>
</head>
<body >
<h1>Show Travel</h1>
<hr>
<h1>Id :<c:out value="${shit.id }"></c:out></h1>
<h1>Name :<c:out value="${shit.name}"></c:out></h1>
<h1>Description :<c:out value="${shit.description }"></c:out></h1>
<h1> Amount :<c:out value="${shit.amount }"></c:out></h1>
<h1>Vender<c:out value="${shit.vender }"></c:out></h1>
<h3><a href="/">Go Back</a></h3>
</body>
</html>