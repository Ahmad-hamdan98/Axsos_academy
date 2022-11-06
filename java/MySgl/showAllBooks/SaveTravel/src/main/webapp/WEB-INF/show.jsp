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
<h1>Show Page</h1>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Amount</th>
            <th>vender</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="travel" items="${travel}">
    	<tr>
        <td> <c:out value="${travel.id}"></c:out></td>
        <td><a href="/books/${travel.id }"><c:out value="${travel.name}"></c:out></a> </td>
        <td><c:out value="${travel.amount}"></c:out></td>
        <td><c:out value="${travel.vender}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>