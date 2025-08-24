package sessionP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HyperlinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get data from hyperlink (query string)
        String name = request.getParameter("name");

        out.println("<html><body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h2 style='color:green;'>Hello from Servlet!</h2>");
        out.println("<p>You clicked the link from HTML.</p>");
        out.println("<p>Received Name: <b>" + name + "</b></p>");
        out.println("</body></html>");
    }
}
