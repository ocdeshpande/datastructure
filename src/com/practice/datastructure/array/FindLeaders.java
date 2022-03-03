package com.practice.datastructure.array;

import java.util.StringJoiner;

/**
 * 
 * @author deshpande_o
 *
 *         We need to print all the leaders present in the array. Element is the
 *         leader if it is greater than right side of elements.
 * 
 */

/*
 * 
 * 
 * arr[]={14, 12, 70, 15, 99, 65, 21, 90} Here 99 and 90 are leader elements
 */

public class FindLeaders {

	public static void main(String[] arg) {

		Integer[] inputArry = { 14, 12, 70, 15, 99, 65, 21, 90 };
		StringJoiner finalOp = new StringJoiner(",");
		boolean isLeader = false;

		for (int i = 0; i < inputArry.length; i++) {
			for (int j = i + 1; j < inputArry.length; j++) {
				if (inputArry[j] > inputArry[i]) {
					isLeader = false;
				} else {
					isLeader = true;
				}
			}
			if (isLeader)
				finalOp.add(inputArry[i].toString());

		}
		finalOp.add(inputArry[inputArry.length - 1].toString());
		System.out.println("O/P is " + finalOp.toString());

	}
}
