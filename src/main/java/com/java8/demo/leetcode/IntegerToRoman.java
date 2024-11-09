package com.java8.demo.leetcode;

public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 951;
		String str = intToRoman(num);
		System.out.println("Integer To Roman " + str);
	}

	public static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	public static final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	private static String intToRoman(int num) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < values.length; ++i) {
			if (num == 0)
				break;
			while (num >= values[i]) {
				num -= values[i];
				sb.append(symbols[i]);
			}
		}

		return sb.toString();
	}

}
