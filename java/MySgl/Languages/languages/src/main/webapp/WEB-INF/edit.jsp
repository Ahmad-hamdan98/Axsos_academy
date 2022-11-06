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
<title>Insert title here</title>
<style >
h1{margin-left:200px }
h3{
margin-left: 1000px;
}
</style>
</head>
<body>


<h1>edit Language</h1>
<h3><a href="/">Dashboard</a></h3>
<form action="/delete/${travel.id}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">  
<form:form action="/update/${travel.id}" method="post"  modelAttribute="edit">
	<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" value="${travel.name}" />
    </p>
    <p>
        <form:label path="version">version</form:label>
        <form:errors path="version"/>
        <form:input type="version"  path="version"  value="${travel.version}"/>
    </p>
    <p>
        <form:label  path="creater">Creater</form:label>
        <form:errors path="creater"/>     
        <form:input  path="creater" value="${travel.creater}" />
    </p>    
    <input type="submit"  value="Submit"/>
</form:form>  


</body>
</html>