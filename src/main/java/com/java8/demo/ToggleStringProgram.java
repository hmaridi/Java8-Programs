package com.java8.demo;

import java.util.Scanner;
import java.util.stream.Collectors;

public class ToggleStringProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String toggleString = toggleStringJava8(str);
		System.out.println("Java 8 Toggle String : " + toggleString);
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				s1 = s1 + Character.toLowerCase(ch);
			} else {
				s1 = s1 + Character.toUpperCase(ch);
			}
		}
		System.out.println("Java 7 Toggle String : " + s1);
	}

	private static String toggleStringJava8(String str) {
		return str.chars().mapToObj(ch -> {
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else {
				ch = Character.toUpperCase(ch);
			}
			return String.valueOf((char) ch);
		}).collect(Collectors.joining());
	}
	
}
