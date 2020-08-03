<%@page import="com.murtaza.web.model.AllienModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<% 
		AllienModel allienModel =  (AllienModel) request.getAttribute("allienModel");
		if(allienModel!=null){
			out.println("\nRecord Found!\n");
			out.println("<br/>");
			out.println("<br/>");
			
			out.println("Id:   " + allienModel.getId()); 
			out.println("<br/>");
			
			out.println("Name: " + allienModel.getName());
			out.println("<br/>");
			
			out.println("Tech: " + allienModel.getTech());
			out.println("<br/>");
		}
		else
			out.println("\nRecord Not Found!\n");
	%>
	
</body>
</html>