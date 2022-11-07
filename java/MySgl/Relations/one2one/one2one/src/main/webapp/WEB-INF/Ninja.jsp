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

<h1>Add new Ninja</h1>


<form:form action="/Newninja" method="post" modelAttribute="ninja">
   
    		
    <form:select path="dojo">
        <c:forEach var="OneDojo" items="${alldojo}">
            <form:option value="${OneDojo.id}" path="dojo">
                <c:out value="${OneDojo.name}"/>
            </form:option>
        </c:forEach>
    </form:select>
    
    
    
    <p>
        <form:label path="firstName">firstName</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">lastName</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">age</form:label>
        <form:errors path="age"/>
        <form:input type="number" path="age"/>
    </p>
     
     <input type="submit" value="Submit"/>
</form:form> 


</body>
</html>