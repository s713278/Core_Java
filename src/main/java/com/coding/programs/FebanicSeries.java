package com.coding.programs;

import java.util.ArrayList;
import java.util.List;

public class FebanicSeries {

	public static List<Integer> febenicSeries(int febLength){
		List<Integer> febanicSeries = new ArrayList<>();
		int prev =0;
		int next =1;
		
		int now = prev+next;
		
		if(febLength <=0) {
			return null;
		}else {
			for(int i=1 ; i<=febLength ; i++) {
				now = prev + next;
				prev=next;
				next= now;
				febanicSeries.add(now);
			}
			return febanicSeries;
		}
	}
	
	
	public static List<Integer> febenicSeriesWithRecursive(int febLength){
		List<Integer> febanicSeries = new ArrayList<>();
		int prev =1;
		int next =1;
		
		int now = prev+next;
		
		if(febLength <=1) {
		}else {
			
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println("Febanic Series \t:"+febenicSeries(8));
	}

}
