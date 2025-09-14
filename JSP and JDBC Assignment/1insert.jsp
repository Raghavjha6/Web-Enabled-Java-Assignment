<%@ include file="db.jsp" %>
<%
Connection c=getCon();
PreparedStatement ps=c.prepareStatement(
 "INSERT INTO students(name,email,course) VALUES(?,?,?)");
ps.setString(1,request.getParameter("name"));
ps.setString(2,request.getParameter("email"));
ps.setString(3,request.getParameter("course"));
ps.executeUpdate();
response.sendRedirect("list.jsp");
%>
