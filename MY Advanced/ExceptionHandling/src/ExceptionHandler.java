

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionHandler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processError(request,response);		
	}
	static void processError(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Throwable throwable=(Throwable)request.getAttribute("javax.servlet.error.exception");
		Integer status_code=(Integer)request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestUri == null) {
			requestUri = "Unknown";
		}
		
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      out.write("<html><head><title>Exception/Error Details</title></head><body>");
	      if(status_code != 500){
	    	  out.write("<h3>Error Details</h3>");
	    	  out.write("<strong>Status Code</strong>:"+status_code+"<br>");
	    	  out.write("<strong>Requested URI</strong>:"+requestUri);
	}

	}
}
