package edu.joshProjects.webapp.deliveryApp.services;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import edu.joshProjects.webapp.deliveryApp.Model.Order;
import edu.joshProjects.webapp.deliveryApp.Model.Profile;
import edu.joshProjects.webapp.deliveryApp.database.Database;

public class orderServices {
	
	private Map<Integer, Profile> profiles = Database.getUsers();
	
	public Collection<Order> getAllOrders(int userId){
		if(profiles.containsKey(userId)){
			return profiles.get(userId).getUserOrders().values();
		}
		else return null;
	}
	
	public Order getOrder(int userId, int orderId){
		if (profiles.containsKey(userId)){
			if (profiles.get(userId).getUserOrders().containsKey(orderId)){
				return profiles.get(userId).getUserOrders().get(orderId);
			}
			else return null;
		}
		else return null;
	}
	
	public Collection<Profile> createOrder(int userId, Order order){
		if(profiles.containsKey(userId)){
			Map<Integer, Order> userOrders = profiles.get(userId).getUserOrders();
			order.setOrderId(userOrders.size() + 1);
			order.setCreatedBy(userId);
			order.setCreatedAt(new Date());
			userOrders.put(order.getOrderId(), order);
			//profiles.get(userId).setUserOrders(userOrders);
			//return profiles.get(userId).getUserOrders().values();
			return profiles.values();
		}else return null;
	}
	
	public Order updateOrder(int userId, int orderId, Order order){
		if(profiles.containsKey(userId)){
			if(profiles.get(userId).getUserOrders().containsKey(orderId)){
				order.setOrderId(orderId);
				order.setCreatedBy(userId);
				order.setCreatedAt(new Date());
				return profiles.get(userId).getUserOrders().put(profiles.get(userId).getUserOrders().size(), order);
			}else return null;
		}else return null;
	}
	
	public Order removeOrder(int userId, int orderId){
		if(profiles.containsKey(userId)){
			if(profiles.get(userId).getUserOrders().containsKey(orderId)){
				return profiles.get(userId).getUserOrders().remove(orderId);
			}else return null;
		}else return null;
	}
}
