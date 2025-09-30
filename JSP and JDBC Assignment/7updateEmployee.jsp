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
    String id = request.getParameter("empid");
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String desg = request.getParameter("desg");
    String salary = request.getParameter("salary");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");

        PreparedStatement ps = con.prepareStatement(
            "UPDATE employee SET name=?, age=?, desg=?, salary=? WHERE empid=?"
        );
        ps.setString(1, name);
        ps.setInt(2, Integer.parseInt(age));
        ps.setString(3, desg);
        ps.setDouble(4, Double.parseDouble(salary));
        ps.setInt(5, Integer.parseInt(id));

        int i = ps.executeUpdate();
        if(i>0){
            out.println("<h3 style='color:green'>Updating Success</h3>");
        } else {
            out.println("<h3 style='color:red'>Updating Error</h3>");
        }
        con.close();
    } catch(Exception e){
        out.println("Error: "+e.getMessage());
    }
	%>
</body>
</html>