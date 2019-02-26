<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>With great items, comes great responsibility.</title>
</head>
<body>

<a href="/inventory-create">Or make a new item.</a>
	<table class="table">
			<thead>
			<tr>
				<th>Name</th><th>Description</th><th>Quantity</th><th>Price</th><th>EDIT</th><th>DELETE</th>
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
					<td>${anything.name}</td><td>${anything.description}</td><td>${anything.quantity}</td><td>${anything.price}</td><td><a href="/inventory-edit?id=${anything.id }">EDIT</a></td><td><a href="/inventory-delete?id=${anything.id }">DELETE</a></td>
					
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>