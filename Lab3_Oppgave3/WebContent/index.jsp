<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="theLocal" value="${localen}" scope="session" />
<fmt:setLocale value="${theLocal}" />
<fmt:setBundle basename="no.hvl.dat104.i18n.resources.mylabels" />


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form>
		<select id="language" name="language" onchange="submit()">
			<option value="en" ${language == 'en' ? 'selected' : ''}>English</option>
			<option value="nl" ${language == 'nl' ? 'selected' : ''}>Nederlands</option>
			<option value="es" ${language == 'es' ? 'selected' : ''}>Español</option>
		</select>
	</form>
	<form method="post" action="hilsegrei">
		<label for="username"><fmt:message key="login.label.username" />:</label>
		<p>Skriv inn ditt navn</p>
		<input type="text" id="username" name="username"> <br>
		<fmt:message key="login.button.submit" var="buttonValue" />
		<input type="submit" name="submit" value="${buttonValue}">
	</form>


</body>
</html>