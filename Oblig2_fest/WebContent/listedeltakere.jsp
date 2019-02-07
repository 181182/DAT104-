<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Deltagerliste</title>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<h2>Deltagerliste</h2>
	<table border="1">
		<tr bgcolor="#cccccc">
			<th>Kjønn</th>
			<th align="left">Navn</th>
		</tr>
		<c:forEach items="${deltakerliste}" var="emp">

			<c:if test="${emp.betalingsstatus == true}">
				<tr>
			</c:if>
			<c:if test="${emp.betalingsstatus == false}">
				<tr bgcolor="#ffaaaa">
			</c:if>

			<c:if test="${emp.kjonn.equals('mann')}">

				<td align="center">&#9794;</td>
				<td><c:out value="${emp.fornavn}"></c:out> <c:out
						value="${emp.etternavn}"></c:out></td>

			</c:if>
			<c:if test="${emp.kjonn.equals('kvinne')}">

				<td align="center">&#9792;</td>
				<td><c:out value="${emp.fornavn}"></c:out> <c:out
						value="${emp.etternavn}"></c:out></td>

			</c:if>
			</tr>
		</c:forEach>

	</table>
	<p>
		<a href="ferdig.jsp">Ferdig</a>
	</p>
</body>
</html>