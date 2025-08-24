package sessionP;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class EmailRegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Get form values
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String lname = request.getParameter("lname");
        String login = request.getParameter("login");
        String pwd = request.getParameter("pwd");
        String cpwd = request.getParameter("cpwd");
        String location = request.getParameter("location");
        String edu = request.getParameter("edu");
        String phone = request.getParameter("phone");
        // Validation
        if(fname == null || fname.equals("") || lname == null || lname.equals("") ||
           login == null || login.equals("") || pwd == null || pwd.equals("") ||
           cpwd == null || cpwd.equals("")) {
            out.println("<h3 style='color:red;'>* Required fields cannot be empty!</h3>");
            return;
        }
        if(!fname.matches("[a-zA-Z]+") || (!mname.equals("") && !mname.matches("[a-zA-Z]+")) 
                || !lname.matches("[a-zA-Z]+")) {
            out.println("<h3 style='color:red;'>Name fields should contain only alphabets!</h3>");
            return;
        }
        if(!pwd.equals(cpwd)) {
            out.println("<h3 style='color:red;'>Passwords do not match!</h3>");
            return;
        }
        if(pwd.length() < 6 || !pwd.matches(".*[0-9].*") || !pwd.matches(".*[!@#$%^&*].*") || !pwd.matches(".*[a-zA-Z].*")) {
            out.println("<h3 style='color:red;'>Password must be at least 6 characters long, contain alphabets, one number, and one special character.</h3>");
            return;
        }
        // If everything is valid
        out.println("<html><body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h2 style='color:green;'>Registration Successful!</h2>");
        out.println("<p>Welcome, " + fname + " " + lname + " (" + login + ")</p>");
        if(location != null && !location.equals("")) out.println("<p>Location: " + location + "</p>");
        if(edu != null && !edu.equals("")) out.println("<p>Education: " + edu + "</p>");
        if(phone != null && !phone.equals("")) out.println("<p>Phone: " + phone + "</p>");
        out.println("</body></html>");
    }
}
