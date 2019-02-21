<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home is where you make it.</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>

<h5>Welcome to Teddy Cafe</h5>

<a href="/patron-registration">Register as a patron today!</a>
<br>
<a href="/patrons">List of glorious patrons.</a>

<h5>Items Available</h5>

<table class="table">
			<thead>
				<tr>
					<th>Item</th><th>Description</th><th>Quality</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="anything" items="${ inventory }">
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