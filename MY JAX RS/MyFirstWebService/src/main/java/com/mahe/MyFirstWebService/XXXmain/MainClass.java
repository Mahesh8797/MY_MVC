package com.mahe.MyFirstWebService.XXXmain;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.eclipse.persistence.oxm.MediaType;

public class MainClass 
{

	public static void main(String args[])
	{
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8080/MyFirstWebService/webapi/messages");
		System.out.println(target.request().get(String.class)
			//target.request(MediaType.APPLICATION_JSON).get(String.class)
				);
	}
}
