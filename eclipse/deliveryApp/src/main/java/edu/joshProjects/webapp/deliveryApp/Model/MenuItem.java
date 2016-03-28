package edu.joshProjects.webapp.deliveryApp.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MenuItem {
	
	private String itemName;
	private int itemId;
	private int price;
	private int quantity;
	
	public MenuItem(){
		
	}

	public MenuItem(String itemName, int itemId, int price, int quantity) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
		this.price = price;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
