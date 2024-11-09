package com.java8.demo.INTERVIEWARRAYS;

public class Replace1To0And0To1 {

	public static void main(String[] args) {
		String str = "110010101";
		String result = replace1To0And0To1(str);
		System.out.println("Before Replace : " + str);
		System.out.println("After Replace  : " + result);
	}

	private static String replace1To0And0To1(String str) {
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (c == '1') {
				sb.append(0);
			} else if (c == '0') {
				sb.append(1);
			} else {
				sb.append(c);
			}
		}

		return sb.toString();
	}

}
