package com.java8.demo.INTERVIEWSTRING;

public class LenghtOfLastWord {

	public static void main(String[] args) {

		String inputStr = "Google is the most popular search engine in the world. Bing comes at number two";

		int count = lengthOfLastWord(inputStr);
		System.out.println("Length of the Last Word :" + count);

	}

	private static int lengthOfLastWord(String inputStr) {
		int count = 0;
		inputStr = inputStr.trim();
		int countStr = inputStr.length() - 1;

		for (int i = countStr; i >= 00; i--) {
			if (inputStr.charAt(i) == ' ') {
				break;
			}
			count++;
		}

		return count;
	}

}
