package com;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MetaData_BatchExe extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_First","root","root");
		
		PreparedStatement smt=con.prepareStatement("Select * from MH");
		ResultSet rs=smt.executeQuery();
		ResultSetMetaData rm=rs.getMetaData();
		System.out.println("Number of colums "+rm.getColumnCount());
		System.out.println("Column name "+rm.getColumnName(2));
		System.out.println("Column type "+rm.getColumnTypeName(3));
			
		DatabaseMetaData db=con.getMetaData();
		System.out.println("Driver name " +db.getDriverName());
		System.out.println("Version "+db.getDriverVersion());
		
		Statement stmt=con.createStatement();
		stmt.addBatch("insert into MH values(600,'Kalp','sister')");
		stmt.addBatch("insert into MH values(700,'kanya','sister')");
		stmt.addBatch("insert into MH values(800,'Gayu','sister')");
		
		stmt.executeBatch();
			
		}
		
		
		catch(Exception e)
		{
			
		}
	}

	

}
