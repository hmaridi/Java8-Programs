package com.java8.demo.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("four");
		
		System.out.println("Result : " + list);
		
		Set<String> setDup=new HashSet<String>();
		
		List<String> listDup=list.stream().filter(x -> !setDup.add(x)).collect(Collectors.toList());
		System.out.println("Duplicate Values : " + listDup);
		
	    List<String> uniqueValue= list.stream().distinct().collect(Collectors.toList());
	    System.out.println("Unique Values : " + uniqueValue);
		
		
		
		
	}

}
