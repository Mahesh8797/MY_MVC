package com.mahe.MyFirstWebService.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.mahe.MyFirstWebService.Exception.DataNotFoundException;
import com.mahe.MyFirstWebService.database.DatabaseClass;
import com.mahe.MyFirstWebService.model.Message;

public class MessageService 
{

	private Map<Long, Message> messages=DatabaseClass.getAllMessages();
	
	public MessageService()
	{
		messages.put(1L,new Message("mahe",1,"yoge"));
		messages.put(2L,new Message("yoge",2,"kand"));
		messages.put(3L,new Message("aarthi",3,"dhana"));
	}
	
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesForYear(int year)
	{
		List<Message> messageForYear =new ArrayList<>();
		Calendar cal=Calendar.getInstance();
		for(Message message: messages.values())
		{
			cal.setTime(message.getCreatedDate());
			if(cal.get(Calendar.YEAR)==year)
			{
				messageForYear.add(message);
			}
		}
		return messageForYear;
	}
	
	public List<Message> getAllMessageForPagination(int start, int size)
	{
		List<Message> list=new ArrayList<Message>(messages.values());
		return list.subList(start, start+size);
	}
	public Message getMessage(long id)
	{
		Message m=messages.get(id);
		if(m==null)
		{
			throw new DataNotFoundException("The id "+id +" is not found ");
		}
		return m;
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size() +1 );
		messages.put((long) message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message remove(long id)
	{
		return messages.remove(id);
	}
	
	
}
