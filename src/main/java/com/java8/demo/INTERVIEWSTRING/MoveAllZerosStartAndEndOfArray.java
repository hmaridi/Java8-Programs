package com.java8.demo.INTERVIEWSTRING;

import java.util.Arrays;

public class MoveAllZerosStartAndEndOfArray {

	public static void main(String[] args) {

		int[] arr = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 10, 0 };

		MoveAllZerosEndOfArray(arr);
		MoveAllZerosStartOfArray(arr);
	}

	private static void MoveAllZerosEndOfArray(int[] arr) {
		int k = 0;
		int output[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				output[k++] = arr[i];
			}
		}
		System.out.println("Move all zeros end of array : " + Arrays.toString(output));
	}

	private static void MoveAllZerosStartOfArray(int[] arr) {
		int[] startArry = new int[arr.length];
		int count = arr.length - 1;
		for (int number : arr) {
			if (number != 0) {
				startArry[count] = number;
				count--;

			}
		}
		System.out.println("Move all zeros start of array : " + Arrays.toString(startArry));
	}

}
