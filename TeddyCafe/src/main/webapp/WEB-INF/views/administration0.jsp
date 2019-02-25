<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration of Patrons</title>
</head>
<body>
<a href="/patrons-registration">Or Add a new Patron here.</a>
		<table class="table">
			<thead>
				<tr>
					<th>First Name</th><th>Last Name</th><th>On Email List</th><th>EDIT</th><th>DELETE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="anything" items="${ patrons }">
				<tr>
					<td>${ patrons.firstName }</td>
					<td>${ patrons.lastName }</td>
					<td>${ patrons.emailList }</td>
					<td><a href="/patron-edit">EDIT</a></td>
					<td><a href="/patron-delete?id=${patrons.id }">DELETE</a></td>
				
				</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>