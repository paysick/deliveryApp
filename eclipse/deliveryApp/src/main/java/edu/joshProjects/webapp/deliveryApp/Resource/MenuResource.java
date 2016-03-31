package edu.joshProjects.webapp.deliveryApp.Resource;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.joshProjects.webapp.deliveryApp.Model.MenuItem;
import edu.joshProjects.webapp.deliveryApp.services.MenuServices;

@Path("/menu")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class MenuResource {
	
	MenuServices ms = new MenuServices();
	
	@GET
	public Collection<MenuItem> getAll(){
		return ms.getMenu();
	}
}