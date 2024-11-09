package com.java8.demo.INTERVIEWSTRING;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapKeysAndValuesSorting {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(19, "hari");
		hashMap.put(11, "anil");
		hashMap.put(18, "nari");
		hashMap.put(14, "amar");
		hashMap.put(17, "ekanth");
		hashMap.put(15, "ramu");
		hashMap.put(12, "sesha");
		hashMap.put(16, "vivek");
		hashMap.put(13, "kalyan");
		
		Map<Integer, String> sortedMap=new TreeMap<Integer,String>(hashMap);
		System.out.println("Before Sort :" + hashMap);
		System.out.println("After Sort :" + sortedMap);

	}

}
