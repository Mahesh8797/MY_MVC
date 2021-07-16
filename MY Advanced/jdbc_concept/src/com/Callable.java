package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Callable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/third","root","root");
			/*CallableStatement cs=con.prepareCall("{call MAHE(?)}");
			cs.setInt(1, 30);
			cs.executeUpdate();
			System.out.println("Stored procedure called successfully!");
			cs.close();*/
			
			CallableStatement smt=con.prepareCall("{call EMP(?,?,?)}");
			smt.setInt(1, 1002);
			smt.setString(2, "Yoge");
			smt.setInt(3, 32);
			smt.executeUpdate();
			System.out.println("Stored procedure emp called successfully!");
			smt.close();
		}
		catch(Exception e)
		{
			
		}
	}

	

}
