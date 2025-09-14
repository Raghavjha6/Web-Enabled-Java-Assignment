<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
    response.setContentType("text/html");
    String uname = request.getParameter("username");
    String pass = request.getParameter("password");

    if (uname != null && pass != null) {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Database connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", "root", "root"
            );
            // SQL query with PreparedStatement (safe from SQL Injection)
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?"
            );
            ps.setString(1, uname);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                session.setAttribute("username", uname);  // store username in session
                RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                rd.forward(request, response);
            } else {
                out.println("<p style='color:red'>Invalid Username or Password!</p>");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            }
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red'>Error: " + e.getMessage() + "</p>");
        }
    } else {
        out.println("<p style='color:red'>Please enter Username and Password.</p>");
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.include(request, response);
    }
%>
</body>
</html>