package com.java8.demo.defaultAndStatic;

public class DefaultMethodExample implements DefaultInterface {

	@Override
	public void extractDefaultMethod(String str) {
		System.out.println("String str : " + str);
	}

	public static void main(String[] args) {
		DefaultMethodExample dfe = new DefaultMethodExample();
		dfe.defaultMethod();
		dfe.extractDefaultMethod("Learning Default Methods ..");
	}

}
