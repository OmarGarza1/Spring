<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="agregar.html" method="POST">
		<form:label path="nombre">Nombre</form:label>
		<form:input path="nombre"></form:input>

		<form:label path="apellido">Apellido</form:label>
		<form:input path="apellido"></form:input>

		<input type="submit" value="Saludar">

	</form:form>
</body>
</html>