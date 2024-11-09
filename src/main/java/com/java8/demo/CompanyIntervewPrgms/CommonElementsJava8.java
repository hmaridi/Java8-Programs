package com.java8.demo.CompanyIntervewPrgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsJava8 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 6, 7, 8 };

		findCommonElements(arr1, arr2);

	}

	private static void findCommonElements(int[] arr1, int[] arr2) {
		List<Integer> commonElements = Arrays.stream(arr1)
				.filter(number -> Arrays.stream(arr2).anyMatch(arr2num -> arr2num == number)).boxed()
				.collect(Collectors.toList());
		System.out.println("Common Elements : " + commonElements);
	}

}
