<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    String name = request.getParameter("username");
    String ageStr = request.getParameter("age");
    int age = 0;

    if (ageStr != null && !ageStr.isEmpty()) {
        age = Integer.parseInt(ageStr);
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation Result</title>
</head>
<body>
	<%
        if (age < 18) {
    %>
        <h2 style="color:red">Hello <%= name %>, you are not authorized to visit the site</h2>
    <%
        } else {
    %>
        <h2 style="color:green">Welcome <%= name %> to this site</h2>
    <%
        }
    %>
    <br>
    <a href="form.jsp">Go Back</a>
</body>
</html>