package com.mahe.MyFirstWebService.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mahe.MyFirstWebService.model.Profile;
import com.mahe.MyFirstWebService.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
ProfileService ps=new ProfileService();
	
	@GET
	public List<Profile> getProfile()
	{
		return ps.getAllProfiles();
	}
	
	
	@GET
	@Path("/{name}")
	public Profile getProfile(@PathParam("name")String name)
	{
		return ps.getProfile(name)  ;
	}         
	
	@POST
	public Profile addProfile(Profile profile)
	{
		return ps.addProfile(profile);
	}
	
	@PUT
	@Path("/{name}")
	public Profile update(@PathParam("name") String name,Profile profile)
	{
		profile.setProfileName(name);
		return ps.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{name}")
	public String delete(@PathParam("name") String name)
	{	
		ps.remove(name);
		 return "deleted";
	}

}
