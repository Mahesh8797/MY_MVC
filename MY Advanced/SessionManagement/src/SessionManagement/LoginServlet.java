package SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("link.html");
		rd.include(request, response);
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		out.println(name + " "+pass);
		if(name.equals("mahey"))
		{
		out.println("login is successful");
		Cookie ck=new Cookie("user",name);		
		response.addCookie(ck);
		}
		else
		{
			out.println("wrong login credentials");
			RequestDispatcher red=request.getRequestDispatcher("login.html");
			red.include(request, response);
		}
		
		
	}

	

}
