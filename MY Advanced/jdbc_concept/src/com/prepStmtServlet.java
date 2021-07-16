package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

public class prepStmtServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_First","root","root");
			//insert single record
			PreparedStatement ps=con.prepareStatement("Insert into MH values(?,?,?)");
			ps.setInt(1, 100);
			ps.setString(2, "dhana");
			ps.setString(3, "father");
			
			int res=ps.executeUpdate();
			System.out.println(res +" records inserted");
			
			do
			{
			PreparedStatement pes=con.prepareStatement("Insert into MH values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter relation");
			String relation=sc.next();
			
			pes.setInt(1, id);
			pes.setString(2, name);
			pes.setString(3, relation);
			
			int re=pes.executeUpdate();
			System.out.println(re +" records inserted");
			
			System.out.println("do you want to add more y or n ?");
			String ans=sc.next();
			if(ans.equals("n"))
			{
				break;
			}
			}while(true);
			
			PreparedStatement pees=con.prepareStatement("Select * from MH");
			ResultSet r=pees.executeQuery();
			while(r.next())
			{
				out.println(r.getInt(1)+" "+r.getString(2)+ " "+r.getString(3));
			}
		
			ps=con.prepareStatement("Update MH set id=? where name=?");
			ps.setInt(1, 500);
			ps.setString(2, "dhana");
			
			int rs=ps.executeUpdate();
			System.out.println(rs +"records updated");
			PreparedStatement pprepes=con.prepareStatement("Select * from MH");
			ResultSet result=pprepes.executeQuery();
			while(result.next())
			{
				out.println(result.getInt(1)+" "+result.getString(2)+ " "+result.getString(3));
			}
			
		}
		
		catch(Exception e)
		{
			
		}
		
	}


}
