package com.mahe.MyFirstWebService.resources.subresource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.mahe.MyFirstWebService.model.Comment;
import com.mahe.MyFirstWebService.model.Message;
import com.mahe.MyFirstWebService.service.CommentService;

@Path("/")
public class CommentResource {
	

	CommentService cs=new CommentService();			

	@GET
	public List<Comment> getAllComments(@PathParam("messageId") long messageId)
	{		
		return cs.getAllcomments(messageId);
	}

	@GET
	@Path("/{commentId}")
	public Comment getComment(@PathParam("messageId")long messageId ,@PathParam("commentId") long commId)
	{
		return cs.getComment(messageId, commId);	
	}
	
	@POST
	public Comment addMessage(@PathParam("messageId")long messageId, Comment comment)
	{
		return cs.addComment(messageId, comment);
	}
	
	@PUT
	@Path("/{commentId}")
	public Comment update(@PathParam("messageId") long messageId,@PathParam("commentId") long commId,Comment comment)
	{
		comment.setId(commId); 
		return cs.updateComment(messageId, comment);
	}
	
	@DELETE
	@Path("/{commentId}")
	public String delete(@PathParam("messageId")long messageId,@PathParam("commentId") long commId)
	{	
		 cs.remove(messageId, commId);
		 return "deleted";
	}
	
	
	
}
