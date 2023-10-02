package com.coding.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Get the missing element from the unsorted array.
 */
public class SmallestPositiveInteger {
	
	public static void smallestPositiveInteger(List<Integer> list) {
		//Ascending Order
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		int missingPositiveNo = -1;
		int diff=0;
		System.out.println("Sorted List: "+sortedList);
		for(int i=0;i<sortedList.size()-1;i++) {
			diff = -sortedList.get(i)+sortedList.get(i+1);
			System.out.println("Diff\t:"+diff);
			if(diff>1) {
				System.out.println("Not sorted and list is broken at "+i+" th index and value is"+sortedList.get(i));
				missingPositiveNo = sortedList.get(i) +1;
				break;
			}
		}
		if(missingPositiveNo==-1) {
			missingPositiveNo = sortedList.get(sortedList.size()-1)+1;
		}
		
		System.out.println(" Missing positve integer is "+missingPositiveNo);
	}
	
	public static void main(String[] args) {
		smallestPositiveInteger(Arrays.asList(new Integer[]{1,3,2,4,6}));
		smallestPositiveInteger(Arrays.asList(new Integer[]{-1,0,2,1,4}));
		//smallestPositiveInteger(Arrays.asList(new Integer[]{1,2,3}));
	}

}
