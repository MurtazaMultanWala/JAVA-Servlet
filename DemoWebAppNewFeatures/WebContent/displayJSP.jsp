<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--	
	The problem is this writing java code inside JSP is designer
	face problem so the substitute of this is using expression 
	language just you need to write is the attribute key and it 
	will automatically fetch the value.
	
	<%= request.getAttribute("label") %> 
--%>

<!-- Expression Language Style -->
Hello ${label}

<!-- 
	Using Tags like <out> which is equivalent to printWriter object
	but the problem with this is HTML do not have this tag, so we need
	to add this by using directive tag (taglib).
 -->


</body>
</html>