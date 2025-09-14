<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.Cookie" %>
<%
    Cookie[] cookies = request.getCookies();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of cookies</title>
</head>
<body>
	<h2>Stored Cookies</h2>
    <%
        if (cookies != null && cookies.length > 0) {
    %>
        <table border="1" cellpadding="8">
            <tr>
                <th>Cookie Name</th>
                <th>Cookie Value</th>
            </tr>
            <%
                for (Cookie ck : cookies) {
            %>
                <tr>
                    <td><%= ck.getName() %></td>
                    <td><%= ck.getValue() %></td>
                </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p style="color:red">No cookies found in your browser!</p>
    <%
        }
    %>
    <br>
    <a href="index2.jsp">Back</a>
</body>
</html>