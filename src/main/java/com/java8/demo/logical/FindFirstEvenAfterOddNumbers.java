package com.java8.demo.logical;

import java.util.Arrays;

//Place all the occurrence of even number in the array before odd numbers using Java
public class FindFirstEvenAfterOddNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 7, 8, 11, 20 };
		arrayEvenAndOddNumbers7(arr);
		arrayEvenAndOddNumbers8(arr);
	}

	private static void arrayEvenAndOddNumbers8(int[] arr) {
		arr = Arrays.stream(arr).boxed().sorted((a, b) -> a % 2 == b % 2 ? a - b : a % 2 - b % 2)
				.mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(arr));

	}

	private static void arrayEvenAndOddNumbers7(int[] arr) {
		int[] arrx = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arrx[index] = arr[i];
				index++;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arrx[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arrx.length; i++) {
			System.out.println(arrx[i] + "");
		}
	}

}
