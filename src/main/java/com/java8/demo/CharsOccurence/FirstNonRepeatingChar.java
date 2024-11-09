package com.java8.demo.CharsOccurence;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "abcdaf";
		int result = firstNonRepeatingCharIndexValue(str);
		if (result != -1) {
			System.out.println("Index of the first non-repeating char : " + result);
		} else {
			System.out.println("no non repeating char found : " + result);
		}
	}

	private static int firstNonRepeatingCharIndexValue(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return str.indexOf(entry.getKey());
			}
		}
		return -1;

	}

}
