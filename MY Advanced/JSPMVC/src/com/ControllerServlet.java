package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		
		RegisterBean bean=new RegisterBean();
		bean.setName(name);
		bean.setPassword(pass);
		request.setAttribute("bean", bean);
		
		boolean status=bean.validate();
		if(status)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);			
		}
	}

	

}
