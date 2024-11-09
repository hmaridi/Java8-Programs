package com.java8.demo.practice;

public class CannotOverrideStaticMethodX {

	public static void main(String[] args) {
		SuperClass superCls = new SubClass();
		superCls.method();

	}

}
