package com.revature.collections;

import java.util.*;

public class MyDataSet {
	
	//collection Framework
	//List, Set, Queue All interfaces in Collection
	
	//Why?
	//Array object within Java is limited.
	//Mainly that the array is immutable and you are given not
	//many methods to work with.
	
	/*
	 * Called a framework (more library), provide interfaces and classes that allow
	 * developers to more easily manage a group of objects.
	 * 
	 * Advantages:
	 * 		Reduces effort (provide data structure and algorithms for you)
	 * 		Increase Performance
	 * 		Encourages software reuse
	 * 
	 * BUT!
	 * 		convert primitive values into object
	 * 		int -> Integer
	 * 		boolean -> Boolean
	 * 		byte -> Byte
	 * 
	 * 		The process of converting a primitive data type into its wrapper class is called Boxing
	 * 
	 */
	
	/*
	 * What is a SET???
	 * 		Does not allow duplicate objects
	 *		Does not in general guarantee insertion order
	 *		Sets are equal if they contain the same elements.
	 *
	 * HashSet:
	 * 		Maintains order, stores in hash table, best performance
	 * 
	 * LinkedHashSet:
	 *  	Maintains insertion order, weaker performance
	 * 
	 * TreeSet
	 * 		Maintains value order, very slow performance
	 */
	
	public static void main(String[] args) {
		
		Set<String> myFirstSet = new HashSet<String>();
		
		myFirstSet.add("Hello There");
		myFirstSet.add("Peter Pan");
		
		System.out.println(myFirstSet.add("Peter Pan"));
		System.out.println(myFirstSet);
		
		
		
	}
}
