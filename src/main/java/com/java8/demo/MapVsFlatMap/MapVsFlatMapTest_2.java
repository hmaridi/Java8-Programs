package com.java8.demo.MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMapTest_2 {
	public static void main(String[] args) {
		String[] arraysOfWords = { "STACK", "OVVER", "FLOW" };
		Stream<String> streamOfWords = Arrays.stream(arraysOfWords);
		List<Stream<String>> streamStr = streamOfWords.map(x -> x.split("")).map(Arrays::stream).distinct()
				.collect(Collectors.toList());
		System.out.println("Map : " + streamStr);
	}

}
