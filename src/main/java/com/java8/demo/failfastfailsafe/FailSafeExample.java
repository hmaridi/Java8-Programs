package com.java8.demo.failfastfailsafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> hmap=new ConcurrentHashMap<String,String>();
		hmap.put("Hari", "Kishore");
		hmap.put("anil", "Kumar");
		hmap.put("Ram", "Krishana");
		
		Iterator<String> it=hmap.keySet().iterator();
		
		while(it.hasNext()) {
			String sx=(String) it.next();
			System.out.println(sx +" - "+hmap.get(sx));
			hmap.put("Murali", "Nath");
		}

	}

}
