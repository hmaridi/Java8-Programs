package com.java8.demo.CharsOccurence;

import java.util.HashMap;
import java.util.Map;

public class WordCountChar {

	public static void main(String[] args) {
		String str = "abcaadcbcb";

//		Map<String, Long> countChar = Arrays.asList(str.split("")).stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println("Count of Chars : " + countChar);
		
		countChars(str);
	}

	private static void countChars(String str) {
		Map<Character, Integer> hmap = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() +""+ entry.getValue());
		}

	}
	

}
