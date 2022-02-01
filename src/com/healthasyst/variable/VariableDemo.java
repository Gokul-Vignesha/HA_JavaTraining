package com.healthasyst.variable;

public class VariableDemo {

	public static int aS = 10; // Static variable or class variable
	public static int bS = 100;
	
	public int aNS = 11; // nonStatic variable or instance variable
	public int bNS = 12;

	public static void main(String[] args) {

		VariableDemo.aS = 20;
		System.out.println(VariableDemo.aS);
		System.out.println(VariableDemo.bS);

		VariableDemo obj1 = new VariableDemo(); 
		// Memory will be allocated to Non Static Method/variable when creating object
		
		VariableDemo obj2 = new VariableDemo();
		
		
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);

		// multiple variable(like obj1/obj2) can be given for nonstatic variables
		// creating 2nd object
		
		
		obj2.bNS = 500;
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		
		VariableDemo obj3 = new VariableDemo();
		obj3.aNS = 150;
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
		
		System.out.println(obj2);  // it will print address of the object
		
		obj2=null;  // it will remove/reference the address of obj2 to null
		
		System.out.println(obj2); 
		
		obj2 = obj1;  //Now, obj2 is also pointing to address of obj1
		
		System.out.println(obj1); 
		System.out.println(obj2); 
		
		
	}

}
