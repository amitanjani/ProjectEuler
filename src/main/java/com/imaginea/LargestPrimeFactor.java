package com.imaginea;

/*
 The prime factors of 13195 are 5, 7, 13 and 29.
 What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {

	public int find(String num) {
		long n = Long.parseLong(num);
		int largestPrimeFactor = 2;
		if (n % 2 == 0) {
			n /= 2;
			while (n % 2 == 0) {
				n /= 2;
			}
		} else {
			largestPrimeFactor = 1;
		}

		int factor = 3;
		while (n > 1) {
			if (n % factor == 0) {
				n /= factor;
				largestPrimeFactor = factor;
				while (n % factor == 0) {
					n /= factor;
				}
			}
			factor += 2;
		}

		//System.out.println("Largest Prime Factor::" + largestPrimeFactor);
		return largestPrimeFactor;
	}

	public static void main(String[] args) {
		LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
		largestPrimeFactor.find("600851475143");
	}

}
