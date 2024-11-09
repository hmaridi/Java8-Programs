package com.java8.demo.INTERVIEWARRAYS;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
		int[] nums = { -6, 7, -10, 7, -8, -2, 2, -9, 8, -2, 3, 6, -8, 4, 0, -7, -3, 7, 7, 4 };

		int positiveSum = positiveNumbersSum(nums);

		System.out.println("Sum of positive numbers = " + positiveSum);

	}

	private static int positiveNumbersSum(int[] nums) {
		int sum = 0;

		for (int i : nums) {
			if (i >= 0) {
				sum += i;
			}
		}
		return sum;
	}

}
