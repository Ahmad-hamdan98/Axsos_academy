<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<h1>Customer Name : <c:out value="${dojoName1}"/></h1>
<h1>Item Name :<c:out value="${dojoName2}"/></h1>
<h1>Price :<c:out value="${dojoName3}"/></h1>

<h1>Description :<c:out value="${dojoName4}"/></h1>
<h1>Vender :<c:out value="${dojoName5}"/></h1>
</body>
</html>