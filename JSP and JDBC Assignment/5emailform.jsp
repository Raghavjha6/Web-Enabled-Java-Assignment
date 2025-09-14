<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Validation</title>
</head>
<body>
	<h2>Email Validation</h2>
    <form action="validateEmail.jsp" method="post">
        Enter Email: <input type="text" name="email" required><br><br>
        <input type="submit" value="Check">
    </form>
</body>
</html>