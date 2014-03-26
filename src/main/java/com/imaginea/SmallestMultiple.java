package com.imaginea;

/*
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

// LCM of 1-20 will give the result

public class SmallestMultiple {
	int factor_list[] = new int[20];
	int factors[] = new int[20];
	
	public static void main(String[] args) {
		SmallestMultiple multiple = new SmallestMultiple();
		multiple.find(10);
	} 
	
	public int find(int uLimit) {
		for (int number = uLimit; number > 2; number--) {
			for (int fclean = 0; fclean <= 19; fclean++)
				factors[fclean] = 0;
			findPrimes(number);
			matchIndexes(uLimit);
		}
		
		int smallestMultiple = getLCM(uLimit);
		//System.out.println("The smallest positive number i.e. divisible by all of the numbers from 1 to "+uLimit+"::" + smallestMultiple);
		return smallestMultiple;
	}

	// find prime factor of number between 1 to 20
	private int findPrimes(int multiple) {
		if (multiple % 2 == 0) {
			factors[2] += 1;
			findPrimes(multiple / 2);
		}
		if (multiple % 2 != 0) {
			for (int pcounter = 3; multiple >= 3; pcounter++) {
				if (multiple % pcounter == 0) {
					factors[pcounter] += 1;
					findPrimes(multiple / pcounter);
					break;
				}
			}
		}
		return 0;
	}

	//get max times of prime factors occurance in the prime factorization of each number.
	private int matchIndexes(int uLimit) {
		for (int index = 0; index < uLimit; index++) {
			if (factors[index] > factor_list[index]) {
				factor_list[index] = factors[index];
			}
		}
		return 0;
	}
		
	//Multiply all the prime factors together
	private int getLCM(int uLimit) {
		int lcm = 1;
		for (int counter = 0; counter < uLimit; counter++) {
			if (factor_list[counter] != 0)
				lcm *= Math.pow(counter, factor_list[counter]);
		}
		return lcm;
	}

}
