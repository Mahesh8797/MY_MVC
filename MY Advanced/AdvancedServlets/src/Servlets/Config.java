package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Config
 */
@WebServlet("/Config")
public class Config extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>hellooooooooooo</p>");
		out.print("</html></body>");
		ServletConfig config=getServletConfig();
		String s1=config.getInitParameter("n1");
		String s2=config.getInitParameter("n2");
		out.println("n1 value is " +s1+ " and n2 is " +s2);
		
		ServletContext cont=getServletContext();
		String name=cont.getInitParameter("name");
		out.println("Welcome "+name);
	}
}
