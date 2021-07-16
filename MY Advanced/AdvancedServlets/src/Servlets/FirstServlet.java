package Servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException	
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>hellooooooooooo</p>");
		out.print("</html></body>");
	}
}