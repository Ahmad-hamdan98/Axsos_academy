<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    
   	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/style2.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <style >body{margin: 100px;}</style>
</head>
<body>
<h1>Edit Book</h1>
  <br>
	<form:form action="/edit/project/${project.id}" method="post" modelAttribute="project">
			<form:input type="hidden" path="user" value="${user.id }"/>
				<input type="hidden" name="_method" value="put">	
	<table>
			<tr>
				<td>
					<form:label path="title">title</form:label>
					<form:input path="title" class="form-control"/>
					<form:errors path="title" class="red"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="description">description</form:label>
					<form:input class="form-control" path="description"/>
					<form:errors path="description" class="red"/>

				</td>
			</tr>
			<tr>
				<td>
					<form:label  path="dueDate">Due Date</form:label>
					<form:input type="date" class="form-control" path="dueDate"/>
					<form:errors path="dueDate" class="red"/>

				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" class="btn btn-primary" value="Send">
				</td>
			</tr>

		</table>
		<br>
		<br>
		<form:form action="//dashboard">
			<button id="sd"  class="btn btn-dark">Cancel</button>
			</form:form>

</form:form>
</body>
</html>