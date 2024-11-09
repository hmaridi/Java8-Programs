package com.java8.demo.defaultAndStatic;

public interface DefaultInterface {

	default void defaultMethod() {
		System.out.println("Added new Default Method..");
	}

	void extractDefaultMethod(String str);

}
