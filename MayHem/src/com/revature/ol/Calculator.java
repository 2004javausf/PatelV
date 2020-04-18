package com.revature.ol;

public class Calculator {
	
	public static void main(String[] args) {
		add(3, 6);
		add(3.5, 5.4);
		add(4, 5, 6);
		
		
	}
	
	//Parametric Polymorphism
	
	static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	static double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
}
