package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/my_First","root","root"); 
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("Select * from MY");
			while(rs.next())
			{
				out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			//statement method of executeupdate
			int result=smt.executeUpdate("insert into MY values(30,'Jayameena')");
			System.out.println(result+"rows affected");
			
			//result set method
			ResultSet res=smt.executeQuery("Select * from MY");
			res.absolute(2);
			out.println("Fetching the 1st row");
			out.println(res.getInt(1)+" "+res.getString(2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	

}
