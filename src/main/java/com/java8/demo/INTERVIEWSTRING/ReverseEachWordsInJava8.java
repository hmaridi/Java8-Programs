package com.java8.demo.INTERVIEWSTRING;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordsInJava8 {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Sentence");
		String inputString = "I Love My Country";

		String reverseWords = Arrays.stream(inputString.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("Reverse Each Words : " + reverseWords); //I evoL yM yrtnuoC

		
		String reverseComplete = Stream.of(inputString).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("Complete Reverse Each words : " + reverseComplete); //yrtnuoC yM evoL I

		List<String> list = Arrays.asList(inputString.split(" "));
		Collections.reverse(list); //Country My Love I
		System.out.println("Reverse Sentence  :" + list.stream().collect(Collectors.joining(" ")));

	}

}
