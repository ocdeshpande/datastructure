package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         Given an array containing zeroes, ones and twos only. Write a
 *         function to sort the given array in O(n) time complexity.
 */

/*
 * 
 * 
 * Input : [1, 2, 2, 0, 0, 1, 2, 2, 1] Output : [0, 0, 1, 1, 1, 2, 2, 2, 2]
 */

public class Seperate0And1And2 {

	public static void main(String[] arg) {

		Integer[] inputArry = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		int countZero = 0, countOne = 0, countTwo = 0;

		for (int i : inputArry) {
			if (i == 0) {
				countZero++;
			} else if (i == 1) {
				countOne++;
			} else if (i == 2) {
				countTwo++;
			}

		}
		// Final Output array size
		int opArrSize = inputArry.length;
		// As array is 0 index based
		int count = opArrSize - 1;
		Integer[] opArry = new Integer[opArrSize];

		while (count >= 0) {
			if (count >= countTwo - 1) {
				opArry[count] = 2;
			} else if (count >= countOne - 1) {
				opArry[count] = 1;
			} else {
				opArry[count] = 0;
			}
			count--;
		}

		for (int i : opArry) {
			System.out.println("Op Array is " + i);
		}

	}
}
