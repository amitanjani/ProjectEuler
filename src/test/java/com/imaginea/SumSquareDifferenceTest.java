package com.imaginea;

import junit.framework.TestCase;

public class SumSquareDifferenceTest extends TestCase {

	SumSquareDifference sumSquareDifference = new SumSquareDifference();

	public void testCalculate1() {
		assertEquals(2640, sumSquareDifference.calculate(10));
	}

	public void testCalculate2() {
		assertEquals(25164150, sumSquareDifference.calculate(100));
	}

}
