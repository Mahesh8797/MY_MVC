package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendRedirectServlet")
public class SendRedirectServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>I gonna redirect this to another servlet</p>"); //this will not be printed and will get redirected directly
		out.print("</html></body>");
		//response.sendRedirect("FirstServlet");
		response.sendRedirect("http://www.javatpoint.com");
	}

}
