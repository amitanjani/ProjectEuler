package com.imaginea;

import junit.framework.TestCase;

public class EvenFibonacciNumberTest extends TestCase {
	
	public void testApp1() {
		EvenFibonacciNumber evenFibonacciNumber = new EvenFibonacciNumber();
		assertEquals(4613732,evenFibonacciNumber.getSumofEvenValuedNum(4000000));
	}
	
	public void testApp2() {
		EvenFibonacciNumber evenFibonacciNumber = new EvenFibonacciNumber();
		assertEquals(10,evenFibonacciNumber.getSumofEvenValuedNum(10));
	}
}
