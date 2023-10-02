package com.coding.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//Walmart
public class NumSeqSeriesTest {
	
	
	public static void getSeqNumbers(int[] numbers) {
	List<Set<Integer>> list=new ArrayList<>();
	Set<Integer> subList=null;
		//Iterate the array
			//get element +1 ==next element
				//yes: Capture the pair and add to list.
				
				//no: increment the array index
				int len = numbers.length;
				subList=new TreeSet<>();
				for (int i = 0; i < len-1; i++) {
					if(numbers[i]==numbers[i+1]-1) {
						subList.add(numbers[i]);
						subList.add(numbers[i+1]);
					}else {
						if(!subList.isEmpty()) {
							list.add(subList);
						}
						subList=null;
						subList=new TreeSet<>();
					}
				}
				
	//			list.stream().forEach(System.out::println);
		System.out.println("Final sub lists :"+list);
	}
	
	
	public static void main(String[] args) {
		int num2[]= {10,8,2,4,5,6,1,3,4,7,8,9,10,1,5 };
		System.out.println("Num2\t"+num2);
		getSeqNumbers(num2);

	}

}
