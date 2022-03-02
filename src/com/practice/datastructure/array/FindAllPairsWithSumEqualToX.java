package com.practice.datastructure.array;

import java.util.Scanner;

/**
 * 
 * @author deshpande_o
 *
 *         Given a array,we need to find all pairs whose sum is equal to number
 *         X.
 * 
 */

/*
 * 
 * 
 * array[]={ -40, -5, 1, 3, 6, 7, 8, 20 }; Pair of elements whose sum is equal
 * to 15 : 7, 8 and -5, 20
 */

public class FindAllPairsWithSumEqualToX {

	public static void main(String[] arg) {

		Integer[] inputArry = { -40, -5, 1, 3, 6, 7, 8, 20 };

		int sum = 0;

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // reads int.

		// Two for loops to iterate one element with rest array
		for (int i = 0; i < inputArry.length; i++) {
			for (int j = i + 1; j < inputArry.length; j++) {
				sum = inputArry[i] + inputArry[j];
				if (sum == num) {
					System.out.println("Pairs is " + inputArry[i] + "," + inputArry[j]);

				}
			}
		}

	}
}
