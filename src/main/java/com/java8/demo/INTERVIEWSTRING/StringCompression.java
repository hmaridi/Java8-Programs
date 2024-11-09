package com.java8.demo.INTERVIEWSTRING;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {

	public static void main(String[] args) {

		String str = "aaabbbcccd";

		String compressStr = compressStringJava8(str);
		System.out.println("Java Compression String : " + compressStr);

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println("Compression String : " + sb);
	}

	private static String compressStringJava8(String str) {
		return str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.map(entry -> entry.getKey()+""+entry.getValue())
				.collect(Collectors.joining());
	}

}
