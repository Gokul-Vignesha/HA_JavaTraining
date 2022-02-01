package com.healthasyst.oops;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(areaOfCircle(15));
		System.out.println(Area.areaOfTriangle(25,1));
		System.out.println(MethodDemo.areaOfTriangle(25,1));
		MethodDemo.printWelcomeMsg();
		
		System.out.println("pow methods powers the value : " + Math.pow(45, 3));
		
		System.out.println("random methods return any value between 0 to 1 : " + Math.random());
			
	}
	
	public static double areaOfCircle(int r) {
		return Math.PI * Math.pow(r,2);
	}

	
	public static double areaOfTriangle(double base,double height) {
		  return (base * height)/2 ;
	}
	
	
	public static void printWelcomeMsg() {
		System.out.println("Welcome, Printing from Method without argument & Return type");
	}
	
	
}
