package com.java8.demo.INTERVIEWSTRING;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumsLogic {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 1, 10, 4 };
		int target = 14;

		TwoSumsLogic twoSumX = new TwoSumsLogic();
		System.out.println(Arrays.toString(twoSumX.addTwoSum(nums, target)));
	}

	public int[] addTwoSum(int[] nums, int target) {
		Map<Integer, Integer> complements = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]);
			if (complementIndex != null) {
				return new int[] { complementIndex , i};
			}
			complements.put(target - nums[i], i);
		}
		return nums;
	}
}
