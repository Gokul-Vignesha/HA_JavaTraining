package com.healthasyst.shoppingcart;

public class CartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item i1 = new Item();
		Item i2 = new Item();
		
		i1.setDescription("Maggie");
		i2.setDescription("Kissan ketchup");
		
		i1.setQuantity(2);
		i2.setQuantity(1);
		
		System.out.println("Item : " +i1.getDescription() + "  Qty : " + i1.getQuantity() );
		System.out.println("Item : " +i2.getDescription() + "  Qty : " + i2.getQuantity() );
	}

}
