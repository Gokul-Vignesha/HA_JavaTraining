package com.healthasyst.conditionsandloops;


public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		/*
		 * Iterative Statements
		 * 		a. For loop
		 *      b. For Each loop
		 *      c. While loop
		 *      d. Do-While loop
		 *      
		 *      break - it will stop the further iteration & exits the loop
		 *      Continue - it skips rest of statements & moves to next iteration
		 *      
		 *      
		 */
		
		
		// For Loop - Basic
		// syntax : for(initialize variable; condition; increment/decrement) {  .... }
		
		for (int i = 1; i<10; i++) {
			System.out.println(i);
		}
		
		
		
// For Loop for Array
		int[] numericArray= {10,65,87,65,25,33,49,58,79,66};
		
		for (int j = 0; j<numericArray.length ; j++) {
			System.out.print(numericArray[j] + " ");
			
		}
		
		

		
		
// Write a Code to Print Value less than or equal to 50 in numericArray
		for (int k = 0; k <numericArray.length ; k++) {
			if(numericArray[k] <=50) {
			System.out.print(numericArray[k] + " ");	
			}
		}
		
		System.out.println();
		
		
// Check value '87' is present in Array
		for (int k = 0; k <numericArray.length ; k++) {
			if(numericArray[k] == 87) {
			System.out.print(" value 87 is present in numericArray ");	
			break;
			}
		}

		
		
	}

}
