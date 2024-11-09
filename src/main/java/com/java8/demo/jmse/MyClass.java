package com.java8.demo.jmse;

public class MyClass implements InterfaceA, InterfaceB {

	@Override
	public void m1() {
		System.out.println("Printing m1()");
	}

	@Override
	public void m2() {
		System.out.println("Printing m2()");
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.m1();
		myClass.m2();

	}

}
