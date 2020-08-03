<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Alien</title>
</head>
<body>
	<form action="addAllien" method="post">
		Id  : <input type="text" name="id"> <br>
		Name: <input type="text" name="name"> <br>
		Technology: <input type="text" name="tech"> <br>
		<input type="submit" value="Insert Record">
	</form>
</body>
</html>