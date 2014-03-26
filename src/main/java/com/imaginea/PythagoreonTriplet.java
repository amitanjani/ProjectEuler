package com.imaginea;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

			a^2 + b^2 = c^2
			
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class PythagoreonTriplet {
	public int getTriplet() {
		int k = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = i + 1; j < 999; j++) {
				k = (int) Math.sqrt(i * i + j * j);
				if (i + j + k == 1000 && i < j && j < k) {
					if (i * i + j * j == k * k) {
						//System.out.println("i=" + i + " j=" + j + " k=" + k);
						return i * j * k;
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		PythagoreonTriplet triplet = new PythagoreonTriplet();
		triplet.getTriplet();
	}
}
