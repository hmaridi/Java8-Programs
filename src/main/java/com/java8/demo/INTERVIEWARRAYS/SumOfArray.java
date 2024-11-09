package com.java8.demo.INTERVIEWARRAYS;

public class SumOfArray {
	public static void main(String[] args) {
		int[] intArray = { 12, 13, 24, 45, 65, 27, 37, 43, 41, 50, 75, 68, 98, 78 };

		int sum = 0;

		for (int i : intArray) {
			sum = sum + i;
		}
		System.out.println("Sum of Array :" + sum);
	}
}
