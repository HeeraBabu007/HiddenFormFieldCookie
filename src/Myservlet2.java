

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myservlet2")
public class Myservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 response.setContentType("text/html");  
	     PrintWriter out = response.getWriter();  
	          
	      //Get the value of the hidden field  
	        String n=request.getParameter("uname");  
	        out.print("Hello "+n);  
	        out.close();  
		
	}

}
