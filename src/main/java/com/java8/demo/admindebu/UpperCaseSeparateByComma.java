package com.java8.demo.admindebu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseSeparateByComma {

	public static void main(String[] args) {
		List<String> contries = Arrays.asList("India", "Japan", "China", "Italy", "France", "Canada");

		String str = contries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		
		System.out.println("Countries List " + str);

	}

}
