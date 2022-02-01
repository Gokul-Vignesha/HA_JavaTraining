package com.healthasyst.datatype;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myName = "Gokul Vignesha";
		
		// Index always starts from "0"
		
		System.out.println(myName.charAt(4));  
		// returns the Char present the mentioned index
		
		System.out.println(myName.length());
		// returns length of the String
		
		
		// Calculating Radius of Circle
		int radius = 50;
		
		//Method 1:
		float result = (float) (3.14 * radius * radius);
		System.out.println(result);
		
		// proper datatype is double
		
		//Method 2:
		double areaOfCircle = Math.PI * Math.pow(radius, 2);   
		System.out.println("Area of Circle using Math Method = " + areaOfCircle );
		
	}

}
