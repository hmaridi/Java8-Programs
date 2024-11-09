package com.java8.demo.failfastfailsafe;

public class PasswordStrengthValidation {

	public static void main(String[] args) {
		String inputPassword="09g81a0505";
		
		if (inputPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])?=.{8,}")){
		    System.out.println("Strong");
		} else if (inputPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")){
		    System.out.println("Medium");
		} else if (inputPassword.matches("^(?=.*[a-z])(?=.*[0-9])(?=.{8,})")){
		    System.out.println("Weak");
		} else if (inputPassword.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")){
		    System.out.println("Weak");
		}

	}

}
