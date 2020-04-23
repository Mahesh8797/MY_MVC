package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controllerServlet")
public class controllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String location=request.getParameter("location");
	
		UserBean bean=new UserBean();
		bean.setFname(fname);
		bean.setLname(lname);
		bean.setEmail(email);
		bean.setGender(gender);
		bean.setLocation(location);
		request.setAttribute("bean", bean);
		
		ServletConfig config=getServletConfig();
		String emailid=config.getInitParameter("email");
		if(email.equals(emailid))
		{
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

}
