package com.mahe.MyFirstWebService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mahe.MyFirstWebService.database.DatabaseClass;
import com.mahe.MyFirstWebService.model.Message;
import com.mahe.MyFirstWebService.model.Profile;

public class ProfileService
{
private Map<String, Profile> profiles=DatabaseClass.getAllProfiles();
	
	public ProfileService()
	{
		profiles.put("Mahesh",new Profile(1,"MY","mahe","yoge"));
		profiles.put("Dhana",new Profile(2,"DK","dhana","kanni"));		
	}
	
	
	public List<Profile> getAllProfiles()
	{
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String name)
	{
		return profiles.get(name);
	}
	
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size() +1 );
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile)
	{
		if(profile.getProfileName().isEmpty())
		{
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile remove(String name)
	{
		return profiles.remove(name);
	}
	
	

}
