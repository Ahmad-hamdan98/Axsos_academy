<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h1{
margin-top :220px;
margin-left :320px;
}
#s{
color:blue;
margin-top :20px;
margin-left :320px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="action.js"></script>
</head>
<body>
<h1>welcome to Date page template</h1>
 <h2 id="s">the date :<c:out value="${date}"/></h2>
</body>
</html>