package com.java8.demo.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 8 };
		int[] nums2 = new int[] { 5, 7, 10, 11 };
		double median = findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}
		Collections.sort(list);
		int n = list.size();

		if (n % 2 == 1) {
			return (double) list.get(n / 2);
		} else {
			return (double) (list.get((n / 2) - 1) + list.get(n / 2)) / 2;
		}

	}
}
