package com.revature.control;

public class Loopyloop {
/* If statement
 * for decision making
 * providing multiple paths of execution
 * 
 * if(<conditional>){
 * 	<what to do if true>
 * 	} else if(<second conditional>){
 * 		<what to do if 2nd condition is true>
 * 	}else {
 * 		<what to do if false>
 * 	}
 * 	
 * Switch cases
 * provides multiple paths of execution based on some values
 * the switch is based on an integer numeric, string, char, boolean, or enum.
 *  	
 */
	static String color;
	public static void  whatColor(String color) {
		switch (color) {
		case "green" :
			System.out.println("Color is green");
			break;
		case "purple" :
			System.out.println("Color is purple");
			break;
		case "crimson" :
			System.out.println("Color is purple");
			break;
		default :
			System.out.println("you choose ... poorly");
		}
	}
	/* For Loops
	 * for(a;b;c){do something}
	 * a is variable declaration (counter)
	 * b is the condition that controls how far the loop will go
	 * c is incrementor/decrementor
	 */
	
	public static void forLoopFunness(int p) {
		for(int i=p; i>0; i--) {
			//break and continue
			if(i==10) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	/* Enhanced for loop or for each
	 * for (x:<Array or collection>) {do thing}
	 * good for moving through collection, array and other iterables
	 * more CPU efficient
	 * no issues w/ index out of bounds - not size dependent
	 * good for access elements in one collection
	 * bad for adding and removing
	 */
	static int [] myArray = {11,33,44,55,77,22,66,99};
	public static void forEachFun(int [] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	/* While loops
	 *  while (<condition>){<do something if true>}
	 *  
	 * do while
	 *  do {<do thing>} while(<condition>)
	 */
	
	public static void whileyWhile(int i) {
		while (i++<10) {
			System.out.println("Boring");
			//i++;
		}	
	}
	
	public static void doWhileyWhile(int i) {
		do {
			System.out.println("Boring");
			//i++;
		} while (i++<10);
	}
	
	public static void main(String[] args) {
		//whatColor("red");
		forLoopFunness(5);
	}
}

/* Conditionals
 * 	Logical Operators
 * 		< > <= >= != ==
 * OR
 * 	a|b - bit wise
 * 	a||b - short circuit OR IF a is true, returns true w/o b
 * AND
 * 	a & b - bit wise
 * 	a&&b checks boths and evaluate true if both are true
 * EQUALS
 * == compares values of primitives
 * compares reference for objects. NOT the contents
 * != is good for checking nulls
 * .equals()
 * method inherited object
 * All reference types have it
 * looking at content.
 * 
 */
