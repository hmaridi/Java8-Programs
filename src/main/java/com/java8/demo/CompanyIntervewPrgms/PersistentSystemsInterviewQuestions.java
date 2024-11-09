package com.java8.demo.CompanyIntervewPrgms;

import java.util.HashSet;

//Find elements which are present in First array not in second array
//Output --> 4 10 (4 and 10 are present in first array, but not in second array)
public class PersistentSystemsInterviewQuestions {

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5, 10 };
		int y[] = { 2, 3, 1, 0, 5 };
		int n = x.length;
		int m = y.length;
		findMissing(x, y, n, m);
	}

	private static void findMissing(int[] x, int[] y, int n, int m) {
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < m; i++)
			s.add(y[i]);

		/* Print all elements of first array that are not present in hash table */
		for (int i = 0; i < n; i++)
			if (!s.contains(x[i]))
				System.out.print(x[i] + " ");

	}
}