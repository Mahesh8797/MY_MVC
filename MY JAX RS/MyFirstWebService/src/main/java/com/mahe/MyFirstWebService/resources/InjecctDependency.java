package com.mahe.MyFirstWebService.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectDepend")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InjecctDependency 
{

	@GET
	@Path("/annotations")
	public String getOtherAnnotations(@MatrixParam("param") String value,
			                          @HeaderParam("HeaderValue") String header,
			                          @CookieParam("hello")String cookie)
	{
		return "Matrix param : "+value + " Header value is : "+header + " Cookie value : "+cookie;
	}
	
	@GET
	@Path("/context")
	public String ContextParam(@Context UriInfo uriInfo, @Context HttpHeaders headers)
	{
		String value=uriInfo.getAbsolutePath().toString();
		String header= headers.getHeaderString("HeaderValue");
				return "value : "+value + " header value : "+header;
				
		
	}
}
