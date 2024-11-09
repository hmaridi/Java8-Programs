package com.java8.demo.INTERVIEWARRAYS;

public class PairArray {

	public static void main(String[] args) {
		int[] array = { 2, 4, 7, 3, 5, 1, 8, 9, 5 };
		int target = 10;
		findSumOfPair(array, target);
	}

	private static void findSumOfPair(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] + array[j]) == target) {
					System.out.printf("(%d, %d) %n", array[i], array[j]);
				}
			}
		}
	}
}
