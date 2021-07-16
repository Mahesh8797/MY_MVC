package Beans;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user=new User();
		user.setName("MaheshwariDhana");
		HttpSession session=request.getSession();		
		session.setAttribute("user", user);
		RequestDispatcher rd=request.getRequestDispatcher("ExpLang.jsp");
		rd.forward(request, response);
	}

	

}
