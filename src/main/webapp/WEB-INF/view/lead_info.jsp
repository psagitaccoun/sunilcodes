<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Details of single lead</h1>
<hr>
Id: ${lead.id } </br>
first name: ${lead.firstName }</br>
last name: ${lead.lastName }</br>
source: ${lead.source}</br>
email: ${lead.email}</br>
mobile: ${lead.mobile }</br>
</body>
</html>