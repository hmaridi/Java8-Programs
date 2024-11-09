package com.java8.demo.permutations;

public class StringPermutationsExample {

	public static void main(String[] args) {
		StringPermutations("", "abc");
	}

	private static void StringPermutations(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix + " ");
		} else {
			for (int i = 0; i < n; i++) {
				StringPermutations(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
			}
		}

	}

}
