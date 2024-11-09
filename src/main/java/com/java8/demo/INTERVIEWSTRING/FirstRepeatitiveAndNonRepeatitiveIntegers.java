package com.java8.demo.INTERVIEWSTRING;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatitiveAndNonRepeatitiveIntegers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1);
		
		Integer[] listx = new Integer[] {1, 2, 3, 4, 2, 1};

		System.out.println("** PRINTING UNIQUE INTEGERS **");
		List<Integer> NonRepeatitiveIntegers = list.stream().filter(x -> Collections.frequency(list, x) == 1)
				.collect(Collectors.toList());
		System.out.println("Unique Integers :" + NonRepeatitiveIntegers);
		
		
		
		System.out.println("** PRINTING NON UNIQUE INTEGERS **");
		List<Integer> repeatitiveIntegers = list.stream().filter(x -> Collections.frequency(list, x) > 1)
				.collect(Collectors.toList());
		System.out.println("Non Unique Integers :" + repeatitiveIntegers);	
		
		
		System.out.println("** PRINTING DUPLICATE INTEGERS **");
		Set<Integer> setNumx = new HashSet<Integer>();
		Set<Integer> duplicates = Arrays.stream(listx).filter(x -> !setNumx.add(x)).collect(Collectors.toSet());
		System.out.println("Duplicates " + duplicates);
		
		System.out.println("** PRINTING FREQUENCY INTEGERS **");
		Map<Integer, Long> numsCount = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		numsCount.forEach((key, value) -> {
			System.out.println(key + "--" + value);
		});
	}

}
