package com.java8.demo.devgenius;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharacterCaseConverter {
	public static void main(String[] args) {
		String input = "ABBCDDDF";
		String converted = convertCase(input);
		System.out.println("Converted string: " + converted);
	}

	public static String convertCase(String str) {
//        Map<Integer, Long> charCounts = str.toLowerCase()
//                .chars()
//                .boxed()
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		Map<String,Long>charCounts=Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (charCounts.get((int) Character.toLowerCase(c)) > 1) {
                result.append(Character.toLowerCase(c)); // duplicate characters in lowercase
            } else {
                result.append(Character.toUpperCase(c)); // unique characters in uppercase
            }
        }

        return result.toString();
    }
}
