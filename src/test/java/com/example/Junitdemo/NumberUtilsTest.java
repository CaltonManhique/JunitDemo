package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
	
	@Test
	public void isEvenTest1() {
		assertEquals(true, NumberUtils.isEven(6));
	}
	
	@Test
	public void isEvenTest2() {
		assertEquals(false, NumberUtils.isEven(11));
	}
	
	@Test
	public void calculateFactorialTest1() {
		assertEquals(2, NumberUtils.calculateFactorial(2));
	}
	
	@Test
	public void calculateFactorialTest2() {
		assertEquals(24, NumberUtils.calculateFactorial(4));
	}
	
	@Test
	public void calculateFactorialTest3() {
		assertEquals(3628800, NumberUtils.calculateFactorial(10));
	}
	
	@Test
	public void edgeCalculateFactorialTest1() {
		assertEquals(1, NumberUtils.calculateFactorial(0));
	}

	@Test
	public void edgeCalculateFactorialTest2() {
		assertEquals(1, NumberUtils.calculateFactorial(1));
	}
}
