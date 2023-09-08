package com.coding.programs;

import java.util.Arrays;

public class ArraySoringCheck {

	/**
	 * 
	 * @return
	 */
	public static int checkIsArrayinAsendingOrder(int[] array,int index) {
		int retrunValue = -1;
		if((index+1) == array.length) {
			System.out.println("Calculation is completed");
			return -1;
		}
		System.out.println("Input :"+Arrays.toString(array));
		for(int i=0; i<array.length-1 ;i++) {
			if(!(array[i]<array[i+1])) {
				retrunValue = array[i+1];
				System.out.println("The array is not in sorting order and breaks at index : "+(i)+" value is "+array[i]);
				break;
			}
		}
		if(retrunValue==-1) {
			System.out.println("Its in sorted order ");
		}else {
			System.out.println("Its NOT in sorted order ");
		}
		return retrunValue;
	}
	
	private int swapNumber(int no) {
		String s_no=new StringBuffer(String.valueOf(no)).reverse().toString();
		return Integer.parseInt(s_no);
	}
	
	public static void main(String[] args) {
		int[] a1= {1,2,5,8,90};
		checkIsArrayinAsendingOrder(a1,0);
		int []a2= {100,2,15,8,90};
		 checkIsArrayinAsendingOrder(a2,0);
		
	}

}
