package com.mahe.MyFirstWebService.database;

import java.util.HashMap;
import java.util.Map;

import com.mahe.MyFirstWebService.model.Message;
import com.mahe.MyFirstWebService.model.Profile;

public class DatabaseClass
{

	private static Map<Long, Message> message=new  HashMap<>();
	private static Map<String, Profile> profile=new HashMap<>();
	
	public static Map<Long, Message> getAllMessages()
	{
		return message;
	}
	public static Map<String, Profile> getAllProfiles()
	{
		return profile;
	}
}
