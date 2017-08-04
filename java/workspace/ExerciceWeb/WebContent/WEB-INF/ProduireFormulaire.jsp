<%@page import="connexion.Constante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${message}
	<form action='connexion.html' method='post'>
		Nom :<input type='text' name='<%=Constante.NOM_PARAMETRE_NOM%>' />
		Prénom :<input type='text'
			name='<%=Constante.PRENOM_PARAMETRE_PRENOM%>' />
		<button type='submit'>ok</button>
	</form>
</body>
</html>