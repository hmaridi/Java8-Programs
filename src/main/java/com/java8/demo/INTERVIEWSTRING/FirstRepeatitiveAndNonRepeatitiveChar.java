package com.java8.demo.INTERVIEWSTRING;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatitiveAndNonRepeatitiveChar {

	public static void main(String[] args) {

		
		//Using Java8 features
		
		String str = "abcdaf";

		Map<String, Long> repeatedCount = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String repeatedChar = repeatedCount.entrySet()
				                           .stream()
				                           .filter(entry -> entry.getValue() > 1)
				                           .map(entry -> entry.getKey())
				                           .findFirst()
				                           .get();
		System.out.println("Repeated Char : " + repeatedChar);
		
		
		String nonRepearedChar = repeatedCount.entrySet()
				                              .stream()
				                              .filter(entry -> entry.getValue() == 1)
				                              .map(entry -> entry.getKey())
				                              .findFirst()
				                               .get();
		System.out.println("Non Repeated Char : " + nonRepearedChar);
		

		// Custom Java code
		char nonRepeat = findFirstNonRepeatableChar(str);
		char repeat = findFirstRepeatableChar(str);
		System.out.println("First Repeated Char - " + repeat);
		System.out.println("First Non Repeated Char - " + nonRepeat);
		
	}

	

	private static char findFirstNonRepeatableChar(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.lastIndexOf(str.charAt(i)) == 1)
			{
				return str.charAt(i);
			}
		}
		return 0;
	}

	private static char findFirstRepeatableChar(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.lastIndexOf(str.charAt(i)) > 1) {
				return str.charAt(i);
			}
		}
		return 0;
	}

}
