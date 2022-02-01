package com.healthasyst.employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee.companyName ="HealthAsyst";
		
		 // Creating Object & Initializing values to non-static variable using Constructor
		Employee emp1 = new Employee(101,"John",6000); 
		Employee emp2 = new Employee(102,"Peter",4000);
		Employee emp3 = new Employee(103,"Mark",2000);
		
		
	/*	  Static method
		
		Employee.printingEmployeeDetails(emp1);
		Employee.printingEmployeeDetails(emp2);
		Employee.printingEmployeeDetails(emp3);
		
	*/	
		
		// Printing Employee Details
		emp1.printingEmployeeDetails();
		emp2.printingEmployeeDetails();
		emp3.printingEmployeeDetails();
		
		
		// For Creating Employee Array
		Employee[] employees = new Employee[3];
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		
	}

}
