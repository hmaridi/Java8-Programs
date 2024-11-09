package com.java8.demo.CompanyIntervewPrgms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

///arr = [9, 6, 4, 3, 2, 1], key = 1

public class TerraLogicInterviewQuestion {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 6, 4, 3, 2, 1);
		
		int target = 3;

		OptionalInt index = findIndex(list, target);
		
		if (index.isPresent()) {
			System.out.println("The integer " + target + " is at index: " + index.getAsInt());
		} else {
			System.out.println("The integer " + target + " is not found in the list.");
		}
	}

	private static OptionalInt findIndex(List<Integer> list, int target) {
		return IntStream.range(0, list.size()).filter(i -> list.get(i) == target).findFirst();
	}

}
