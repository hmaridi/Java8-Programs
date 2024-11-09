package com.java8.demo.logical;

public class TriangleTest {
	public static void printTriangle(int n) {
		// outer loop to handle number of rows
		for (int i = 0; i < n; i++) {
			// inner loop to handle number spaces
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			// inner loop to handle number of columns
			for (int j = 0; j <= i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 5;
		printTriangle(n);
	}
}
