<%@page import="java.util.List"%>
<%@page import="ServletConnexion.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="refresh" content="2">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>


	<ul>
		<c:forEach var="message" items="${messages}">
			<li>Date: ${message.date} <br> Auteur: ${message.user.prenom} ${message.user.nom}<br>
				Texte: ${message.texte} <br>
			</li>
		</c:forEach>
	</ul>

</body>
</html>