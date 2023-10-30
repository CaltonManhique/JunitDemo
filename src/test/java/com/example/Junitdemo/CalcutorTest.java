package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcutorTest {

	private Calcutor calcutor = new Calcutor();
	private int a = 40;
	private int b = 60;

	@Test
	public void addTest1() {
		assertEquals(a + b, calcutor.add(a, b));
	}

	@Test
	public void addTest2() {
		assertEquals(a + b, calcutor.add(b, a));
	}

	@Test
	public void subtractTest1() {
		assertEquals(a - b, calcutor.subtract(a, b));
	}

	@Test
	public void subtractTest2() {
		assertEquals(a - b, calcutor.subtract(b, a));
	}

	@Test
	public void multiplyTest1() {
		assertEquals(a * b, calcutor.multiply(a, b));
	}

	@Test
	public void multiplyTest2() {
		assertEquals(a * b, calcutor.multiply(b, a));
	}

	@Test
	public void divideTest1() {
		assertEquals(a / b, calcutor.divide(a, b));
	}

	@Test
	public void divideTest2() {
		assertEquals(a / b, calcutor.divide(b, a));
	}
}
