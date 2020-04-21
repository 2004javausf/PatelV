package com.revature.beans;

import com.revature.classtypes.Hunt;

public class Human implements Hunt{

	private String name;
	private int age;
	private int weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void setWeight(int weight) {
		this.weight=weight;
	}

	@Override
	public void findPrey() {
		System.out.println("I ate vegetables");
	}
}
