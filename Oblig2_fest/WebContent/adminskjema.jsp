<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Betalingsoversikt</title>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<h2>Betalingsoversikt</h2>

	<table border="1">
		<tr bgcolor="#cccccc">
			<th align="left">Navn</th>
			<th>Mobil</th>
			<th align="left">Betalingsstatus</th>
		</tr>
		<c:forEach items="${deltakere}" var="emp">

			<tr>
				<td><c:out value="${emp.fornavn}"></c:out> <c:out
						value="${emp.etternavn}"></c:out></td>
				<td><c:out value="${emp.mobil}"></c:out></td>

				<c:if test="${emp.betalingsstatus == true}">
					<td>Betaling mottat</td>
				</c:if>
				<c:if test="${emp.betalingsstatus == false}">
					<td>

						<form action="adminkontroll" method="post">

							<input type="submit" value="Registrer betaling" />

							<input type="hidden" name="nr" value="${emp.mobil}"> 


						</form>
					</td>

				</c:if>

			</tr>


		</c:forEach>

	</table>

	<p>
		<a href="kasserer.jsp">Ferdig</a>
	</p>
</body>
</html>