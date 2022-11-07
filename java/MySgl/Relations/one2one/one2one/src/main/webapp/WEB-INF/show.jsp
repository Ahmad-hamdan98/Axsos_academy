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
<h1>Show </h1>
<table border="2px" >
    <thead>
        <tr>
          
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age </th>
          
        </tr>
    </thead>
    <tbody>
        <c:forEach var="ninja" items="${allninja.ninjas}">
    	<tr>
        <td> <c:out value="${ninja.firstName}"></c:out></td>
        <td><c:out value="${ninja.lastName}"></c:out></td>
        <td><c:out value="${ninja.age}"></c:out></td>
       
      
        
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>