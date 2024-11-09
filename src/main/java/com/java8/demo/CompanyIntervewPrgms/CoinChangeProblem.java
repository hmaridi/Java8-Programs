package com.java8.demo.CompanyIntervewPrgms;

public class CoinChangeProblem {

	public static void main(String[] args) {
		int[] coins = { 2, 4, 6, 8 };
		int amount = 10;
		System.out.println("Number of ways to make change: " + countWays(coins, amount));

	}

	private static int countWays(int[] coins, int amount) {

		if (amount == 0) {
			return 0;
		}
		if (amount < 0) {
			return Integer.MAX_VALUE;
		}

		int coin = Integer.MAX_VALUE;

		for (int i : coins) {
			int result = countWays(coins, amount - i);
			if (result != Integer.MAX_VALUE) {
				coin = Integer.min(coin, result + 1);
			}
		}
		return coin;
	}
}
