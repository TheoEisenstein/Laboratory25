<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patron Edit</title>
</head>
<body>

<h5>Patron Edit</h5>

<form method="post">
<input type="hidden" name="id" value="${patrons.id}" />

<table>

<tr>
	<td><label for ="firstName">First Name: </label><input type="text"  pattern="[A-Z[a-z]*" name="firstName" value="${ patrons.firstname }" required></td>
</tr>	

<tr>
	<td><label for ="lastName">Last Name: </label><input type="text" pattern="[A-Z][a-z]*" name="lastName" value="${ patrons.lastname }"  required></td>
</tr>

<tr>
	<td><label for ="password">Password: </label><input type="password" name="password" value="${patrons.password }"  required></td>
</tr>

<tr>
	<td><label for ="favNumber">Favorite Number: </label><input type="number" name="favNumber" value="${patrons.favnumber }"  required></td>
</tr>

<tr>
	<td><label for ="emailList">Join Email List: </label><input type="radio" name="emailList" value="Yes" > Yes
														<input type="radio" name="emailList" value="No" > No<br>
</tr>
</table>

	<button type="submit" >Patron Fix</button>



</form>

</body>
</html>