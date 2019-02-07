<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Påmeldingsbekreftelse</title>
</head>
<body>
<h2>Påmeldingsbekreftelse</h2>
<p>Påmeldingen er mottatt for</p>
<p>&nbsp;&nbsp;&nbsp;<c:out value="${deltaker.fornavn}"/><br/>
&nbsp;&nbsp;&nbsp;<c:out value="${deltaker.etternavn}"/><br/>
&nbsp;&nbsp;&nbsp;<c:out value="${deltaker.mobil}"/><br/>
&nbsp;&nbsp;&nbsp;<c:out value="${deltaker.kjonn}"/></p>

<p><b>NB! Husk å betale til kassereren før festen!</b></p>
<a href="deltakerlist">Gå til deltagerlisten</a>
</body>
</html>