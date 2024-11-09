package com.java8.demo.countAddorEven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//o/p-- -13 9 -3 10 -5 6 -7 2 -12 1 -11 14 -4 -8
public class RearragePostiveNegativeAlternatively {

	public static void main(String[] args) {
		//int[] arrayx = { 1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14 };
		
		List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		
		List<Integer> li=list.stream().sorted((x,y) ->Integer.compare(y, x)).collect(Collectors.toList());
		System.out.println(li);
		
		
		

	}

}
