<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patronized</title>
</head>
<body>

	<p>
	${ patrons.firstName }
	${ patrons.lastName }
	</p>

<h6>You are cool...Or it is just winter.</h6>


	
	<p>
	${ patrons.favNumber } is the luckiest number.
	</p>

	<h5>YOU HAVE BEEN PATRONIZED</h5>

</body>
</html>