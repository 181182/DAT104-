<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Oprett ny bruker</title>
</head>
<body>
	<h1>Oprett ny bruker:</h1>
	<legend>
		<form method="post" action="RegisterBrukerServlet">
			<p>
				Nick: <input type="text" name="nick" /> <font color="red">${feilmelding}</font>
			</p>
			<p>
				Klasse:<select name="klassekoder">
					<c:forEach items="${klassekoder}" var="emp">
						<option value="${emp}">${emp}</option>
					</c:forEach>
				</select>
			</p>

			<input type="submit" value="registrering" />
		</form>
	</legend>


</body>
</html>