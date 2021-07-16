package com.mahe.MyFirstWebService.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

 
import com.mahe.MyFirstWebService.model.Message;
import com.mahe.MyFirstWebService.resources.subresource.CommentResource;
import com.mahe.MyFirstWebService.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(value={MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
public class MessageResource
{

	MessageService ms=new MessageService();
	
	@GET
	/*public List<Message> getMessage(@QueryParam("year") int year, 
			                        @QueryParam("start") int start,
			                        @QueryParam("size") int size)*/
	public List<Message> getMessage(@BeanParam BeanParamClass beanParam)
	{
		/*if(beanParam.getYear()>0)
		{
			return ms.getAllMessagesForYear(beanParam.getYear());
		}
		 if( beanParam.getStart() >=0 && beanParam.getSize()>=0)
		{
			return ms.getAllMessageForPagination( beanParam.getStart(), beanParam.getSize());
		}*/
		
		return ms.getAllMessages();
	}
	
	
	@GET
	@Path("/{messageId}")
	public Message getMess(@PathParam("messageId") long id, @Context UriInfo uriInfo)
	{
		Message message= ms.getMessage(id);	
		message.addLink(getUrlForSelf(uriInfo,message), "self");
		message.addLink(getUrlForProfile(uriInfo,message), "profile");
		message.addLink(getUrlForComments(uriInfo,message), "Comments");
		return message;		
	}
	
	private String getUrlForComments(UriInfo uriInfo, Message message) {
		
		String url=uriInfo.getBaseUriBuilder()
				.path(MessageResource.class)
				.path(MessageResource.class, "getResource")
				.path(CommentResource.class)
				.resolveTemplate("messageId", message.getId())
				.build().toString();
		 
		return url;
	}


	private String getUrlForProfile(UriInfo uriInfo, Message message) {
		String url=uriInfo.getBaseUriBuilder()
				.path(ProfileResource.class)
				.path(message.getAuthor())
				.build().toString();
		return url;
		
	}


	public String getUrlForSelf(UriInfo uriInfo,Message message)
	{
		String url=uriInfo.getBaseUriBuilder()
				.path(MessageResource.class)
				.path(Long.toString(message.getId()))
				.build().toString();
		return url;
	}
	
	/*@POST
	public Message addMessage(Message message)
	{
		return ms.addMessage(message);
	}*/
	
	@POST
	public Response addMessage(@Context UriInfo uriInfo,Message message)
	{
		Message mess=ms.addMessage(message);
		String id=String.valueOf(mess.getId());
		URI uri=uriInfo.getAbsolutePathBuilder().path(id).build();
		//return Response.status(Status.CREATED).entity(mess).build();		
		return Response.created(uri).entity(mess).build();
	}
	
	@PUT
	@Path("/{messageId}")
	public Message update(@PathParam("messageId") long id,Message message)
	{
		message.setId(id); 
		
		return ms.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public String delete(@PathParam("messageId") long id)
	{	
		 ms.remove(id);
		 return "deleted";
	}
	
	@Path("/{messageId}/comments")
	public CommentResource getResource()
	{
		return new CommentResource();
	}
}
