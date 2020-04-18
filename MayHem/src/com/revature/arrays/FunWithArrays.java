package com.revature.arrays;

import java.util.*;


public class FunWithArrays {
	
	//group of like-typed variables that referred by a common name
	
	public static void main(String[] args) {
		//int array w/ 6 "buckets" from 0 to 5 index. 
		int [] myArray = new int[12];
		int [] chaos = {3,5,1,11,22,33,44,55,66,77,88,99};
		
		System.out.println(chaos[5]);
		
		for(int i=0; i<chaos.length; i++) {
			myArray[i]=chaos[i]*4;
			
		}
		for(int i:myArray) {
			System.out.println(i);
		}
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		
	}

}
