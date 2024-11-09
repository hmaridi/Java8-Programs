package com.java8.demo.MapVsFlatMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapVsFlatMapTest_1 {

	public static void main(String[] args) {

		List<Customer> custList = TestingDataBase.getAllCustomers();

		emailCustMap(custList);
		phoneNumbersCustMap(custList);
		phoneNumbersCustFlatMap(custList);
		//joiningCustomerNames(custList);
		//convertListToMap(custList);

	}

	

	private static void emailCustMap(List<Customer> custList) {
		List<String> emails=custList.stream().map(cust -> cust.getEmail()).collect(Collectors.toList());
		System.out.println("Emails Map : " + emails);
		
	}

	private static void phoneNumbersCustFlatMap(List<Customer> custList) {
		List<String> flatMapPhNos=custList.stream().flatMap( cust->cust.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println("FlapMapPhNos :" + flatMapPhNos );
		
	}

	private static void phoneNumbersCustMap(List<Customer> custList) {
		List<List<String>> phoneNumbers=custList.stream().map(cust -> cust.getPhoneNumber()).collect(Collectors.toList());
		System.out.println("PhoneNumbers Map :" + phoneNumbers);
		
	}
	private static void convertListToMap(List<Customer> custList) {
		Map<String,String > customerMap=custList.stream().collect(Collectors.toMap( x-> x.getName(),x-> x.getEmail()));
		System.out.println("Convert List to Map : " + customerMap);
	}

	private static void joiningCustomerNames(List<Customer> custList) {
		String customerNames = custList.stream().map(Customer::getName).collect(Collectors.joining(" | "));
		System.out.println("Collectors.joining() : " + customerNames);

	}

}
