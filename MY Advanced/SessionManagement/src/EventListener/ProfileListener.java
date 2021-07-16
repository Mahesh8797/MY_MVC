package EventListener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileListener extends HttpServlet {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
   {
	   ServletContext ctx=getServletContext();
	   PrintWriter out=res.getWriter();
	   res.setContentType("text/html");
	   String name=req.getParameter("name");
	   out.println(name);
	   int total=(Integer)ctx.getAttribute("totalUsers");
	   int count=(Integer)ctx.getAttribute("countUsers");	   
	   out.print(total+ " "+count);
   }

}

