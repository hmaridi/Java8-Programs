package com.java8.demo.programmer.guide;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] intArray = { 2, 4, 6, 8 };

		int productOfAll = Arrays.stream(intArray).reduce(1, (a, b) -> a * b);

		int[] result = Arrays.stream(intArray).map(value -> productOfAll / value).toArray();

		System.out.println("Product of all elements except current elements:");

		System.out.println(Arrays.toString(result));

	}

}
