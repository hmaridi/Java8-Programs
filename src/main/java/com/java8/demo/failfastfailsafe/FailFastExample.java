package com.java8.demo.failfastfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(200);
		list.add(201);
		list.add(202);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer intx = (Integer) it.next();
			list.add(203);
			System.out.println(intx);
		}

	}

}
//Fail-Fast iterators doesn’t allow modifications of a collection while iterating over it.
//These iterators throw ConcurrentModificationException if a collection is modified while iterating over it.
//Iterators returned by ArrayList, Vector, HashMap.