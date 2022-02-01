package com.healthasyst.datatype;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer Array
		
		
		// Declaring Array :-  Once we create an array and initialized with default values
		// Method 1:
		int[] numbers = new int[5];  // 5 * 32 bits of memory
		
		// Method 2:
		int[] numericArray = {24,23,45,5,4,24,45};
		
		
		
		//		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers[3]);  //Print the value present in index 3
		
		System.out.println(numbers);   // it will print address of the numbers
		
		System.out.println(Arrays.toString(numbers));  // Covert the array to String prints the whole array
		
		
		
		
		// String Array
		
		String[] colors = new String[3];
		
		colors[0] = "Blue";
		colors[1] = "Red";
		
		System.out.println(Arrays.toString(colors));
		
	}

}
