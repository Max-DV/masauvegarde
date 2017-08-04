<%@page import="ServletConnexion.Constantes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='connexion2.html' method='post'>
		${message}
		<div>Prénom</div>
		<input type='text' name='<%= Constantes.NOM_PARAMETRE_NOM %>' />
		<div>Nom</div>
		<input type='text' name='<%= Constantes.NOM_PARAMETRE_PRENOM %>' />
	
		<button type='submit'>ok</button>
	</form>
</body>
</html>