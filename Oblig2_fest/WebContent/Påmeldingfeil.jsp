<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>
<body>
	<h2>Påmelding</h2>
	<form action="pomelding">
		<fieldset>
			<legend>Personlige data</legend>



			<c:choose>
				<c:when test="${fornavn.equals('')}">
					<p>
						Fornavn: <input type="text" name="fornavn" /> <font color="red">Kan
							ikke være tomt</font>
					</p>
				</c:when>
				<c:otherwise>
					<p>
						Fornavn: <input type="text" name="fornavn" value="${fornavn}" />
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${etternavn.equals('')}">
					<p>
						Etternavn: <input type="text" name="fornavn" /> <font color="red">Kan
							ikke være tomt</font>
					</p>
				</c:when>
				<c:otherwise>
					<p>
						Etternavn: <input type="text" name="fornavn" value="${etternavn}" />
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${mobil.equals('ERROR1')}">
					<p>
						Mobil (8 siffer): <input type="text" name="mobil" value="" /><font
							color="red">Dette nummeret finnes</font>
					</p>
				</c:when>

				<c:when test="${mobil.equals('0')}">
					<p>
						Mobil (8 siffer): <input type="text" name="mobil" value="" /> <font
							color="red">Må være 8 siffer</font>
					</p>
				</c:when>
				<c:otherwise>
					<p>
						Mobil (8 siffer): <input type="text" name="mobil" value="${mobil}" />
					</p>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${kjonn.equals('')}">
					<p>
						Kjønn: <input type="radio" name="kjonn" value="mann" />mann <input
							type="radio" name="kjonn" value="kvinne" />kvinne <font
							color="red">Må velge kjønn</font>
					</p>


				</c:when>
				<c:otherwise>
					<p>
						Kjønn: <input type="radio" name="kjonn" value="mann" />mann <input
							type="radio" name="kjonn" value="kvinne" />kvinne
					</p>
				</c:otherwise>
			</c:choose>

			<p>
				<input type="submit" value="Meld meg på" />
			</p>


		</fieldset>
	</form>
</body>
</html>