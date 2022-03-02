package com.practice.datastructure.array;

import java.util.Scanner;

/**
 * 
 * @author deshpande_o
 *
 *         Given row wise and column wise sorted matrix ,we need to search
 *         element with minimum time complexity.
 * 
 *         Algorithm: Starts with top right element, so initialise r=0 and c=
 *         sortedMatrix[0].length-1 Iterate over matrix with boundary
 *         conditions. If current element lets say m is equal to element X,
 *         return it. If m < X, go left,so decrease column by 1 (c--). If m > X,
 *         go right, so increase row by 1(r++).
 */

/*
 * Logic: Elements right to current element will be greater than element
 * Elements left to current element will be lesser than element Elements down to
 * current element will be greater than element Elements top to current element
 * will be lesser than element
 * 
 * array[]={{1,2,3},{4,5,6},{7,8,9}};
 */

public class SearchNumberInMatrix {

	public static void main(String[] arg) {

		Integer[][] inputArry = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // reads int.
		int R = inputArry.length;
		int C = inputArry[0].length;

		String finalMsg = "";
		for (int r = 0, c = C - 1; r <= R - 1 && c >= 0;) {
			if (num == inputArry[r][c]) {
				finalMsg = "Number Found ";
				System.out.println(finalMsg + num);
				break;
			} else if (num > inputArry[r][c]) {
				r++;
			} else if (num < inputArry[r][c]) {
				c--;
			}
		}
		if (finalMsg.isEmpty()) {
			System.out.println("Number Not Found ");
		}

	}
}
