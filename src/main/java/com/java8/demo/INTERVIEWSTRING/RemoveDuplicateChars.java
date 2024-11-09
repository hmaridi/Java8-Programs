package com.java8.demo.INTERVIEWSTRING;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "programming";
		char ch = str.charAt(0);
		String out = str.replace(ch, Character.MIN_VALUE);
		System.out.println("\nThe Final String after Deleting " + ch + " Characters = " + out);

	}

}
