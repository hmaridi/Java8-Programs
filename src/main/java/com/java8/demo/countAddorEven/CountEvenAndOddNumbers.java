package com.java8.demo.countAddorEven;

public class CountEvenAndOddNumbers {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 5, 4, 7, 8, 11, 20 ,15};

		int countEven = 0, countOdd = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				countEven++;
			} else
				countOdd++;
		}
		System.out.printf("\nNumber of even elements in the array: %d", countEven);
		System.out.printf("\nNumber of odd elements in the array: %d", countOdd);
		System.out.printf("\n");

	}
}