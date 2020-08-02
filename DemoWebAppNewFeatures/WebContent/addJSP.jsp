<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.Statement, java.util.Random, java.util.ArrayList"  %>
 
 <%-- <%@ include file="printJSP.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<!-- 
								Why JSP? The reason behind are:
1. When viewing page source their is no HTML what if programmer want to update something one way was to send
HTML tags in printWriter object but it can be too bogus for write each tag and closing tag also. 

2. It helps in writing Java code inside JSP (Java Server Page) which means java code inside HTML. Furthermore,
here we do not have to pay attention to Request, Response, printWriter objects the JSP itself take care for it.

3. JSP is by default converted in servlet on runtime but using this is easy for programmer as it provide objects
by default, also, returns a HTML page not only output. 

-->

<%-- 									Types of TAGS in JSP
1. Scriplet tag : <%  %>		logic you want to implement in service function
2. Declarative tag:  <%! %>		anything you want to be declared outside the service function
3. Expression tag: <%= %>  		all printing statements is written in this  block
4. Directive tag: <%@ %>   	used in importing packages
	i)		@page   : 	import some library, specify something for entire page, handle exception or not etc.
	ii)		@include:	include any other page in your page than we use this annotation
	iii)	@taglib :	use tags which are not provided by HTML like Spring tags etc. we use this annotation.
 --%>

<body bgcolor="pink"> 
	<% 	
		int firstNumber = Integer.parseInt(request.getParameter("num1"));
		int secondNumber = Integer.parseInt(request.getParameter("num2"));
		int addNumber = firstNumber + secondNumber;
		
		out.println("Sum is: "+ addNumber);
		out.println("Square is: "+ (addNumber * addNumber) );
	%>
</body>
</html>