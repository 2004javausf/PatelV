package com.revature.generics;
/*
 * Generic
 * using a type as a parameter
 * write code that can handle different type of objects
 * use angle brackets <> to denote that something is a generic
 * allow us to ensure type safety
 * adds stability and re-usability to our code
 * placeholder (T,E,?,etc..) - use instead of an explicit type
 * collection is a good example of generic
 */

public class Gen1<T> {
	
	// Declare an object of type T
	T ob;
	
	//pass the constructor a reference to an object of type T
	Gen1(T o){
		ob=o;
	}
	
	//returns ob
	T getOb() {
		return ob;
	}
	
	//show the Type of T
	void showType() {
		System.out.println("Type of T is: "+ ob.getClass().getName());
	}
}

