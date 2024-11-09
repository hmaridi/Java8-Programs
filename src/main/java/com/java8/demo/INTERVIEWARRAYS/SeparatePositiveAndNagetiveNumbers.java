package com.java8.demo.INTERVIEWARRAYS;

public class SeparatePositiveAndNagetiveNumbers {

	public static void main(String[] args) {
		int i = 0, posCount = 0, negCount = 0;

		int[] posAndNegNums = { -6, 7, -10, 7, -8, -2, 2, -9, 8, -2, 3, 6, -8, 4, 0, -7, -3, 7, 7, 4 };

		int[] posArray = new int[20];
		int[] negArray = new int[20];

		while (i < posAndNegNums.length) {
			if (posAndNegNums[i] >= 0) {
				posArray[posCount] = posAndNegNums[i];
				posCount++;
			} else {
				negArray[negCount] = posAndNegNums[i];
				negCount++;
			}
			i++;
		}
		System.out.println("The Total Number of Positive Items = " + posCount);
		System.out.print("The List of Items in Positive Array = ");
		PrintArrayElement(posArray, posCount);

		System.out.println("\n\nThe Total Number of Negative Items = " + negCount);
		System.out.print("The List of Items in Nagetive Array = ");
		PrintArrayElement(negArray, negCount);

	}

	private static void PrintArrayElement(int[] array, int size) {
		int i;

		for (i = 0; i < size; i++) {
			System.out.format("%d ", array[i]);
		}

	}

}
