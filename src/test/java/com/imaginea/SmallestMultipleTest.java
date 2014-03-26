package com.imaginea;

import junit.framework.TestCase;

public class SmallestMultipleTest extends TestCase {

	private SmallestMultiple multiple = new SmallestMultiple();

	public void testFind1() {
		assertEquals(2520, multiple.find(10));
	}

	public void testFind2() {
		assertEquals(232792560, multiple.find(20));
	}

}
