package com.imaginea;

import junit.framework.TestCase;

public class LargestProductinSeriesTest extends TestCase {

	public void testFind() {
		LargestProductinSeries largestProductinSeries = new LargestProductinSeries();
		assertEquals(40824, largestProductinSeries.find());
	}

}
