package SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */
@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Cookie ck[]=request.getCookies();
		out.print("value stored is : "+ck[0].getValue());
		out.println("Name of the cookie is : "+ck[0].getName());
		out.println("PAth of the cookie is : "+ck[0].getPath());
	}

}
