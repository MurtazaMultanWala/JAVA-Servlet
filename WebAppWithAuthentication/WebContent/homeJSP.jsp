<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		/* Deleting Secure Pages from Cache as soon its not authenticated or logout
		   so cannot return it using back button.*/
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
			
		/* Above line Works perfect in HTTP 1.1 version what if you have older than you
		   need to set one more attribute that is, */
		response.setHeader("Pragma", "no-cache"); // Http 1.0
			
		response.setHeader("Expires", "0"); // for proxies
	  	
		
		if(session.getAttribute("username")==null)
			response.sendRedirect("loginJSP.jsp");
	%>
	
	Welcome ${username}<br>
	<a href="videoJSP.jsp">Click here to view videos</a>
	
	<form action="logout" method="post">
		<input type="submit" value="logout"> 
	</form>
</body>
</html>