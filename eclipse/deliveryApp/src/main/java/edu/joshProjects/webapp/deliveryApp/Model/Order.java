package edu.joshProjects.webapp.deliveryApp.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	
	private int orderId;
	private int createdBy;
	private Date createdAt;
	private List<MenuItem> orderedItems = new ArrayList();
	private int totalPrice;
	
	public Order(){
		
	}

	public Order(int orderId, int createdBy) {
		//super();
		this.orderId = orderId;
		this.createdBy = createdBy;
		this.createdAt = new Date();
		this.totalPrice = 0;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<MenuItem> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(List<MenuItem> orderedItems) {
		this.orderedItems = orderedItems;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
