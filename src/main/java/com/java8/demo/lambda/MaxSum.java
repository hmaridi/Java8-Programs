


package com.java8.demo.lambda;


import java.io.IOException;
import java.util.Scanner;

public class MaxSum {
	public static int MaxSum(int[] array) {
		int maxsum = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (maxsum < sum) {
				maxsum = sum;
			} else if (sum < 0) {
				sum = 0;
			}
		}
		return maxsum;
	}
        public static void main(String[] args) throws IOException {
		int[] a = new int[10];
		int num = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of element");
		num = sc.nextInt();
		System.out.println("Enter the array");
		for (i = 1; i <= num; i++) {
			a[i] = sc.nextInt();
		}
		int value = MaxSum(a);
		System.out.println("The maximum sub sum is:" + value);
	}
}