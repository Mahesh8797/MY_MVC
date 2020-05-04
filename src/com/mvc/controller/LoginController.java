package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.LoginBean;
import com.mvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public ModelAndView doClick()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("sample.jsp");
		return mav;
	}
	
	@RequestMapping("/login.do")
	public ModelAndView dologin()
	{
		ModelAndView mev=new ModelAndView();
		mev.setViewName("index.jsp");
		return mev;
	}
	
	@ModelAttribute("loginBean")
	public LoginBean justSimplyDo()
	{
		return new LoginBean();
	}
	
	@RequestMapping(value="/submit.do",method = RequestMethod.POST)
	public ModelAndView doSubmit( @ModelAttribute("loginBean") LoginBean loginBean )
	{
		
		String fname=loginBean.getFname();		
		System.out.println(fname);
		loginService.getAlldetails(loginBean);	
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success.jsp");
		mv.addObject("res", loginBean);
		return mv;
	}
	
	
}
