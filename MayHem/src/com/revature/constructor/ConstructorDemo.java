package com.revature.constructor;

public class ConstructorDemo extends D{

	public static void main(String[] args) {
		C c= new C();
		
	}

}

class A{
	static {System.out.println("A's static code block");}
	A(){
		System.out.println("Inside A's Constructor");
	}
	{System.out.println("A's instance code block");}
}

class B extends A{
	B(){
		System.out.println("Inside B's Constructor");
	}
}

class C extends B{
	static {System.out.println("C's static code block");}
	C(){
		System.out.println("Inside C's Constructor");
	}
}

class D{
	static {System.out.println("D's Static code block");}
	D(){
		System.out.println("Inside D's Constructor");
	}
}
