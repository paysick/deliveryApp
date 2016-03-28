package edu.joshProjects.webapp.deliveryApp.Model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Profile {
	
	private int userId;
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber;
	private Map<Integer, Order> userOrders = new HashMap<>();;
	
	public Profile(){
		
	}

	public Profile(int userId, String firstName, String lastName, String address, String contactNumber) {
		//super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	//@XmlTransient
	public Map<Integer, Order> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(Map<Integer, Order> userOrders) {
		this.userOrders = userOrders;
	}
	
	
	
	
}
