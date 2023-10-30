package com.example.Junitdemo;

public class NumberUtils {

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int calculateFactorial(int n) {
		if (n <= 1)
			return 1;

		return n * calculateFactorial(n - 1);
	}

}
