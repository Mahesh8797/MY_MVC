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
import java.sql.*;

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
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/MVC","root","root"); 
			PreparedStatement ps=con.prepareStatement("Insert into MY values(?,?,?,?,?)");
			ps.setString(1,fname);
			ps.setString(2,lname);
			ps.setString(3,email);
			ps.setString(4,gender);
			ps.setString(5,location);
			int result=ps.executeUpdate();
			out.println(result +" records updated in the db"); 
			}
			catch(Exception e)
			{

			}
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.include(request, response);

		}
		else
		{
			out.println("forwarding ");
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

}
