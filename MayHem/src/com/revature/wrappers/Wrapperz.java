package com.revature.wrappers;

public class Wrapperz {
	/*
	 *  Character - char
	 *  Boolean - boolean
	 *  Short - short
	 *  Byte - byte
	 *  Integer - int
	 *  Long - long
	 *  Float - float
	 *  Double - double
	 */
	
	static int myInt = 3;
	static Integer myInteger = 5;
	static Double myDouble = 45.95;
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(addEmUp(myInt, myInteger));
		

	}

}
