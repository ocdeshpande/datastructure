package com.practice.datastructure.array;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 
 * @author deshpande_o
 *
 *         Given an Array of integers and an Integer k, Find the maximum element
 *         of from all the contiguous subarrays of size K.
 * 
 */

/*
 * 
 * 
 * Input : int[] arr = {2,6,-1,2,4,1,-6,5} int k = 3 output : 6,6,4,4,4,5
 */

public class FindSlidingWIndowMaximum {

	public static void main(String[] arg) {

		Integer[] inputArry = { 2, 6, -1, 2, 4, 1, -6, 5 };
		Integer max = 0;

		Scanner sc = new Scanner(System.in);
		StringJoiner finalOp = new StringJoiner(",");

		System.out.print("Enter the element :");
		int k = sc.nextInt();
		int i = 0;
		while (i < inputArry.length) {
			for (int j = i; j < i + k && j < inputArry.length; j++) {
				if (inputArry[j] > max) {
					max = inputArry[j];

				}
				if (j == inputArry.length - 1) {
					i = inputArry.length;
				}
			}
			finalOp.add(max.toString());

			max = 0;
			i++;

		}
		System.out.println("Max are :" + finalOp.toString());
	}
}
