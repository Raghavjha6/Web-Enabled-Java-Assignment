<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Intrinsic Objects Demo</title>
</head>
<body>
	<h2>JSP Intrinsic Objects Example</h2>
    <p><b>Request Method:</b> <%= request.getMethod() %></p>
    <p><b>Request URI:</b> <%= request.getRequestURI() %></p>
    <p><b>Session ID:</b> <%= session.getId() %></p>
    <p><b>Application Context Path:</b> <%= application.getContextPath() %></p>
    <p><b>Server Info:</b> <%= application.getServerInfo() %></p>
    <p><b>Current Date/Time:</b> <%= new Date() %></p>
</body>
</html>