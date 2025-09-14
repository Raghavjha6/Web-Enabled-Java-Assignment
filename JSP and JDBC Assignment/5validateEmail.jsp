<%
    String email = request.getParameter("email");
    boolean isValid = false;
    if (email != null) {
        int atPos = email.indexOf('@');
        int lastAtPos = email.lastIndexOf('@');
        // Rule 1: exactly one @
        if (atPos > 0 && atPos == lastAtPos) {
            int dotPos = email.indexOf('.', atPos + 1);
            // Rule 2: at least one dot after @
            if (dotPos > 0) {
                // Rule 3: at least 2 chars between @ and .
                if (dotPos - atPos - 1 >= 2) {
                    // Rule 4: at least 2 chars after last dot
                    int lastDot = email.lastIndexOf('.');
                    if (email.length() - lastDot - 1 >= 2) {
                        isValid = true;
                    }
                }
            }
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
<title>Email Validation Result</title>
</head>
<body>
	<h2>Email Validation Result</h2>
    <%
        if (isValid) {
    %>
        <p style="color:green">Valid Email: <%= email %></p>
    <%
        } else {
    %>
        <p style="color:red">Invalid Email: <%= email %></p>
    <%
        }
    %>
    <br>
    <a href="emailform.jsp">Go Back</a>	
</body>
</html>