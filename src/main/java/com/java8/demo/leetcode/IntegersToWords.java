package com.java8.demo.leetcode;

public class IntegersToWords {

	private final static String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final static String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final static String[] THOUSANDS = {"", "Thousand", "Lakhs", "Crore"};
    
	public static void main(String[] args) {
		String num=numberToWords(12345);
		System.out.println("IntegersToWord " + num);

	}

		public static String numberToWords(int num) {
	        //return zero
	        if(num==0) return "Zero";
	        //get every words
	        int i = 0;
	        String words = "";
	    
	        while (num > 0) {
	            if (num % 1000 != 0)
	        	    words = helper(num % 1000) +THOUSANDS[i] + " " + words;
	        	num /= 1000;
	        	i++;
	        }
	        
	        return words.trim();
	    }
	    //use a helper to divide down number 
	    private static String helper(int num) {
	    	if (num == 0)
	    	    return "";
	    	else if (num < 20)
	    		return LESS_THAN_20[num] + " ";
	    	else if (num < 100)
	    		return TENS[num / 10] + " " + helper(num % 10);
	    	else
	    		return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
	    }

}
