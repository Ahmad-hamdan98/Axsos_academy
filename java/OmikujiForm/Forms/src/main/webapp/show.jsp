<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style >
h2{
text-align: center;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
</head>
<body>

<h2>Here's Your Omikuji!</h2>

<div class="bg-primary w-25 h3 mx-auto border border-dark rounded p-3 mt-3">
<p>
In <c:out value="${pick}"></c:out> years, you will live in <c:out value="${city}"></c:out>
with <c:out value="${person}"></c:out> as your roommate, <c:out value="${hoppy}"></c:out>
for a living. The next time you see a <c:out value="${living}"></c:out>, you will have good luck.
Also, <c:out value="${mass}"></c:out>
</p>
</div>

<h2><a href="/">Go back</a></h2>

</body>
</html>