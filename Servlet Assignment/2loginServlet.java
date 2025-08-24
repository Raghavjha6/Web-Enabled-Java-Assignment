package sessionP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)
	        throws IOException
	    {
	        String uname = req.getParameter("unm");
	        String pwd = req.getParameter("pw");
	        PrintWriter out = res.getWriter();
	        if(uname.equals("raghav") && pwd.equals("admin"))
	        {
	        	out.println("Login Done: " + "Hello "+uname); // Responding to the client
	        }
	        else
	        	out.println("Login Failed");        	
	        //System.out.println("The result is: " + k); // Debug screen/testing        
	        
	    }
}
