package com.imaginea;

import junit.framework.TestCase;

public class PrimeNumberTest extends TestCase {

	PrimeNumber primeNumber = new PrimeNumber();
	
	public void testFind1() {
		assertEquals(13, primeNumber.find(6));
	}
	
	public void testFind2() {
		assertEquals(104743, primeNumber.find(10001));
	}

}
