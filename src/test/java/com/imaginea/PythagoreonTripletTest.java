package com.imaginea;

import junit.framework.TestCase;

public class PythagoreonTripletTest extends TestCase {

	public void testFindPythagonTriplet() {
		PythagoreonTriplet findPythagoreonTriplet = new PythagoreonTriplet();
		assertEquals(31875000,findPythagoreonTriplet.getTriplet());
	}

}
