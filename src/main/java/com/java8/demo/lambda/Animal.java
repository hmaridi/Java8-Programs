package com.java8.demo.lambda;

public interface Animal {

	default void food() {
		System.out.println("Animal eat food");
	}
}
