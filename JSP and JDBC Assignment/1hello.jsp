<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    String user = request.getParameter("username");
    if (user != null && !user.isEmpty()) {
        session.setAttribute("username", user);
        session.setAttribute("startTime", System.currentTimeMillis());
    }
    String uname = (String) session.getAttribute("username");
    Long startTime = (Long) session.getAttribute("startTime");
    if (uname == null || startTime == null) {
        response.sendRedirect("index.jsp");
        return;
    }
    java.util.Date startDate = new java.util.Date(startTime);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Hello Page</title>
	<style>
        .top-right {
            position: absolute;
            right: 10px;
            top: 10px;}
    </style>
</head>
<body>
	<div class="top-right">
        Start Time: <%= startDate %>
    </div>
    <h2>Hello, <%= uname %> </h2>
    <form action="logout2.jsp" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>