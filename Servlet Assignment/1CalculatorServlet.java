package sessionP;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Get inputs
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String op = request.getParameter("operation");
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        double result = 0;
        // Perform operation
        if(op.equals("add")) {
            result = num1 + num2;
        } else if(op.equals("sub")) {
            result = num1 - num2;
        } else if(op.equals("mul")) {
            result = num1 * num2;
        } else if(op.equals("div")) {
            result = num1 / num2;
        }
        // Show result
        out.println("<html><body style='font-family:Arial; text-align:center; margin-top:50px;'>");
        out.println("<h2 style='color:green;'>Result</h2>");
        out.println("<h3>" + result + "</h3>");
        out.println("<a href='Calculator.html'>Back</a>");
        out.println("</body></html>");
    }
}
