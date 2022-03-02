package com.practice.datastructure.array;

/**
 * 
 * @author deshpande_o
 *
 *         Given an array of integers representing stock price on a single day,
 *         find max profit that can be earned by 1 transaction. So you need to
 *         find a pair (buyDay,sellDay) where buyDay < = sellDay and it should
 *         maximize the profit.
 * 
 */

/*
 * 
 * 
 * int arr[]={14, 12, 70, 15, 99, 65, 21, 90}; Max profit can be gain by buying
 * on 1st day(0 based indexing) and sell on the 4th day. Max profit = 99-12 =87
 */

public class FindMaxStockProfit {

	public static void main(String[] arg) {

		// 99, 65, 21, 90
		// 99, 98, 97, 90
		Integer[] inputArry = { 14, 12, 70, 15, 99, 65, 21, 90 };

		int maxGain = 0, dayWithMaxGain = 0, minGain = inputArry[0], dayWithMinGain = 0;

		// Find min value
		for (int i = 1; i < inputArry.length; i++) {
			if (inputArry[i] < minGain) {
				minGain = inputArry[i];
				dayWithMinGain = i;

			}
		}

		// Find max value after min value
		for (int i = dayWithMinGain; i < inputArry.length; i++) {
			if (inputArry[i] > maxGain) {
				maxGain = inputArry[i];
				dayWithMaxGain = i;

			}
		}

		// In case both are equal
		if (maxGain == minGain) {
			System.out.println("Max profit is " + maxGain);
		} else {
			System.out.println("Max profit is " + (maxGain - minGain));
		}

	}
}
