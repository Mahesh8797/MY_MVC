package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatchFW")
public class RequestDispatchFW extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>I am gonna forward the request</p>");
		out.print("</html></body>");
		RequestDispatcher rd=request.getRequestDispatcher("FirstServlet");
		//rd.forward(request, response);
		rd.include(request, response);
		
	}

}
