package com.java8.demo.MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingDataBase {

	public static List<Customer> getAllCustomers() {
		return Stream
				    .of(new Customer(1, "Hari", "hari@gmail.com", Arrays.asList("8792263430", "6305130160")),
						new Customer(2, "Anil", "anil@gmail.com", Arrays.asList("7571852554", "9648476325")),
						new Customer(3, "Narendra", "nari@gmail.com", Arrays.asList("8160651749", "8160651749")),
						new Customer(4, "Kalyan", "kalyan@gmail.com", Arrays.asList("6391876378", "7379932768")),
						new Customer(5, "Ekath", "ekanth@gmail.com", Arrays.asList("7702697490", "9444038834")))
				.collect(Collectors.toList());
	}
}
