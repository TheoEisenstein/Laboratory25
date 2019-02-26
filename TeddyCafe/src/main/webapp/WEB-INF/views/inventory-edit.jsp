<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory Edit</title>
</head>
<body>

<h5>What was wrong with this item?</h5>

<form action="/inventory-edit" method="post">
<input type="hidden" name="id" value="${inventory.id}" />

<table>

<tr>
	<td><label for ="name">Product Name: </label><input type="text"  pattern="[A-Z[a-z]*" name="name" value="${inventory.name }" required></td>
</tr>	

<tr>
	<td><label for ="description">Small Description: </label><input type="text" pattern="[A-Z][a-z]*" name="description" value="${inventory.description}"  required></td>
</tr>

<tr>
	<td><label for ="quantity">Quantity: </label><input type="number" name="quantity" value="${inventory.quantity }"  required></td>
</tr>

<tr>
	<td><label for ="price">Price:  $</label><input type="number" name="price" value="${inventory.price }"  required></td>
</tr>



</table>

	<button type="submit" >Itemize</button>



</form>

</body>
</html>