package com.coding.programs;

import java.util.Arrays;

public class RemoveElement {
	public static int[] removeElement(int[] nums, int val) {
		int[] newArray = new int[nums.length - 1];
		int counter = 0;
		for (int index = 0; index < nums.length; index++) {
			if (val != nums[index]) {
				newArray[counter] = nums[index];
				counter++;
			}else {
				System.out.println(" Match found at index no ::" + index);
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 9 };
		System.out.println("After removing:" + Arrays.toString(removeElement(arr, 5)));
		
		int arr1[] = { 1, 5, 7, 9 };
		System.out.println("After removing:" + Arrays.toString(removeElement(arr1, 1)));

		
		

	}
}