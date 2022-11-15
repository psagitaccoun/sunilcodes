<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="500">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Source</th>
<th>Email</th>
<th>Mobile</th>
</tr>
</table>


<c:forEach items="${list}" var="list">
    <table border="1" width="500">
    <tr>
<td><a href="leadInfo?=${list.id}">${list.firstName }</a></td>
<td>${list.lastName }</td>
<td>${list.source }</td>
<td>${list.email }</td>
<td>${list.mobile }</td>
</tr>
</table>
</c:forEach>
</body>
</html>