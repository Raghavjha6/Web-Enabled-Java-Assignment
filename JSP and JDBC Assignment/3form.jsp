<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Age Validation</title>
</head>
<body>
	<h2>Enter Your Details</h2>
    <form action="ageValidate.jsp" method="post">
        Name: <input type="text" name="username" required><br><br>
        Age: <input type="number" name="age" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>