<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="errorPage.jsp"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= 5/0 %>
	<% pageContext.setAttribute("name", "Murtaza", pageContext.SESSION_SCOPE); %>
</body>
</html>