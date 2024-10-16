<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista studenata</h1>
	<ul>
	<c:forEach var="s" items="${korisnici}">
		<li>${s.ime} ${s.prezime}</li>
	</c:forEach>
	</ul>
</body>
</html>