package sessionP;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false); // get session if exists
        if (session != null) {
            session.invalidate(); // destroy session
        }
        response.setContentType("text/html");
        response.getWriter().println("<h2 style='color:red; text-align:center;'>Session destroyed. Please reload /sessionDemo to start again.</h2>");
    }

}
