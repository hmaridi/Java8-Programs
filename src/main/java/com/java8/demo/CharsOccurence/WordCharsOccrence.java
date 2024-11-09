package com.java8.demo.CharsOccurence;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCharsOccrence {

	public static void main(String[] args) {
		String str="javatpoint";
		
		Map<String,Long> charsCount=Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Word Occurence : " + charsCount);
	}

}
