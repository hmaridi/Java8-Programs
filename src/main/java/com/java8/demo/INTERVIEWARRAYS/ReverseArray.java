package com.java8.demo.INTERVIEWARRAYS;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
//		int[] intArray = { 12, 13, 24, 45, 65, 27, 37, 43, 41, 50, 75, 68, 98, 78 };
//		// Reverse Array Logic
//		for (int i = intArray.length - 1; i >= 0; i--) {
//			System.out.println(intArray[i]);
//		}

		int[] intArray = { 12, 13, 24, 45, 65, 27, 37, 43, 41, 50, 75, 68, 98, 78 };
		reverseArray(intArray);
		System.out.println("Reverse Array : " + Arrays.toString(intArray));

	}

	private static void reverseArray(int[] intArray) {
		int start = 0;
		int end = intArray.length - 1;
		while (start < end) {
			int temp = intArray[start];
			intArray[start] = intArray[end];
			intArray[end] = temp;
			start++;
			end--;
		}

	}

}
