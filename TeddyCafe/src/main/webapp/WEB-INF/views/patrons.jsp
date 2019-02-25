 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Glorious List of Patrons</title>
</head>
<body>

<div class="container">
		<h1>Patrons of the Cafe</h1>
		<br>
		<table class="table">
			<thead>
				<tr>
					<th>First Name</th><th>Last Name</th><th>On Email List</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="anything" items="${ patrons }">
				<tr>
					<td>${ anything.firstName }</td>
					<td>${ anything.lastName }</td>
					<td>${ anything.emailList }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
</div>



</body>
</html>