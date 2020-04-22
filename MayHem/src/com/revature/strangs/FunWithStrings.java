package com.revature.strangs;

public class FunWithStrings {
	/* Strings!
	 * not char or Character
	 * Fully qualified class name : java.lang.String
	 * String literal is 0+ characters ex "" or String a = "Roll Tide";
	 * concatenate Strings w/ + or .concat("something")
	 * "goodbye" + "earth"
	 * Strings are immutable
	 * String pool - collection of unique String literals in heap memory
	 * String API has utility methods!
	 */
	
	public static void main(String[] args) {
		
		String a = "Roll";		// this creates a new reference in string pool
		System.out.println(a.hashCode());
		a=a.concat(" Tide");	// this also create new reference in string pool
		System.out.println(a);
		System.out.println(a.hashCode());
		
		String b = "Roll";
		System.out.println(b.hashCode());
		
		/* String - String pool!, Immutable, thread safe (synchronized), fast 
		 * StringBuilder - no String pool, Mutable, not thread safe, fast
		 * StringBuffer - no String pool, Mutable, thread safe, slow 
		 */
		
		StringBuilder sb = new StringBuilder("Hey");
		System.out.println(sb.hashCode());
		StringBuffer bf = new StringBuffer("Hey");
		System.out.println(bf.hashCode());

	}

}
