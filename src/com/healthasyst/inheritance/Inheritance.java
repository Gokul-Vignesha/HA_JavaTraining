package com.healthasyst.inheritance;


class Parent {
	public int pAge =75;
	private String pName;
	
	public Parent(String pName) {
		this.pName = pName;
	}
	
	public void parentStyle() {
		System.out.println(" Parent Style!!!  ");
	}
}


class Child extends Parent {
	
	private String cName;
	
	public Child(String cName, String pName) {
		super(pName);
		this.cName =cName;
	}
}














public class Inheritance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
