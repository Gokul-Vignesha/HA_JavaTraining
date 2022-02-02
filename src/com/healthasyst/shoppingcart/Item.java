package com.healthasyst.shoppingcart;

public class Item {
	
	private int id;
	private String description;
	private int quantity;
	private double price;
	
	// setter for Description and Quantity
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
		
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	

}
