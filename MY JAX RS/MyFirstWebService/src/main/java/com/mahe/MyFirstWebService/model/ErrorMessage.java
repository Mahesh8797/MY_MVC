package com.mahe.MyFirstWebService.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errorMessage;
	private int statusCode;
	private String description;
	public ErrorMessage(String errorMessage, int statusCode, String description) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
		this.description = description;
	}
	public ErrorMessage()
	{
		
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
