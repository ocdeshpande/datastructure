package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         Given an array of 0’s and 1’s in random order , you need to separate
 *         0’s and 1’s in an array.
 */

/*
 * 
 * 
 * arr[] = {0,1,0,0,1,1,1,0,1} Array after separating odd and even numbers :
 * {0,0,0,0,1,1,1,1,1}
 */

public class Seperate0And1 {

	public static void main(String[] arg) {

		Integer[] inputArry = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		int countZero = 0, countOne = 0;

		for (int i : inputArry) {
			if (i == 0) {
				countZero++;
			} else if (i == 1) {
				countOne++;
			}

		}
		// Final Output array size
		int opArrSize = inputArry.length;
		// As array is 0 index based
		int count = opArrSize - 1;
		Integer[] opArry = new Integer[opArrSize];

		while (count >= 0) {
			if (count >= countOne - 1) {
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
