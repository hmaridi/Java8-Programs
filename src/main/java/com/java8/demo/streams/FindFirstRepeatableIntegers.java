package com.java8.demo.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatableIntegers {

	public static void main(String[] args) {
		int[] num = { 1,3,4,2,2,4};
		Set<Integer> allItems=new HashSet<Integer>();
		int x=Arrays.stream(num).filter(i -> !allItems.add(i)).findFirst().orElse(-1);
		System.out.println("FindFirstRepeatableIntegers " + x);

	}

}
