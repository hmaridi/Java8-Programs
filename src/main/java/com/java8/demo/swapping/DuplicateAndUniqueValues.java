package com.java8.demo.swapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateAndUniqueValues {

	public static void main(String[] args) {

		//List<Integer> numbers = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);
		
		List<String> numbers = Arrays.asList("one","two","two","three","four","four");

		Map<String, Long> countMap = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countMap);

		System.out.println("Duplicate Numbers :");

		countMap.entrySet().stream().filter(x -> x.getValue() > 1)
		.forEach(x -> System.out.println(x.getKey()));

		System.out.println("Unique Numbers :");

		countMap.entrySet().stream().filter(x -> x.getValue() == 1)
		.forEach(x -> System.out.println(x.getKey()));
	}

}
