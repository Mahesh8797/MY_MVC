package Filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	FilterConfig config;
	public void init(FilterConfig config) throws ServletException {  
	    this.config=config;  
	}  
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name=request.getParameter("name");
			
		String value=config.getInitParameter("name");
		PrintWriter out=response.getWriter();
		if(name.equals(value))	
		{
			out.println("Authentication success");
			chain.doFilter(request, response);
		}
		
		else
		{
			out.println("Authentication failed");
			RequestDispatcher rd=request.getRequestDispatcher("filter.html");
			rd.include(request, response);
		}
	}

	
}
