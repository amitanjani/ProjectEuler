package com.imaginea;

import junit.framework.TestCase;

public class LargestPalindromeProductTest extends TestCase {

	LargestPalindromeProduct palindromeProduct = new LargestPalindromeProduct();
	public void testFind1() {
		assertEquals(9009 , palindromeProduct.find(99));
	}
	
	public void testFind2() {
		assertEquals(906609 , palindromeProduct.find(999));
	}

}
