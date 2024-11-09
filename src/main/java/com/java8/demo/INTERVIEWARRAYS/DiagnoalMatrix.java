package com.java8.demo.INTERVIEWARRAYS;

import java.util.Arrays;

public class DiagnoalMatrix {

	public static void main(String[] args) {
		
		int rows = 3;
		int columns = 3;

		int[][] martix = new int[rows][columns];

		for (int i = 0; i < Math.min(rows, columns); i++) {
			martix[i][i] = 1;
		}
		for (int[] row : martix) {
			System.out.println(Arrays.toString(row));
		}

	}

}
