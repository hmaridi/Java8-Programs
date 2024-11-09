package com.java8.demo.admindebu;

import java.util.HashSet;
import java.util.Set;

public class InterSectionAndUnionTest {

	public static void main(String[] args) {
		int[] num1x = { 80, 10, 15, 2, 35, 60 };
		int[] num2x = { 35, 80, 60, 20, 75 };

		printUnion(num1x, num2x);
		printInterSection(num1x, num2x);
		

	}

	private static void printUnion(int[] num1x, int[] num2x) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < num1x.length; i++) {
			set.add(num1x[i]);
		}
		for (int i = 0; i < num2x.length; i++) {
			set.add(num2x[i]);
		}
		System.out.println("Union " + set);

	}

	private static void printInterSection(int[] num1x, int[] num2x) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < num1x.length; i++) {
			set.add(num1x[i]);
		}

		for (int j = 0; j < num2x.length; j++) {
			if (set.contains(num2x[j])) {
				System.out.println("InterSection :" + num2x[j] + " ");
			}
		}
	}

}
