package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         Given an array of integers, you need to segregate odd and even
 *         numbers in an array. Please note : Order of elements can be changed.
 */

/*
 * 
 * 
 * arr[] = {12, 17, 70, 15, 22, 65, 21, 90} Array after separating odd and even
 * numbers : {12, 90, 70, 22, 15, 65, 21, 17}
 */

public class SeperateOddAndEven {

	public static void main(String[] arg) {

		Integer[] inputArry = { 12, 17, 70, 15, 22, 65, 21, 90 };
		Integer[] opArry = new Integer[inputArry.length];

		int reverseOrder = inputArry.length - 1;
		for (int i = 0, j = 0; i < inputArry.length; i++, j++) {

			if (inputArry[i] % 2 == 0) {
				opArry[j] = inputArry[i];
			} else {
				opArry[reverseOrder] = inputArry[i];
				reverseOrder--;
				j--;
			}
		}

		for (int i : opArry) {
			System.out.println("Op Array is " + i);
		}

	}
}
