package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         You are given an integer array containing 1 to n but one of the
 *         number from 1 to n in the array is missing. You need to provide
 *         optimum solution to find the missing number. Number can not be
 *         repeated in the array.
 */

/*
 * int[] arr1={7,5,6,1,4,2}; Missing Number : 3 int[] arr2={5,3,1,2}; Missing
 * Number : 4
 */

public class FindMissingNumber {

	public static void main(String[] arg) {

		Integer[] inputArry = { 5, 3, 1, 2 };
		int sumofGivenNumbers = 0, sumofGivenNNumbers = 0;
		int n = inputArry.length + 1;

		for (int i : inputArry) {
			sumofGivenNumbers = sumofGivenNumbers + i;

		}
		System.out.println("sumofGivenNumbers " + sumofGivenNumbers);
		sumofGivenNNumbers = n * (n + 1) / 2;

		System.out.println("Missing Number is: " + (sumofGivenNNumbers - sumofGivenNumbers));

	}
}
