package com.imaginea;


/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?

 */
public class PrimeNumber {
    public int find(int posOfPrimeNo) {
        int count = 0;
        int prime = 0;
        while (prime <= posOfPrimeNo) {
            if (isPrime(count)) {
                prime++;
                if (prime == posOfPrimeNo) {
                   // System.out.println(count + " is a prime number at "+ prime + "th position");
                    break;
                }
            }
            count++;
        }
        return count;
    }
    
    private boolean isPrime(long n) {
		if (n == 2) return true;
        if (n % 2 == 0 || n == 1) return false;
        long limit = (long)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.find(10001);
	}
}
