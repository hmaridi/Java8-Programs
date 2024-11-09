package com.java8.demo.failfastfailsafe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GetOnlyKeysHashMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Hari", "Kishore");
		map.put("Anil", "Kumar");
		map.put("Siva", "Jyothi");

		Collection<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("Keys " + key);
		}

	}

}
