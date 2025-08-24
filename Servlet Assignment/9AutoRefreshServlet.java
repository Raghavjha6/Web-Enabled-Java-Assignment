package sessionP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/autorefresh")
public class AutoRefreshServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
       
        // Set content type
        response.setContentType("text/html");
        // Auto refresh after 5 seconds
        response.setHeader("Refresh", "1");
        // Output
        PrintWriter out = response.getWriter();
        Date currentTime = new Date();

        out.println("<html><body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h2 style='color:blue;'>Auto Refresh Example</h2>");
        out.println("<p>This page will refresh automatically every second.</p>");
        out.println("<h3>Current Time: " + currentTime.toString() + "</h3>");
        out.println("</body></html>");
    }
}