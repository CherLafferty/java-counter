<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Page</title>
</head>
<body>
<h1>Counter Test</h1>
<p>
You have visited <a href="http://Localhost:8080/home">http://localhost8080/home</a> <c:out value="${count}"/>
</p>
<p>
<a href="http://Localhost:8080/home">Test another visit</a>
</p>
<p>
<a href="http://localhost:8080/home/reset">Reset Counter</a>
</p>
</body>
</html>