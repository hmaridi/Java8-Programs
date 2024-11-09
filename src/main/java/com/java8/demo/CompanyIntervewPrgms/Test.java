package com.java8.demo.CompanyIntervewPrgms;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3, 4, 5, 10 };
		int[] secondArray = { 2, 3, 1, 0, 5 };

		List<Integer> elementsFirstArray = new ArrayList<Integer>();

		for (int i : firstArray) {
			boolean found = false;
			for (int j : secondArray) {
				if (i == j) {
					found = true;
				}
			}
			if (!found) {
				elementsFirstArray.add(i);
			}
		}
		System.out.println("Elements present in first array but not in second array: " + elementsFirstArray);
	}

}
