package com.imaginea;

/*
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 *  Find the sum of all the primes below two million.
 */

public class SummationofPrime {
	private boolean isPrime(int n) {
		if (n == 2)
			return true;
		if (n % 2 == 0 || n == 1)
			return false;
		long limit = (long) Math.sqrt(n);
		for (int i = 3; i <= limit; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public long calculate(int uLimit) {
		long sum = 2;
		for (int i = 3; i < uLimit; i += 2) {
			if (isPrime(i))
				sum += i;
		}
		/*System.out.println("The sum of all the primes below "+ uLimit +"::"
				+ sum);*/
		return sum;
	}
	
	public static void main(String[] args) {
		SummationofPrime summationofPrime = new SummationofPrime();
		summationofPrime.calculate(2000000);
	}
}
