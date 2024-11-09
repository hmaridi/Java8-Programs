package com.java8.demo.failfastfailsafe;

import java.text.DecimalFormat;

public class CharacterPercentageTest {
	
	public static void main(String[] args) {

		characterPercentage("09g81a0505");

	}

	static void characterPercentage(String inputString) {

		int totalChars = inputString.length();

		int upperCaseLetters = 0;

		int lowerCaseLetters = 0;

		int digits = 0;

		int others = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseLetters++;
			}

			else if (Character.isLowerCase(ch)) {
				lowerCaseLetters++;
			}

			else if (Character.isDigit(ch)) {
				digits++;
			}
			else {
				others++;
			}
		}

		double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;

		double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;

		double digitsPercentage = (digits * 100.0) / totalChars;

		double otherCharPercentage = (others * 100.0) / totalChars;

		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("In '" + inputString + "' : ");

		System.out.println("Uppercase letters are " + formatter.format(upperCaseLetterPercentage) + "% ");

		System.out.println("Lowercase letters are " + formatter.format(lowerCaseLetterPercentage) + "%");

		System.out.println("Digits Are " + formatter.format(digitsPercentage) + "%");

		System.out.println("Other Characters Are " + formatter.format(otherCharPercentage) + "%");

	}
}
