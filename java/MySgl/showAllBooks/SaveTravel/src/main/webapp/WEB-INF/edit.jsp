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
</head>
<body>


<h1>edit Travel</h1>
<form:form action="/update/${travel.id}" method="post"  modelAttribute="edit">
	<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" value="${travel.name}" />
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description" value="${travel.description}"/>
    </p>
    <p>
        <form:label path="amount">amount</form:label>
        <form:errors path="amount"/>
        <form:input type="number"  path="amount"  value="${travel.amount}"/>
    </p>
    <p>
        <form:label  path="vender">vender</form:label>
        <form:errors path="vender"/>     
        <form:input  path="vender" value="${travel.vender}" />
    </p>    
    <input type="submit"  value="Submit"/>
</form:form>    

</body>
</html>