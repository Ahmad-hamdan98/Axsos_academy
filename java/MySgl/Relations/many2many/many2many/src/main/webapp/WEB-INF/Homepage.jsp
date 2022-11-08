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
table{
width: 700px;
text-align: center;
margin-left: 30%;
}


</style>
</head>
<body>
<h1>Home </h1>
<br>
<br>
<br>
<br>
<h2><a href="/Newproduct">New Product </a></h2>
<h2><a href="/Newcategory">New Category </a></h2>
<hr>
<table border="2px" >
<tr>
<td><h2>Products</h2></td>
<td><h2>Categories</h2></td>

<tr>
<td>
<c:forEach var="pro" items="${prod}">
	<p><a href="/productpage/${pro.id}"><c:out value="${pro.name}">"${pro.name}"</c:out></a></p>
</c:forEach>
</td>
<td>
<c:forEach var="cat" items="${cate}">
	<p><a href="/categorypage/${cat.id}"><c:out value="${cat.name}">"${cat.name}"</c:out></a></p>
</c:forEach>
</td>
</tr>
</table>
</body>
</html>