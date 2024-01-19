package com.coding.interfaces;

public class SumInrefaceWithLAmbda {

	public static void main(String[] args) {
		SumInterface interface1 = (a,b) -> a+b;
		
		Integer res = interface1.add(90, 90);
		System.out.println("Result \t:"+res);

	}

}
