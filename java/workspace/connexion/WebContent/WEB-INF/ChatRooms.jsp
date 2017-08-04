<%@page import="ServletConnexion.ChatRoom"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<body>
	Sur quel chat voulez vous discutez? 
<% 
// List <ChatRoom>chat=request.getAttribute("salles");

 %>


<form action='deconnexion.html'>
		<button type='submit'>Deconnexion</button>

	</form>
<form action='ChatRooms.html'>
<button type='submit'>Ajouter chat</button></form>

</body>
</body>
</html>