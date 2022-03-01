package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         You are given a array of integer. All numbers occur even number of
 *         times except one. You need to find the number which occurs odd number
 *         of time. You need to solve it with o(n) time complexity and o(1)
 *         space complexity. For example:
 */

/*
 * 
 * 
 * int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
 * Number which occurs odd number of times is : 50
 */

public class FindOddOccurenceOfNumber {

	public static void main(String[] arg) {

		Integer[] inputArry = { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };

		int count = 0;

		for (int i = 0; i < inputArry.length; i++) {
			count = 0;
			for (int j = 0; j < inputArry.length; j++) {
				if (inputArry[i] == inputArry[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				System.out.println("Count is " + count);
				System.out.println("Number is " + inputArry[i]);
				break;
			}
		}

	}
}
