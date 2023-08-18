package com.java8.features;

interface StringOp{
	String method(String s);
}
public class LambdaExpression {

	
	public static void main(String[] args) {
		StringOp exclaim = (s) -> s+" !!";
		StringOp ask = (s) -> s+" ?";
		print("Have you ever see me  ",exclaim);
		print("How Are you ",ask);
	}

	public static void print(String str, StringOp op) {
		String result = op.method(str);
		System.out.println("Result \t:"+result);
	}
}
