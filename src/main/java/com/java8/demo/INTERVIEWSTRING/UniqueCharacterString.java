package com.java8.demo.INTERVIEWSTRING;

public class UniqueCharacterString {

	public static void main(String[] args) {
		String str = "better";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.toCharArray()[i] == str.toCharArray()[j]) {
					str = str.replace(String.valueOf(str.charAt(j)), "");
				}
			}
		}
		System.out.println(str);
	}

}
