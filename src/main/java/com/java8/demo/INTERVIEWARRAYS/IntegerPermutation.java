package com.java8.demo.INTERVIEWARRAYS;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerPermutation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		integerPermutation(arr, new int[] {});
	}

	private static void integerPermutation(int[] arr, int[] prefix) {
		if (arr.length == 0) {
			System.out.println(Arrays.toString(prefix));
		}
		for (int i = 0; i < arr.length; i++) {
			int i2 = i;
			int[] pre = IntStream.concat(Arrays.stream(prefix), IntStream.of(arr[i])).toArray();
			int[] post = IntStream.range(0, arr.length).filter(i1 -> i1 != i2).map(v -> arr[v]).toArray();
			integerPermutation(post, pre);
		}

	}
	
}
