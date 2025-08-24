package sessionP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class VisitCounterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int visitCount = 0;
        // Read cookies from request
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                }
            }
        }
        // Increment visit count
        visitCount++;
        // Store updated value in cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(60 * 60 * 24); // 1 day
        response.addCookie(visitCookie);
        // Display message
        out.println("<html><body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h1 style='color:blue;'>Servlet Cookie Example</h1>");
        out.println("<h2>You have visited this page <span style='color:green;'>"+ visitCount + "</span> times.</h2>");
        out.println("</body></html>");
    }
}
