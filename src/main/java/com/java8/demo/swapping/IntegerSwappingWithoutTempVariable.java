package com.java8.demo.swapping;

public class IntegerSwappingWithoutTempVariable {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println("Before Swapping");
		System.out.println("Value x : " + x);
		System.out.println("Value y : " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping");
		System.out.println("Value x : " + x);
		System.out.println("Value y : " + y);
		
	}

}
