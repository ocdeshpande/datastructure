package com.practice.datastructure.array;

import java.util.Arrays;

/**
 * 
 * @author deshpande_o
 *
 *         You are given arrival and departure time of trains reaching to a
 *         particular station. You need to find minimum number of platforms
 *         required to accommodate the trains at any point of time.
 */

/*
 * 
 * 
 * arrival[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00} departure[] = {1:10, 3:00,
 * 2:20, 2:30, 3:15, 6:00} No. of platforms required in above scenario = 4
 */

public class FindNumberOfPlatformsReqd {

	public static void main(String[] arg) {

		Double arrival[] = { 1.00, 1.40, 1.50, 2.00, 2.15, 4.00 };

		Double departure[] = { 1.10, 3.00, 2.20, 2.30, 3.15, 6.00 };

		int noOfPlatforms = 1;

		Arrays.sort(arrival);
		Arrays.sort(departure);

		for (double i : arrival) {
			System.out.println("Arrival Times");
			System.out.println(i);
		}

		for (double i : departure) {
			System.out.println("Departure Times");
			System.out.println(i);
		}

		for (int i = 1; i < arrival.length; i++) {

			if (arrival[i] < departure[i - 1]) {
				noOfPlatforms++;
			}

		}

		System.out.println("No of Platforms: " + noOfPlatforms);

	}
}
