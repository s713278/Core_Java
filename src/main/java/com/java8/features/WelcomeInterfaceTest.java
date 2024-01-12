package com.java8.features;



public class WelcomeInterfaceTest implements WelcomeInterface{


	/*
	 * @Override public int add(int a, int b) { return a+b; }
	 */
	public void welcome() {
		System.out.println("Welcome from subclass");
	}

	
	public static void main(String[] args) {
		WelcomeInterface obj= new WelcomeInterfaceTest();
		//System.out.println("Sum "+obj.add(12, 23));
		obj.welcome();
		
		WelcomeInterface m= ()->{ System.out.println("Welcome via Lamda");};
		m.welcome();
		
		WelcomeInterface m1= ()->{ System.out.println("Welcome without subclass ");};
		m1.welcome();
		
	}
}
