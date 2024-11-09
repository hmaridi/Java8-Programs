package com.java8.demo.INTERVIEWSTRING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = groupAnagrams(str);
		System.out.println("Group Of Anagrams : " + result);
	}

	private static List<List<String>> groupAnagrams(String[] str) {
		Map<String, List<String>> grpAngrams = new HashMap<>();

		for (String st : str) {
			char[] ch = st.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			grpAngrams.computeIfAbsent(key, k -> new ArrayList<>()).add(st);
		}

		return new ArrayList<>(grpAngrams.values());
	}

}
