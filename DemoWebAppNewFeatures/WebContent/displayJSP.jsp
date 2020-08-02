<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="custom" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  
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

<!-- Expression Language (EL) Style -->
<custom:out value="Using Expression Language to print passed Variable"></custom:out>
<br/>
Hello ${label} --> EL
<br/>
<br/>
<!-- 
	Using JSTL Tags like <out> which is equivalent to printWriter object
	but the problem with this is HTML do not have this tag, so we need
	to add this by using directive tag (taglib).
 -->
 
<custom:out value="Using Custom Tag in JSTL"></custom:out>

<br/>
<custom:out value="Hello World" ></custom:out>
<br/>
<br/>


<custom:out value="Printing All Students From Object Passed Using Custom tag ForEach Loop"></custom:out>
<br/>

<custom:forEach items="${StudentList}" var="student">
	${student}  <br/> 
</custom:forEach>
<br/>
<br/>

<!-- Fetching Data From the MySQL database -->
 
<custom:out value="Fetching Data From MySQL database"></custom:out>
<br/>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/servletdemo" user="root" password="murtaza123" />

<sql:query var="ResultSet" dataSource="${db}">select * from gadgets</sql:query>

<custom:forEach items="${ResultSet.rows}" var="Gadgetrow">
	<custom:out value="${Gadgetrow.id}"></custom:out> : 
	<custom:out value="${Gadgetrow.name}"></custom:out> : 
	<custom:out value="${Gadgetrow.price}"></custom:out><br/>
</custom:forEach>
<br/>
<br/>

<!-- Trying JSTL Functions -->
 
<custom:out value="Applying different functions on the following string"></custom:out>
<br/>
<br/>
<custom:set var="str" value="Murtaza Mustafa Multan Wala"></custom:set>
${str} 
<br/>
<br/>

<custom:out value="Length of the string is: "></custom:out>
${fn:length(str)} 
<br/>

<custom:out value="Uppercase string: "></custom:out>
${fn:toUpperCase(str)} 
<br/>

<custom:out value="Lowercase string: "></custom:out>
${fn:toLowerCase(str)} 
<br/>
<br/>

<custom:out value="Splitting the String On Space: "></custom:out>
<custom:forEach var="token" items="${fn:split(str, ' ')}">
	<br/>
	${token}
</custom:forEach>
</body>
</html>