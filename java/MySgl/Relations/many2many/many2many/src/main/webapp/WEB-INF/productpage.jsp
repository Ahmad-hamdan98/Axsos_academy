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
select{
width:600px;
margin-left: 20%;
}
h1{margin-left: 20%;
}
h2{margin-left: 20%;}
p{margin-left: 20%;}

</style>
</head>
<body>
<h1>${showproduct.name }</h1>
<a href="/">Home</a>
<hr>
<h2>Categories</h2>

<c:forEach var="pro" items="${showproduct.categories}">
	<p>${pro.name}</p>
</c:forEach>
<hr>

<form action="/cattopro/${showproduct.id}" method="post" >
  <select name="category">
        <c:forEach var="addcate" items="${allproduct}">
            <option value="${addcate.id}"  >
                <c:out value="${addcate.name}"/>
            </option>
        </c:forEach>
    </select>
      <input type="submit" value="Add"/>
</form> 
</body>
</html>