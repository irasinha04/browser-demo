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
<p>Search about your favorite planet! </p>
Search here:
<input list="planets" name="query">
  	<datalist id="planets">
  	<option value="Mercury">Mercury</option>
  	<option value="Venus">Venus</option>
  	<option value="Earth">Earth</option>
  	<option value="Mars">Mars</option>
  	<option value="Jupiter">Jupiter</option>
  	<option value="Saturn">Saturn</option>
  	<option value="Uranus">Uranus</option>
  	<option value="Neptune">Neptune</option>
  	<option value="Pluto">Pluto</option>
</datalist>
<input type = "submit" value = "Go!" />
</form>
</body>
</html>