package com.coding.programs;

import java.util.HashMap;
import java.util.Map;

//
public class GetNThRankElements {

	public static Integer getNthRankElement(int[] arr, int n) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		System.out.println("Map :"+map);
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 3, 3, 3 };
		System.out.println("getNthRankElement +"+getNthRankElement(array,3));
	}

}
