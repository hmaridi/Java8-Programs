package com.java8.demo.leetcode;

public class PowerOfTwo {

	public static void main(String[] args) {
		boolean b = isPowerOfTwo(8);
		System.out.println("Status " + b);

	}

	private static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		return (n & (n - 1)) == 0;
	}

}
