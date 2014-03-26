package com.imaginea;

import junit.framework.TestCase;

public class SummationofPrimeTest extends TestCase {

	SummationofPrime summationofPrime = new SummationofPrime();
	public void testCalculate1() {
		assertEquals(17, summationofPrime.calculate(10));
	}
	
	public void testCalculate2() {
		assertEquals(142913828922L, summationofPrime.calculate(2000000));
	}

}
