<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home is where you make it.</title>
<link rel="stylesheet" type="text/css" href="/style.css" />
</head>
<body>

<h5>Welcome to Teddy Cafe</h5>

<a href="/patrons-registration">Register as a patron today!</a>
<br>
<a href="/patrons">List of glorious patrons.</a>

<br>
<br>

<a href="/administration">Power Page</a>

<br>
<br>
<a href="/inventory">Items Available</a>

<br>
<br>

<!-- This is will need to be deleted, don't use it. -->

<table class="table">
			<thead>
				<tr>
					<th>Item</th><th>Description</th><th>Quantity</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="anything" items="${ items }">
				<tr>
					<td>${ anything.name }</td>
					<td>${ anything.description }</td>
					<td>${ anything.quantity }</td>
					<td>${ anything.price }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

</body>
</html>