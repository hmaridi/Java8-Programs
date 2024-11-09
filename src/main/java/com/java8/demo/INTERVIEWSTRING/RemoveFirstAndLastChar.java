package com.java8.demo.INTERVIEWSTRING;

public class RemoveFirstAndLastChar {

	public static void main(String[] args) {
		String str = "kishore";
		removeFirstLastCharacter(str);

	}

	private static void removeFirstLastCharacter(String str) {
		String result = str.substring(1, str.length() - 1);
		System.out.println("Removed first and last character = " + result);

	}

}
