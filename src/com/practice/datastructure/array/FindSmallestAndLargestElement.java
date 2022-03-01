package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         You are given an array of numbers. You need to find smallest and
 *         largest numbers in the array.
 *
 */
public class FindSmallestAndLargestElement {

	public static void main(String[] arg) {

		Integer[] inputArry = { 15, 12, 13, 8, 90, 75, 0, 6 };
		int maxValue = 0, minValue = 0;
		for (int i : inputArry) {
			if (i > maxValue) {
				maxValue = i;
			} else if (i < minValue) {
				minValue = i;
			}
		}

		System.out.println("Max Value is :" + maxValue);
		System.out.println("Min Value is :" + minValue);

	}
}
