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
<h1>The main page</h1>




<table border="2px" >
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>version</th>
            <th>creater</th>
            <th>Actions</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="travel" items="${travel1}">
    	<tr>
        <td> <c:out value="${travel.id}"></c:out></td>
        <td><a href="/show/${travel.id}"><c:out value="${travel.name}"></c:out></a> </td>
        <td>$<c:out value="${travel.version}"></c:out></td>
        <td><c:out value="${travel.creater}"></c:out></td>
        <td><a href="/edit/${travel.id}"> Edit</a></td>
      
        <td>
        <form action="/delete/${travel.id}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
</form></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

  
<h1>Add Language</h1>
<form:form action="/travel" method="post" modelAttribute="travel">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
   
    <p>
        <form:label path="version">amount</form:label>
        <form:errors path="version"/>
        <form:input type="text"  path="version"/>
    </p>
    <p>
        <form:label path="creater">vender</form:label>
        <form:errors path="creater"/>     
        <form:input  path="creater"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    


</body>
</html>