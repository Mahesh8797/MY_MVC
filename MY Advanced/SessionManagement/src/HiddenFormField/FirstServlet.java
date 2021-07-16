package HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("name");
		out.print("printing input "+n);
		out.println("<form action='SecondServlet'>");
		out.println("<input type='hidden' name='uname' value="+n+">");
		out.println("<input type='submit' value='login'>");
		out.println("</form>");
	}

	

}
