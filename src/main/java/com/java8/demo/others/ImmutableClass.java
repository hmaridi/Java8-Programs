package com.java8.demo.others;

//Declare the class as final
public final class ImmutableClass {

	// Make it fields are private and final
	private final String firstName;
	private final String lastName;
	private final String address;

	// Initialized constructor with fields
	public ImmutableClass(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	// Do not provide setter methods ,provide getter methods only
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		ImmutableClass imClass = new ImmutableClass("Hari", "kishore", "Bangalore");
		System.out.println("FirstName : " + imClass.getFirstName());
		System.out.println("LastName : " + imClass.getLastName());
		System.out.println("Address : " + imClass.getAddress());

	}

}
