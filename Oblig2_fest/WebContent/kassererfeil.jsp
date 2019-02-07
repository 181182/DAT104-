<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kasserer Login</title>
</head>

<body>
<h2>Kasserer login</h2>
<form action="kasserer" method="post">
  <fieldset>
    <legend>Kasserer login</legend>
    <p>Passord: <input type="password" name="password"/>
    <font color="red">Feil passord</font></p>
    <p><input type="submit" value="Logg inn" /></p>
  </fieldset>
</form>

</body>
</html>