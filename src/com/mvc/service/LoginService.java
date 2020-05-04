package com.mvc.service;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.Dao.LoginDaoImpl;
import com.mvc.model.LoginBean;

@Service
public class LoginService 
{
	@Autowired
	private LoginDaoImpl loginDaoImpl;
	
	@Transactional
	public String getAlldetails(LoginBean loginBean)	
	{		
		
		/*loginBean.setFname(fname);
		loginBean.setLname(lname);
		loginBean.setEmail(email);
		loginBean.setGender(gender);
		loginBean.setLname(lname);*/
			
		loginDaoImpl.insertdata(loginBean);
		
		return null;
		
	}
	
}
