package com.java8.demo.logical;

public class FindEvenAndOddNumbersWithoutModules {
	public static void main(String[] args) {
		int inputNumber = 70;
		int quotient = inputNumber / 2; 
		if (quotient * 2 == inputNumber) { //if((inputNumber & 1)==0) this line is second approach
			System.out.println(inputNumber + " is the even number");
		} else {
			System.out.println(inputNumber + " is the odd number");
		}

	}

}
