package com.java8.demo.INTERVIEWSTRING;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String str,  strx = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  string you want to check:");
		str = sc.nextLine();
		int l = str.length();
		for (int i = l - 1; i >= 0; i--) {
			strx =strx + str.charAt(i);
		}
		if (str.equalsIgnoreCase(strx)) {
			System.out.println("The entered string " +str +" is a palindrome.");  
		} else {
			  System.out.println("The entered string " +str +"  isn't a palindrome."); 
		}
	}
}
