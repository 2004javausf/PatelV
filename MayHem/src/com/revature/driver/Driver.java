package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Roll Tide");
		
		Human h = new Human();
		
		h.setName("Vee");
		h.setAge(34);
		h.setWeight(225);
		System.out.println(h.getName());
	}
}
