<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Ira's Browser</title>
</head>
<body>
<form action="/search" method = "GET">
<p> <font color = "red">${errorMessage} </font></p>
<p>Search about your favorite planet! Type below. </p>
Search here: <input type = "text" name = "query"/> <input type = "submit" value = "Go!" />
</form>
</body>
</html>