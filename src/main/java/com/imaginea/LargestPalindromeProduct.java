package com.imaginea;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class LargestPalindromeProduct {
	private boolean isPalin(int num) {
		char[] val = ("" + num).toCharArray();
		for (int i = 0; i < val.length / 2; i++) {
			if (val[i] != val[val.length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	public int find(int uLimit) {
		int max = 0;
		int no_of_digit = 0;
		int tmpLimit = uLimit;
		int lLimit = 0;
		while (tmpLimit > 1) {
			no_of_digit++;
			tmpLimit /= 10;
		}

		if (no_of_digit == 3)
			lLimit = 100;

		for (int i = uLimit; i > lLimit; i--) {
			for (int j = uLimit; j > lLimit; j--) {
				int mul = j * i;
				if (isPalin(mul)) {
					if (mul > max) {
						max = mul;
					}
					// System.out.printf("%d * %d = %d\t", i, j, mul);
				}
			}
		}
		/*System.out.println("\nThe largest palindrome made from the product of "
				+ no_of_digit + "-digit numbers " + max);*/
		return max;
	}

	public static void main(String[] args) {
		LargestPalindromeProduct product = new LargestPalindromeProduct();
		product.find(999);
	}
}
