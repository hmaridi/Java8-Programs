package com.java8.demo.INTERVIEWSTRING;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Date: 14/12/2022 2:47 PM
 */
public class WordsAndIntegersAndStringFreqency {

	public static void main(String[] args) {
		List<String> wordsList = Arrays.asList("erisson", "verizon", "apple", "erisson", "verizon");
		
		List<Integer> numsList = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4, 5);
		
		String charFreq="better";
		
		String str = "Google is the most popular search engine in the world. Bing comes at number two Google";
		
		//frequency of words in a given array
		Map<String, Long> wordFrequency = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		wordFrequency.forEach((key, value) -> System.out.println(key + "---" + value));
		
        // frequency of integers in a given array
		Map<Integer, Long> intFrequency = numsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		intFrequency.forEach((key, value) -> System.out.println(key + "---" + value));
		
		//character count of a given string
		Map<String, Long> charFrequency = Arrays.asList(charFreq.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		charFrequency.forEach((key, value) -> System.out.println(key + "--" + value));
		
		//Counting word occurrence given a sentence
		String[] strx=str.trim().split("\\s+");
		Map<String,Long>sentenceFrequency=Arrays.stream(strx).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		sentenceFrequency.forEach((key,value)->System.out.println(key +"--"+value));
	}

}
