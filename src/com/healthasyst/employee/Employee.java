package com.healthasyst.employee;

public class Employee {

	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public Employee( int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	
// STATIC METHOD	
//	public static void printingEmployeeDetails(Employee emp) {
//		System.out.println(" Employee : " + emp.empId + " - " + emp.empName + " getting salary of " 
//				+ emp.empSalary + " and working in "+ companyName +" Company. ");
//	}
	
	
	public void printingEmployeeDetails() {
		System.out.println(" Employee : " + empId + " - " + empName + " getting salary of " 
				+ empSalary + " and working in "+ companyName +" Company. ");
		System.out.println("\n ------------------------------------   \n");
	}
	
	// this -> this keyword is used to point current Address/Object. 
	
	
}
