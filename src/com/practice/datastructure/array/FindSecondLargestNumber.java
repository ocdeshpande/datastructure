package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         Given an unsorted array, you need to find the second largest element
 *         in the array in o(n) time complexity.
 *
 */
public class FindSecondLargestNumber {

	public static void main(String[] arg) {

		Integer[] inputArry = { 15, 12, 13, 8, 90, 90, 0, 6 };
		int maxValue = 0, secondLargeNum = 0;
		for (int i : inputArry) {
			if (i > maxValue) {
				secondLargeNum = maxValue;
				maxValue = i;
			} else if (i > secondLargeNum && i != maxValue) {
				secondLargeNum = i;
			}
		}

		System.out.println("Max Value is :" + maxValue);
		System.out.println("Second Largest Value is :" + secondLargeNum);

	}
}
