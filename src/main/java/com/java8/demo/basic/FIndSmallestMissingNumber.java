package com.java8.demo.basic;

import java.util.Arrays;

public class FIndSmallestMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 3, 5, 6,8 };

		Arrays.sort(arr);

		int res = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == res) {
				res++;
			} else {
				System.out.println("smallest number - " + res);
				break;
			}
		}

	}

}
