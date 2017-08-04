<%@page import="connexion.ChatRoomListe"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv='refresh' content='2'>
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>


	<c:forEach var="message" items="${messages}" >
		<div>
			Date: ${message.date}<br> Auteur: ${message.user.nom}
			${message.user.prenom}<br> Texte: ${message.texte}<br>
		</div>
	</c:forEach>
</body>
</html>