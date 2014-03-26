package com.imaginea;


/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. Answer:- 233168
 */

public class MultiplesThreeOrFive {
	public int find(int limit) {
		int sum = 0;
		// Total number of multiple of 3 below 1000 is 999/3, Similarly for
		// multiple of 5 its 999/5
		// natural numbers below 1000 that are multiple of 3 or 5 is
		// [sumOfMultiple of 3 + sumOfMultiple of 5 - sumOfMultiple of 15]
		sum = sumOfMultipleOf((limit - 1) / 3, 3)
				+ sumOfMultipleOf((limit - 1) / 5, 5)
				- sumOfMultipleOf((limit - 1) / 15, 15);
		/*System.out.println("Sum of all the multiples of 3 or 5 below " + limit
				+ "::" + sum);*/
		return sum;
	}
	
	private int sumOfMultipleOf(int num, int difference) {
		return (difference * num * (num + 1) / 2);
	}

	public static void main(String[] args) {
		MultiplesThreeOrFive threeOrFive = new MultiplesThreeOrFive();
		threeOrFive.find(10);
	}
}