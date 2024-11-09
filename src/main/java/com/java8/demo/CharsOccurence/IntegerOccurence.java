package com.java8.demo.CharsOccurence;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerOccurence {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,3,4,6,1,3,6,7,9,1);
		Map<Integer,Long> intCount=intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Integer Occurence : " + intCount);
		
	}

}
