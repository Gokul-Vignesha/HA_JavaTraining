package com.healthasyst.methodoverloading;

public class Calculator {

	public static void add(int a, int b) {
		System.out.println(" Result : " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println(" Result : " + (a + b + c));
	}

	public static void add(double a, int b) {
		System.out.println(" Result : " + (a + b));
	}

	public static double add(double a, double b) {
		return a+b;
	}
	
 }

