package com.java8.demo.basic;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber_Java8 {

	public static void main(String[] args) {
		Integer intx[]={78, 58, 45, 12, 36,60, 14};
		
		Integer result=Arrays.stream(intx).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		
		System.out.println("Second Largest Number is " + result);
	}

}
