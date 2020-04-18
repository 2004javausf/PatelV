package com.revature.varargs;

public class FunWithVarArgs {

	/* Variable Length Arguments
	 * Method that will take a variable number of arguments
	 * Automates and hides the process of creating and saving the values in an array
	 * prior to invoking the method
	 * Vararg must be the last argument
	 * can be of any type
	 */
	
	public static void vaTest(int ... v) {
		System.out.print("Number of Args is : "+ v.length+ " Contents: ");
		for(int a:v) {
			System.out.print(a+" ");
		}
	}
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1,21,22,33,23,25,24,45,56,58,57,59,88,99,77);

	}

}
