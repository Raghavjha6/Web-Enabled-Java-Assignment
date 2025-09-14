<%@ page import="java.sql.*" %>
<%!
  public Connection getCon() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/db","root","root");
  }
%>