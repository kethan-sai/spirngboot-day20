<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
 href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

<meta charset="ISO-8859-1">
</head>
<body>
<header>
<h1>SpringBoot and JSP</h1>
</header>

<div class="starter-template">
	<h1>Users List</h1>
	
	<table class="table table-hover table-condensed table-bordered">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Book Name</th>
	<th>Status</th>
	</tr>
	<c:forEach var="user" items="${users}" >
	<tr> 
	<td>${user.id} </td>
	<td>${user.name }</td>
	<td>${user.bkName }</td>
	<td>${user.status }</td>
	</tr>
	</c:forEach>
	</table>
</div>

	<script type="text/javascript" src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>