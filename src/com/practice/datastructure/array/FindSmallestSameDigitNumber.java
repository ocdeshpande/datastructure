package com.practice.datastructure.array;

import java.util.Scanner;

/**
 * 
 * @author deshpande_o
 *
 *         Given a number N, find a number lowest with same digits.
 * 
 */

/*
 * 
 * 
 * N= 4950 then smallest number with same number of digits is 1000
 */

public class FindSmallestSameDigitNumber {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		int div = 0, count = 0;
		do {
			div = n / 10;
			n = div;
			if (div != 0) {
				count++;
			}
		} while (div >= 10);
		double smallNum = 0;
		if (div != 0) {
			smallNum = Math.pow(10, count);
		}

		System.out.println("Smallest Number is: " + Double.valueOf(smallNum).intValue());
	}
}
