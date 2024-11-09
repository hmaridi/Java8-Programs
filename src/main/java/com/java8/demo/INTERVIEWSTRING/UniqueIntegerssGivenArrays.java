package com.java8.demo.INTERVIEWSTRING;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueIntegerssGivenArrays {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1);

		//Note: 1 is print unique integers like [3,4] 0 is print duplicate integers like [1,2,2,1]
		List<Integer> uniqueList = list.stream().filter(x -> Collections.frequency(list, x) == 1)
				.collect(Collectors.toList());

		System.out.println("Unique Integers :" + uniqueList);

	}

}

