package com.ha.student;

public class Student {

	private String studentRollno ;
	private String studentName;
	private String studentMailid;
	private double studentPercentage;
	private static String schoolName;
	
	public Student(String StudentRollno, String studentName, String studentMailid, double studentPercentage) {
		
		this.studentRollno = StudentRollno;
		this.studentName = studentName;
		this.studentMailid = studentMailid;
		this.studentPercentage = studentPercentage;
		
	}
	
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public void printingStudentDetails() {
		System.out.println(this.studentRollno + " - " + this.studentName + " \n Student MailID : " + this.studentMailid);
		System.out.println("Student Percentage : " + this.studentPercentage);
		System.out.println(" School Name : " + Student.schoolName);
	}

	
}
