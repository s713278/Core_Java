package com.coding.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FebanicSeries {

	/**
	 * <p>
	 * 
	 * </p>
	 * @param length
	 */
	public static void febanacciWithArray(int length) {
		int[] febanacciSeries=new int[length];
		febanacciSeries[0] = 1;
		febanacciSeries[1] = 2;
		for(int i=2 ;i<length ;i++) {
			febanacciSeries[i]=febanacciSeries[i-1]+febanacciSeries[i-2];
		}
		System.out.println("Febanacci Series ::"+Arrays.toString(febanacciSeries));
	}
	public static List<Integer> febenicSeries(int febLength){
		List<Integer> febanicSeries = new ArrayList<>();
		int prev =0;
		int next =1;
		
		int current = prev+next;
		
		if(febLength <=0) {
			return null;
		}else {
			for(int i=1 ; i<=febLength ; i++) {
				current = prev + next;
				prev=next;
				next= current;
				febanicSeries.add(current);
			}
			return febanicSeries;
		}
	}
	
	public static void febenicSeriesWithRecursive(int febLength){
		for(int i=1 ; i<=febLength ; i++) {
			System.out.print(febanacci(i)+" ");
		}
	}
	
	private  static int febanacci(int num){
		if(num <=1) {
			return 1;
		}else {
			return febanacci(num-1)+febanacci(num-2);
		}
	}
	public static void main(String[] args) {
		febenicSeriesWithRecursive(5);
		System.out.println();
		febenicSeriesWithRecursive(8);
	}

}
