package com.practice.datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author deshpande_o
 *
 *         Given an Array of non negative Integers and a number. You need to
 *         print all the starting and ending indices of Subarrays having their
 *         sum equal to the given integer.
 */

/*
 * 
 * 
 * Input-int[] arr = {2, 3, 6, 4, 9, 0, 11}; int num = 9 Output- starting index
 * : 1, Ending index : 2 starting index : 5, Ending index : 5 starting index :
 * 5, Ending index : 6
 */

public class FindSubArrayWithSum {

	public static void main(String[] arg) {

		Integer[] inputArry = { 2, 3, 6, 4, 9, 0, 11, 9, 4, 5 };

		Map<Integer, Integer> ipMap = new HashMap<>();

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // reads int.

		for (int i = 0; i < inputArry.length; i++) {
			ipMap.put(i, inputArry[i]);
		}

		for (int i = 0; i < ipMap.size(); i++) {
			int key1 = i;
			int value = num - ipMap.get(i);
			if (value == 0) {
				System.out.println(i + "," + i);
			}
			if (ipMap.containsValue(value)) {
				getKey(ipMap, value).forEach(key -> {
					if (key > key1)
						System.out.println(key1 + "," + key);
				});
				;

			}

		}

	}

	private static List<Integer> getKey(Map<Integer, Integer> map, Integer value) {
		List<Integer> keyList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				keyList.add(entry.getKey());

			}
		}
		return keyList;
	}
}
