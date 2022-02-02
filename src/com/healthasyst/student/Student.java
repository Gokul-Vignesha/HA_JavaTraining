package com.healthasyst.student;

public class Student {

	private int studentRollno;
	private String studentName;
	private String studentMailid;
	private double studentPercentage;
	private static String schoolName;
	
	private static int counter =1001;
	
	public Student(String studentName, String studentMailid, double studentPercentage) {
		
		//this.studentRollno = StudentRollno;
		this.studentRollno = counter;
		this.studentName = studentName;
		this.studentPercentage = studentPercentage;
		counter++;
		if( studentMailid.contains("@")) {
			this.studentMailid = studentMailid;
		} else {
			System.out.println("Invalid EmailID");
		}
		
	}
	
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public void printingStudentDetails() {
		System.out.println(this.studentRollno + " - " + this.studentName + " \n Student MailID : " + this.studentMailid);
		System.out.println("Student Percentage : " + this.studentPercentage);
		System.out.println(" School Name : " + Student.schoolName);
	}
	
	
	public void setStudentPercentage(double studentPercentage) {
		if( studentPercentage >=0 && studentPercentage <=100 ) {
			this.studentPercentage = studentPercentage;
		} else {
			System.out.println(" Invalid Percentage! ");
		}
	}

	public double getStudentPercentage() {
		return this.studentPercentage;
	}
	
}
