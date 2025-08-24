package sessionP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/datetime")
public class DateTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {       
        // Set response type
        response.setContentType("text/html");
        
        // Writer to send output to client
        PrintWriter out = response.getWriter();
        
        // Get current date and time
        Date currentDate = new Date();
        
        // HTML output
        out.println("<html>");
        out.println("<head><title>Current Date & Time</title></head>");
        out.println("<body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h1 style='color:green;'>Current Date and Time</h1>");
        out.println("<h2>" + currentDate.toString() + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
