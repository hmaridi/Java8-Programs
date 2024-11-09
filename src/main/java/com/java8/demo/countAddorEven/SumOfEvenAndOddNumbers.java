package com.java8.demo.countAddorEven;

import java.util.Arrays;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		int evenSum = Arrays.stream(array).filter(x -> x % 2 == 0).sum();

		int oddSum = Arrays.stream(array).filter(x -> x % 2 != 0).sum();

		System.out.println("Even numbers in the array : ");

		Arrays.stream(array).filter(x -> x % 2 == 0).forEach(num -> System.out.println(num + " "));

		System.out.println("Sum of even numbers : " + evenSum);

		System.out.println("Odd numbers in the array : ");

		Arrays.stream(array).filter(x -> x % 2 != 0).forEach(num -> System.out.println(num + " "));

		System.out.println("Sum of odd numbers : " + oddSum);

	}

}
