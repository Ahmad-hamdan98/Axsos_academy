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

border: 2px ,solid ,black;}

</style>
</head>
<body>
<h1>All Travels</h1>
<table border="2px" >
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Amount</th>
            <th>vender</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="travel" items="${travel1}">
    	<tr>
        <td> <c:out value="${travel.id}"></c:out></td>
        <td><c:out value="${travel.name}"></c:out> </td>
        <td><c:out value="${travel.amount}"></c:out></td>
        <td><c:out value="${travel.vender}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

  
<h1>New Book</h1>
<form:form action="/travel" method="post" modelAttribute="travel">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="amount">amount</form:label>
        <form:errors path="amount"/>
        <form:input type="number"  path="amount"/>
    </p>
    <p>
        <form:label path="vender">vender</form:label>
        <form:errors path="vender"/>     
        <form:input  path="vender"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    



</body>
</html>