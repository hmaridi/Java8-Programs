package com.java8.demo.swapping;

public class IntegerSwappingWithTempVariable {

	public static void main(String[] args) {
		int temp;
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping :" + x + " and " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping :" + x + " and " + y);

	}

}
