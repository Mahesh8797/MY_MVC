package URLRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstOne")
public class firstOne extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user");
		String password=request.getParameter("pass");
		out.println("printing user and pass "+ name+ " "+password);
		out.println("<a href='secondOne?uname="+name+"&pass="+password+"'>Go</a>");
		
	}

}
