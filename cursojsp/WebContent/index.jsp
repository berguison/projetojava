<jsp:useBean id="calcula" class="br.com.beans.BeansCursoJsp" type="br.com.beans.BeansCursoJsp" scope="page"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<hr>
<br>
<p/>
<c:out value="Seja bem vindo"></c:out>
<form action="LoginSenha" method="post">
<p>Loguin:</p>
	<input id="login" name="login" type="text" value="admin" >
	<p>Senha:</p>
	<input id="senha" name="senha" type="text" value="admin"  >

	<br>
	
	<input type="submit" value="Eviar">
</form>
</body>
</html>