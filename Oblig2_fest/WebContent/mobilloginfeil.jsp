<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logg Inn</title>
</head>
<body>

<h2>Logg inn</h2>
<p>Det er kun registrerte deltagere som får se deltagerlisten.
Logg inn ved å gi mobil-nummeret ditt.</p>
<form action="mobillogin" method="post">
  <fieldset>
    <legend>Logg inn</legend>
    <p>Mobil: <input type="password" name="mobil"/><font color="red">Må tilhøre registrert deltager</font></p></p>
    <p><input type="submit" value="Logg inn" /></p>
  </fieldset>
</form>

</body>
</html>