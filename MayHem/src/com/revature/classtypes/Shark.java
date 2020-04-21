package com.revature.classtypes;

public class Shark extends Fish implements Hunt{

	@Override
	public void swim() {
		
		System.out.println("I'm swimming underwater and I'm terrifying");
		
	}

	@Override
	public void breathe() {
		
		System.out.println("I breathe underwater, meeeeeeegh");
		
	}

	@Override
	public void findPrey() {

		System.out.println("I ate fishes!");
		
	}

}
