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
margin-left: 20%
}
h1{margin-left: 20%;
}
h2{margin-left: 20%;}
p{margin-left: 20%;}

</style>
</head>
<body>

<h1>${showcategory.name }</h1>
<a href="/">Home</a>
<hr>
<h2>Products</h2>

<c:forEach var="cate" items="${showcategory.products}">
	<p>${cate.name}</p>
</c:forEach>
 <hr>
 <form action="/protocat/${showcategory.id}" method="post" >
  <select name="product">
        <c:forEach var="addpro" items="${allcatgoreis}">
            <option value="${addpro.id}"  >
                <c:out value="${addpro.name}"/>
            </option>
        </c:forEach>
    </select>
      <input type="submit" value="Add"/>
</form>
</body>
</html>