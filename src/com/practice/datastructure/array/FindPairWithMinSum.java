package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         Given array of +ve and -ve integers ,we need to find a pair whose sum
 *         is closed to Zero in Array.
 */

/*
 * 
 * 
 * array[]={1,3,-5,7,8,20,-40,6}; The pair whose sum is closest to zero : -5 and
 * 6
 */

public class FindPairWithMinSum {

	public static void main(String[] arg) {

		Integer[] inputArry = { 1, 3, -5, 7, 8, 20, -40, 6 };

		int sum = 0, oldSum = 0, fisrtNum = 0, secNum = 0;

		// Two for loops to iterate one element with rest array
		for (int i = 0; i < inputArry.length; i++) {
			for (int j = 0; j < inputArry.length; j++) {
				// skip addition of element with itself
				if (i == j) {
					continue;
				}
				sum = inputArry[i] + inputArry[j];
				// For first iteration
				if (i == 0 && j == 1) {
					oldSum = sum;
				}
				// abs function is used to check numbers irrespective of positive or negative
				if (Math.abs(sum) < Math.abs(oldSum)) {
					oldSum = sum;
					fisrtNum = inputArry[i];
					secNum = inputArry[j];

				}
			}

		}
		System.out.println("First Number is " + fisrtNum);
		System.out.println("Second Number is " + secNum);

	}
}
