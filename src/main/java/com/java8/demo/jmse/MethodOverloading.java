package com.java8.demo.jmse;

public class MethodOverloading {

	public void sum(int x, int y) {
		System.out.println("First Sum " + (x + y));
	}

	public void sum(int x, int y, int z) {
		System.out.println("Second Sum " + (x + y + z));
	}

	public static void main(String[] args) {
		MethodOverloading mvl = new MethodOverloading();
        mvl.sum(100, 199);
        mvl.sum(199, 188, 177);
	}

}
