package com.healthasyst.conditionsandloops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// For Each Loop
		//Syntax:-  for (index_type index_value: arrayName ) { ...  }
		
		
		//Basic For Each
		int[] numericArray= {10,65,87,65,25,33,49,58,79,66};
		
		for(int num: numericArray) {
			System.out.println(num);
		}
		
		
		//For Each for String
		String[] colors= {"red","green","yellow","blue"};
		for(String values: colors) {
			System.out.println(values);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
