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

import edu.joshProjects.webapp.deliveryApp.Model.Order;
import edu.joshProjects.webapp.deliveryApp.Model.Profile;
import edu.joshProjects.webapp.deliveryApp.services.orderServices;

@Path("secure/users/{userId}/orders")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class OrderResource {
	
	orderServices os = new orderServices();
	
	@GET
	public Collection<Order> getAllOrders(@PathParam("userId") int userId){
		return os.getAllOrders(userId);
	}
	
	@GET
	@Path("/{orderId}")
	public Order getOrder(@PathParam("userId") int userId ,@PathParam("orderId") int orderId){
		return os.getOrder(userId, orderId);
	}
	
	@POST
	public Collection<Profile> addOrder(@PathParam("userId") int userId, Order order){
		return os.createOrder(userId, order);
	}
	
	@PUT
	@Path("/{orderId}")
	public Order changeOrder(@PathParam("userId") int userId, @PathParam("orderId") int orderId, Order order){
		return os.updateOrder(userId, orderId, order);
	}
	
	@DELETE
	@Path("/{orderId}")
	public Order deleteOrder(@PathParam("userId")int userId, @PathParam("orderId") int orderId){
		return os.removeOrder(userId, orderId);
	}

}
