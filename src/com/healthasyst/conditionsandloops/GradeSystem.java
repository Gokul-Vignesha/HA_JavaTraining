package com.healthasyst.conditionsandloops;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 80;
		
		if(marks>=90) {
			System.out.println("Grade : A");
		}
		else if(marks < 90 && marks >= 80) {
			System.out.println("Grade : B");
		} 
		else if(marks < 80 && marks >= 60) {
			System.out.println("Grade : C");
		} 
		else {
			System.out.println("Grade : F");
		}
	}

}
