package com.coding.interfaces;

public class SumInterfaceImpl implements SumInterface {

	@Override
	public Integer add(Integer a, Integer b) {
		return (a+b);
	}

	public static void main(String[] args) {
		SumInterface sumInterface = new SumInterfaceImpl();
		
		Integer result = sumInterface.add(10, 20);
		
		System.out.println("Result \t:"+result);
	}
}
