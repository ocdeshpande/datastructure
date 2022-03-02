package com.practice.datastructure.array;

import java.util.Scanner;

/**
 * 
 * @author deshpande_o
 *
 *         Given a sorted array,we need to find a pair whose sum is closed to
 *         number X in Array.
 * 
 */

/*
 * 
 * 
 * array[]={-40,-5,1,3,6,7,8,20}; The pair whose sum is closest to 5 : 1 and 3
 */

public class FindPairWithSumCloseToX {

	public static void main(String[] arg) {

		Integer[] inputArry = { -40, -5, 1, 3, 6, 7, 8, 20 };

		int sum = 0, oldSum = 0, fisrtNum = 0, secNum = 0;

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // reads int.
		oldSum = inputArry[0] + inputArry[1];

		// Two for loops to iterate one element with rest array
		for (int i = 0; i < inputArry.length; i++) {
			for (int j = i + 1; j < inputArry.length; j++) {
				sum = inputArry[i] + inputArry[j];

				// abs function is used to check numbers irrespective of positive or negative
				if (Math.abs(sum - num) < Math.abs(oldSum - num)) {
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
