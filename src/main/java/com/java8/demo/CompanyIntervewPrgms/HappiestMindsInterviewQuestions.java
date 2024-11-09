package com.java8.demo.CompanyIntervewPrgms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HappiestMindsInterviewQuestions {

	public static void main(String[] args) {
		//Q.frequency of words in a given list of array
		List<String> wordsList = Arrays.asList("Hari", "Naveen", "Surya", "Chandra", "Hari", "Surya");
		Map<String, Long> wordFreq = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordFreq);
		//Output : {Surya=2, Chandra=1, Hari=2, Naveen=1}
		
		//Q.Print first character of list of strings using stream api.
		wordsList.stream().map(x -> x.charAt(0)).forEach(System.out::println);
		//Output : H N S C H S
	}

}
