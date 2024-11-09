package com.java8.demo.devgenius;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DevgeniusPractice {
	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> listOfDupIntegers = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		int[] containsDup = { 10, 15, 8, 49, 25, 98, 32 };

		List<String> listOfWords = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

		evenNumbers(listOfIntegers);

		oddNumbers(listOfIntegers);

		numberStartingWithOne(listOfIntegers);

		duplicateElements(listOfDupIntegers);

		findTheTotalNumberOfElements(listOfDupIntegers);

		findMaxElement(listOfDupIntegers);

		boolean bool = containsDuplicate(containsDup);
		System.out.println("containsDuplicate ::" + bool);

		countEachWordFromString(listOfWords);

		findOnlyDuplicateElementsCount(listOfWords);
	}

	private static void findOnlyDuplicateElementsCount(List<String> listOfWords) {
		Map<String, Long> namesDupount = listOfWords.stream().filter(x -> Collections.frequency(listOfWords, x) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("findOnlyDuplicateElementsCount:: " + namesDupount);
	}

	private static void countEachWordFromString(List<String> listOfWords) {
		Map<String, Long> namesCount = listOfWords.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("CountEachWOrdFromString:: " + namesCount);
	}

	private static boolean containsDuplicate(int[] containsDup) {
		List<Integer> list = Arrays.stream(containsDup).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<Integer>(list);
		if (set.size() == list.size()) {
			return false;
		}
		return true;
	}

	private static void findMaxElement(List<Integer> listOfDupIntegers) {
		int maxElement = listOfDupIntegers.stream().max(Integer::compare).get();
		System.out.println("Maximum Element:: " + maxElement);
	}

	private static void findTheTotalNumberOfElements(List<Integer> listOfDupIntegers) {
		long count = listOfDupIntegers.stream().count();
		System.out.println("TotalNumberOfElements:: " + count);
	}

	private static void duplicateElements(List<Integer> listOfDupIntegers) {
		Set<Integer> dupIntegers = new HashSet<Integer>();
		List<Integer> dupInt = listOfDupIntegers.stream().filter(x -> !dupIntegers.add(x)).collect(Collectors.toList());
		System.out.println("Duplicate Elements:: " + dupInt);
	}

	private static void numberStartingWithOne(List<Integer> listOfIntegers) {
		listOfIntegers.stream().map(x -> x + "").filter(x -> x.startsWith("1")).forEach(System.out::println);
	}

	private static void oddNumbers(List<Integer> listOfIntegers) {
		List<Integer> oddNumbers = listOfIntegers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Numbers:: " + oddNumbers);
	}

	private static void evenNumbers(List<Integer> listOfIntegers) {
		List<Integer> evenNumbers = listOfIntegers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers:: " + evenNumbers);
	}
}