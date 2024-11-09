package com.java8.demo.INTERVIEWSTRING;

public class LeftAndRightRotationOfString {

	public static void main(String[] args) {
		//String str = "codingninjas";
		String str = "jyothi";
		int d = 1;
		String strL = str;
		strL = leftRotation(strL, d);
		System.out.println("Left Rotation: " + strL);

		String strR = str;
		strR = rightRotation(strR, d);
		System.out.println("Right Rotation: " + strR);

	}

	private static String leftRotation(String strL, int d) {
		String first = strL.substring(d);
		String second = strL.substring(0, d);
		return first + second;
	}

	private static String rightRotation(String strR, int d) {
		int n = strR.length();
		int newD = n - d;
		return leftRotation(strR, newD);
	}

}
