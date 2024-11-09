package com.java8.demo.countAddorEven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenBeforeOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 6, 11, 8, 19, 20);

		List<Integer> evenBeforeOdd = numbers.stream().sorted((a, b) -> Integer.compare(a % 2, b % 2))
				.collect(Collectors.toList());
		
		 System.out.println("Numbers with even before odd: " + evenBeforeOdd);
	}

}
