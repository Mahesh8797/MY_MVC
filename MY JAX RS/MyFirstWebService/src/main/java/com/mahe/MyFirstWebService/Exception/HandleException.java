package com.mahe.MyFirstWebService.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.mahe.MyFirstWebService.model.ErrorMessage;

@Provider
public class HandleException implements ExceptionMapper<DataNotFoundException> 
{

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage error=new ErrorMessage(ex.getMessage(),404,"org.error.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}

}
