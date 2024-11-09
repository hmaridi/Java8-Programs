package com.java8.demo.leetcode;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		int sum=maxSubArray(nums);
		System.out.println("Largest Sum -" + sum);
	}

	private static int maxSubArray(int[] nums) {
		 int[] dp = new int[nums.length];
	        
	        dp[0] = nums[0];
	        
	        int max = dp[0];
	        
	        for(int i = 1; i < nums.length; i++) {
	            
	            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
	            
	            max = Math.max(dp[i], max);
	            
	        }
	        
	        return max;
	        
	    }
}
