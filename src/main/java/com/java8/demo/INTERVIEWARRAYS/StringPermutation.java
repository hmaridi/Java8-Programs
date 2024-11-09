package com.java8.demo.INTERVIEWARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {

		String str = "abcd";
		List<String> combnationStr = new ArrayList<String>();
		combnationStr = stringPermuteAndPrint(str);
		Collections.sort(combnationStr);
		System.out.println(combnationStr);
		System.out.println("Size :" + combnationStr.size() );
	}

	
	
	private static List<String> stringPermuteAndPrint(String str) {
		List<String> combStr=new ArrayList<String>();
		if(str.length()==1) {
			combStr.add(str);
		}
		else {
			for(int i=0;i<str.length();i++) {
				List<String> temp=stringPermuteAndPrint(str.substring(0,i) + str.substring(i+1));
				for(String st:temp) {
					combStr.add(str.charAt(i)+st);
				}
			}
		}

		return combStr;
	}

	/*private static void stringPermuteAndPrint(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			for (int i = 0; i < n; i++) {
				stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
			}
		}
	}*/

}
