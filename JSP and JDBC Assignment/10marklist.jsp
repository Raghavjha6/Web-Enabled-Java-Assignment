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
    String regno = request.getParameter("regno");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");

        PreparedStatement ps = con.prepareStatement("SELECT * FROM marks WHERE regno=?");
        ps.setString(1, regno);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
%>
            <h2>Mark List for Register No: <%= regno %></h2>
            <table border="1" cellpadding="6">
                <tr><th>Subject</th><th>Marks</th></tr>
                <tr><td>Math</td><td><%= rs.getInt("math") %></td></tr>
                <tr><td>Java</td><td><%= rs.getInt("java") %></td></tr>
                <tr><td>DBMS</td><td><%= rs.getInt("dbms") %></td></tr>
            </table>
<%
        } else {
            out.println("<h3 style='color:red'>No records found for Register No: "+regno+"</h3>");
        }
        con.close();
    } catch(Exception e){
        out.println("Error: "+e.getMessage());
    }
%>
</body>
</html>