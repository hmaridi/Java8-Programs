package com.java8.demo.basic;

public class RecursiveFibonacciSeries {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(recursiveFibonacci(i));
		}
	}

	private static int recursiveFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
		}
	}

}
