package com.practice.datastructure.array;

import java.util.Scanner;

/**
 * 
 * @author deshpande_o
 *
 *         Given an array of integers. Rotate Array by K positions
 */

/*
 * 
 * 
 * If Arr[] = {1, 2, 3, 4, 5, 6} and k=2 then output will be will be {5, 6, 1,
 * 2, 3, 4}
 */

public class RotateArrayByK {

	public static void main(String[] arg) {

		Integer[] inputArry = { 1, 2, 3, 4, 5, 6 };

		Scanner in = new Scanner(System.in);
		int arrLen = inputArry.length;
		System.out.print("Enter the element: ");
		int k = in.nextInt();

		Integer[] opArry = new Integer[inputArry.length];
		for (int i = 0; i < arrLen; i++) {

			if (i + k >= arrLen) {
				opArry[(i + k) - arrLen] = inputArry[i];
			} else {
				opArry[i + k] = inputArry[i];
			}

		}

		for (Integer i : opArry) {
			System.out.println(i);
		}

	}
}
