package com.java8.demo.practice;

public class CanWeOverloadStaticMethod {
	
	public static void display() {
		System.out.println("Static Method Called ..");
	}
	public static void display(int x){
		System.out.println("An Overloaded Static Method Called ..");
	}

	public static void main(String[] args) {
		CanWeOverloadStaticMethod.display();
		CanWeOverloadStaticMethod.display(140);

	}

}
