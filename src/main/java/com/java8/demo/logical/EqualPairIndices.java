package com.java8.demo.logical;

import java.util.HashMap;
import java.util.Map;

public class EqualPairIndices {

	public static int[] findIndices(int[] arr) {
		Map<Integer, Integer> sumMap = new HashMap<>();
		int targetSum = 0;
		int[] result = new int[4];

		for (int i = 0; i < arr.length; i++) {
			int complement = targetSum - arr[i];

			if (sumMap.containsKey(complement)) {
				result[0] = sumMap.get(complement);
				result[1] = i;
				result[2] = sumMap.get(complement) + 1;
				result[3] = i + 1;
				break;
			}

			sumMap.put(arr[i], i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 19, 3, 17, 4, 5, 2, 18 };
		int[] indices = findIndices(arr);

		System.out.println("Lexicographically smaller indices whose corresponding elements add up to the same value:");
		for (int index : indices) {
			System.out.print(index + " ");
		}
	}
}
