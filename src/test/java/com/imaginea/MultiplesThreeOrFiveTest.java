package com.imaginea;

import junit.framework.TestCase;

public class MultiplesThreeOrFiveTest extends TestCase {
	MultiplesThreeOrFive multiplesThreeOrFive = new MultiplesThreeOrFive();

	public void testFind1() {
		assertEquals(23, multiplesThreeOrFive.find(10));
	}

	public void testFind2() {
		assertEquals(233168, multiplesThreeOrFive.find(1000));
	}

}
