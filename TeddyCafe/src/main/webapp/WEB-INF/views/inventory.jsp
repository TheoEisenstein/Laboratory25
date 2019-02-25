<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory</title>
</head>
<body>
<h1>Please Display More Than Help</h1>
	<table class="table">
			<thead>
			<tr>
				<th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
			</tr>
			</thead>
			<tbody>
			<%-- c:forEach is loops through the items and repeats the content for each one.
			     Think of this as:   for (Food food : foods) { ... }
			--%>
			<c:forEach var="anything" items="${items}" >
			<!-- It calls the var . name below, not the $items -->
				<tr>
					<%-- Access properties of the java bean using simple . notation.
					     This actually calls the getters behind the scenes. --%>
					<td>${anything.name}</td><td>${anything.description}</td><td>${anything.quantity}</td><td>${anything.price}</td>
					
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>