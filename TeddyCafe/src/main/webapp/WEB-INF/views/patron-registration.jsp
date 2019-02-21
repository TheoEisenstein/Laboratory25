<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patron Registration</title>
</head>
<body>

<h5>Becoming a Patron is easy!</h5>

<form action="/patron-registration-result">


<table>

<tr>
	<td><label for ="firstName">First Name: </label><input type="text" pattern="[A-Z[a-z]*" name="firstName" required></td>
</tr>	

<tr>
	<td><label for ="lastName">Last Name: </label><input type="text" pattern="[A-Z][a-z]*" name="lastName" required></td>
</tr>

<tr>
	<td><label for ="password">Password: </label><input type="password" name="password" required></td>
</tr>

<tr>
	<td><label for ="favNumber">Favorite Number: </label><input type="number" name="favNumber" required></td>
</tr>

<tr>
	<td><label for ="emailList">Join Email List: </label><input type="radio" name="emailList" value="Yes"> Yes
														<input type="radio" name="emailList" value="No"> No<br>
</tr>
</table>

	<button>Patronize Me</button>



</form>

</body>
</html>