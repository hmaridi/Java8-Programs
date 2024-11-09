package com.java8.demo.INTERVIEWSTRING;

public class NoZerosForHeros {

	public static void main(String[] args) {
		int number = 980000;
		removeOnlyZeros(number);

	}

	private static void removeOnlyZeros(int number) {
        if (number == 0) {
            System.out.println("No Zero For Hero's = " + number);
        }

        while (number % 10 == 0) { // 980000
            number /= 10; // 98000 9800 980 98
        }

        System.out.println("No Zero For Hero's = " + number);
    }

}
