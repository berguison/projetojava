<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Treinamento Spring Mvc - Edição de Albuns</title>
</head>
<body>
<c:url var="actionAdicionar" value="/albuns/adicionar"></c:url>
<form:form action="${actionAdicionar}" method="post" modelAttribute	="album">
	<label>Nome:</label>
		<form:input path="nome"/><br>
		<form:errors path="nome"></form:errors>
	<label>Ano de Lançamento:</label>
		<form:input path="anoLancamento"/><br>
		<form:errors path="anoLancamento"></form:errors>
<input type="submit" value="Adicionar" />

</form:form>
</body>
</html>