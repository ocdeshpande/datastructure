package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 * 
 *         How to check if array elements are consecutive.
 * 
 */

/*
 * 
 * 
 * Input: array[] = {5, 3, 4, 1, 2} Output: true As array contains consecutive
 * elements from 1 to 5 Input: array[] = {47, 43, 45, 44, 46} Output: true As
 * array contains consecutive elements from 43 to 47 Input: array[] = {6, 7, 5,
 * 6} Output: false As array does not contain consecutive elements.
 */

public class FindIfArrayIsConsecutive {

	public static void main(String[] arg) {

		Integer[] inputArry = { 5, 3, 4, 1, 2, 7, 6 };

		int diff = 0;
		boolean ifArrayConsecutive = true;

		// Find min value

		for (int i = 0; i < inputArry.length; i++) {
			for (int j = i + 1; j < inputArry.length; j++) {

				diff = Math.abs(inputArry[i] - inputArry[j]);

				if (diff >= inputArry.length) {
					ifArrayConsecutive = false;

				}
			}
		}
		if (ifArrayConsecutive)
			System.out.println("Array is consecutive");
		else
			System.out.println("Array is not consecutive");

	}
}
