<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Bonjour, ${user.nom} ${user.prenom}
	<a href='index.html'>accueil</a>
	<form action='chatRoomListe.html'>
		<button type='submit'>chat</button>
	</form>
	<form action='deconnexion.html'>
		<button type='submit'>deconnexion</button>
	</form>
</body>
</html>