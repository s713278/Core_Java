package com.coding.programs;

abstract class Test{
	static int j=10; 
	public static void test() {
		System.out.println("In parent abstract!!");
	}
}

public class ReverseString extends Test{

	public static String reverseString(String str) {
		
		StringBuffer buffer=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			buffer.append(str.charAt(i));
		}
		return buffer.toString();
	}
	public static void main(String[] args) {
		System.out.println("Is Swamy Kunta Polyndrope ::"+"Swamy Kunta".equalsIgnoreCase(reverseString("Swamy Kunta")));
		System.out.println("Is Malayalam Polyndrope ::"+"Malayalam".equalsIgnoreCase(reverseString("Malayalam")));
		
		System.out.println("Result \t:"+Test.j);
		Test.test();
	}

}
