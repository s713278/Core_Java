package com.coding.programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example#1
 * I/P: 1,4,6,8
 * O/P: 4,6,8,-1
 * 
 * 
 *  * Example#2
 * I/P: 2,5,3,1
 * O/P: 5,-1,-1,-1
 */
public class StreamReduceExample {
	
	public static void getOutput(List<Integer> numbers) {
		List<Integer> result= new ArrayList<>();
		int size= numbers.size();
		int currPntr=1;
		boolean match=false;
		for(int i=0;i<size;i++) {
			int fixedNum=numbers.get(i);
			match = false;
			for(int j=i+1;j<size;j++) {
				if(fixedNum<numbers.get(j)) {
					result.add(numbers.get(j));
					match = true;
					break;
				}
			}
			if(match==false) {
				result.add(-1);
			}
		}
		System.out.println("Result:"+result);
	}
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,6,8);
        List<Integer> numbers1=Arrays.asList(2,5,3,1);

        getOutput(numbers);
        getOutput(numbers1);
		/*
		 * // Example 1: Summing all elements in the stream Optional<Integer> sum =
		 * numbers.stream() .reduce((a, b) -> a * b);
		 * 
		 * if (sum.isPresent()) { System.out.println("Sum of elements: " + sum.get()); }
		 * else { System.out.println("The stream is empty."); }
		 * 
		 * // Example 2: Providing an initial value (identity) and using reduce int
		 * product = numbers.stream() .reduce(1, (a, b) -> a * b);
		 * 
		 * System.out.println("Product of elements: " + product);
		 */
    }
}
