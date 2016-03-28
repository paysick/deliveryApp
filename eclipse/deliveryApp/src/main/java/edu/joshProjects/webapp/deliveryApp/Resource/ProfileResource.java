package edu.joshProjects.webapp.deliveryApp.Resource;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.joshProjects.webapp.deliveryApp.Model.Profile;
import edu.joshProjects.webapp.deliveryApp.services.ProfileServices;

@Path("/secure/users")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ProfileResource {

	private ProfileServices ps = new ProfileServices();
	
	@GET
	public Collection<Profile> getAll(){
		return ps.getAllProfiles();
	}
	
	@Path("/{userId}")
	@GET
	public Profile getProfile(@PathParam("userId") int userId){
		return ps.getProfile(userId);
	}
	
	@POST
	public Profile addProfile(Profile profile){
		return ps.createProfile(profile);
	}
	
	@PUT
	@Path("/{userId}")
	public Profile updateProfile(@PathParam("userId") int userId, Profile profile){
		return ps.updateProfile(userId, profile);
	}
	
	@DELETE
	@Path("/{userId}")
	public Profile updateProfile(@PathParam("userId") int userId){
		return ps.removeProfile(userId);
	}
	
//	@Path("/{userId}/orders")
//	public OrderResource getOrderResource(){
//		return new OrderResource();
//	}
	
}
