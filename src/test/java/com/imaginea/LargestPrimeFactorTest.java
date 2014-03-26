package com.imaginea;

import junit.framework.TestCase;

public class LargestPrimeFactorTest extends TestCase {

	LargestPrimeFactor factor = new LargestPrimeFactor();
	
	public void testFind1() {
		assertEquals(29 , factor.find("13195"));
	}
	
	public void testFind2() {
		assertEquals( 6857 , factor.find("600851475143"));
	}

}
