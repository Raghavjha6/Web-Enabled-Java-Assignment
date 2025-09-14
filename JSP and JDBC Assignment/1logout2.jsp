<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    String uname = (String) session.getAttribute("username");
    Long startTime = (Long) session.getAttribute("startTime");
    long duration = 0;

    if (startTime != null) {
        duration = (System.currentTimeMillis() - startTime) / 1000; // in seconds
    }

    session.invalidate();  // end session
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
	<h2>Thank You, <%= (uname != null ? uname : "User") %> </h2>
    <p>You used the application for <%= duration %> seconds.</p>
    <a href="index.jsp">Login Again</a>
</body>
</html>