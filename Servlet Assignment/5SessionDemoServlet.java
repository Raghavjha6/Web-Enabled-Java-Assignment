package sessionP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionDemo")
public class SessionDemoServlet extends HttpServlet  {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Get or create session
        HttpSession session = request.getSession(true);
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        String message;
        if (visitCount == null) {
            // First visit
            visitCount = 1;
            message = "Welcome! This is your <b>first visit</b>.";
        } else {
            // Returning visitor
            visitCount++;
            message = "Welcome back! You have visited <b>" + visitCount + "</b> times.";
        }
        // Save visitCount in session
        session.setAttribute("visitCount", visitCount);
        // HTML Output
        out.println("<html><body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h2 style='color:blue;'>Session Demo Servlet</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<p>Session ID: <b>" + session.getId() + "</b></p>");
        out.println("<form action='logout' method='post'>");
        out.println("<button type='submit'>Destroy Session</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
