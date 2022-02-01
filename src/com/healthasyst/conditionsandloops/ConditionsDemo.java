package com.healthasyst.conditionsandloops;

public class ConditionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		There are two types of Conditions:
			1. If condition
			2. Switch

*
*/
			int value = 100;
			
			if (value > 10) {
				System.out.println("Value greater than 10 ");
			}
			else {
				System.out.println("Value less than or equal to 10");
			}
			
			String browserName = "chrome";
			
			//Method 1: 
			if ( browserName == "chrome" || browserName =="CHROME") {
				System.out.println("Using Chrome Browser");
			} else {
				System.out.println("Using some other Browser");
			}
		
	}

}
