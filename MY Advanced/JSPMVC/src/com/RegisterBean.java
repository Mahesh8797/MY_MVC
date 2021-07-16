package com;

public class RegisterBean 
{

	private String name;
	private String password;
	public RegisterBean()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	boolean validate()
	{
		if(password.equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
