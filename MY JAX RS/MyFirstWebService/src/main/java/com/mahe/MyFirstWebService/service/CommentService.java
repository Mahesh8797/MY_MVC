package com.mahe.MyFirstWebService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mahe.MyFirstWebService.database.DatabaseClass;
import com.mahe.MyFirstWebService.model.Comment;
import com.mahe.MyFirstWebService.model.Message;

public class CommentService {
private Map<Long, Message> messages=DatabaseClass.getAllMessages();
	
	/*public CommentService()
	{
		messages.put(1L,new Message("mahe",1,"yoge"));
		messages.put(2L,new Message("yoge",2,"kand"));
		messages.put(3L,new Message("aarthi",3,"dhana"));
	}
	*/
	
	public List<Comment> getAllcomments(long messageId)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	
	public Comment getComment(long messageId, long comid)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		return comments.get(comid);
	}
	
	public Comment addComment(long messageId,Comment comment)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		comment.setId(comments.size() +1 );
		comments.put((long) comment.getId(), comment);
		return comment;
	}
	
	public Comment updateComment(long messageId,Comment comment)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		if(comment.getId()<=0)
		{
			return null;
		}
		comments.put(comment.getId(), comment);
		return comment;
	}
	
	public Comment remove(long messageId,long comid)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		return comments.remove(comid);
	}
	
}
