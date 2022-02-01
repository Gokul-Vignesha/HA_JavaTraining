package com.ha.student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Student creating object and initializing variables
		Student s1 = new Student("M1001","jack","jack@gmail.com",45.2);
		Student s2 = new Student("M1002","peter","peter@gmail.com",85.2);
		Student s3 = new Student("M1003","mark","mark@gmail.com",56.5);
	
		
		//setting values to SchoolName 
		Student.setSchoolName("Global School");
		
		// printing Student Details
		s1.printingStudentDetails();
		s2.printingStudentDetails();
		s3.printingStudentDetails();

		

	}

}
