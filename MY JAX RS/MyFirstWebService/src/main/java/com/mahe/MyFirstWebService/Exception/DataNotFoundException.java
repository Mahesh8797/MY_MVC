package com.mahe.MyFirstWebService.Exception;

public class DataNotFoundException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String message) {
		super(message);
	}
	
}
