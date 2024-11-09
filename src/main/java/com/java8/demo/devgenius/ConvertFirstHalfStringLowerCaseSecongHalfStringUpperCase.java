package com.java8.demo.devgenius;

public class ConvertFirstHalfStringLowerCaseSecongHalfStringUpperCase {

	public static void main(String[] args) {
		//String str = "I am feeling happy";
		String str = "I Love you my india";
		int mid = str.length() / 2;

		String lowerCaseString = str.substring(0, mid).toUpperCase();
		String upperCaseString = str.substring(mid + 1).toLowerCase();
		System.out.println("String " + lowerCaseString + upperCaseString);

	}

}
