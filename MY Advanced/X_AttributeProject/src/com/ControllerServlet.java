package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String location=request.getParameter("location");
		PrintWriter out=response.getWriter();
		
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		request.setAttribute("email", email);
		request.setAttribute("gender", gender);
		request.setAttribute("location", location);
		
		ServletConfig config=getServletConfig();
		String emailid=config.getInitParameter("email");
		if(email.equals(emailid))
		{
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		out.println(fname);
		out.println(lname);
		out.println(email);
		out.println(gender);
		out.println(location);
		rd.forward(request, response);
		}
		else
		{
			out.println("Email id is incorrect! Please login with correct credentials");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

	
}
