package com.imaginea;

/*

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {
	public long calculate(int uLimit) {
		int n=uLimit;
		// formula to find SUM of n natural number is n[n+1]/2, where n is first n natural number
		long sum_of_n_Number = n*(n+1)/2;
		// formula to find sum of the squares of the first n natural is n[n+1][2n+1]/6, where n is first n natural number
		long sum_of_nsquare_number = (n*(n+1)*(2*n+1))/6;
		long squareofSum_of_n_number = (long)Math.pow(sum_of_n_Number, 2);
		long result = (squareofSum_of_n_number - sum_of_nsquare_number);
		//System.out.println("the difference between the sum of the squares of the first "+ uLimit +" natural numbers and the square of the sum::"+result);
		return result;
	}
	
	public static void main(String[] args) {
		SumSquareDifference sumSquareDifference = new SumSquareDifference();
		sumSquareDifference.calculate(100);
	}
}
