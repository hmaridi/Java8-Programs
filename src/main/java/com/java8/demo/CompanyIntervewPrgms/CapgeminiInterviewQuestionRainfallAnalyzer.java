package com.java8.demo.CompanyIntervewPrgms;

import java.util.HashMap;
import java.util.Map;

//find the total highest rainfall in the 3 cities and 3 months in cms count and also individual  highest month and city  by using java
public class CapgeminiInterviewQuestionRainfallAnalyzer {

	public static void main(String[] args) {
		Map<String, Map<String, Integer>> rainfallData = new HashMap();
		rainfallData.put("Bangalore", Map.of("January", 10, "February", 15, "March", 20));
		rainfallData.put("Hyderabad", Map.of("January", 12, "February", 18, "March", 22));
		rainfallData.put("Chennai", Map.of("January", 8, "February", 20, "March", 25));

		int totalHighestRainfall = 0;
		String highestCity = "";
		String highestMonth = "";
		int highestRainfall = Integer.MIN_VALUE;

		for (Map.Entry<String, Map<String, Integer>> cityEntry : rainfallData.entrySet()) {
			String city = cityEntry.getKey();
			Map<String, Integer> monthlyRainfall = cityEntry.getValue();

			for (Map.Entry<String, Integer> monthEntry : monthlyRainfall.entrySet()) {
				String month = monthEntry.getKey();
				int rainfall = monthEntry.getValue();

				// Calculate total highest rainfall
				totalHighestRainfall += rainfall;

				// Check for individual highest rainfall
				if (rainfall > highestRainfall) {
					highestRainfall = rainfall;
					highestCity = city;
					highestMonth = month;
				}
			}
		}

		System.out.println("Total Highest Rainfall (in cms): " + totalHighestRainfall);
		System.out.println("Individual Highest Rainfall:");
		System.out.println("City: " + highestCity);
		System.out.println("Month: " + highestMonth);
		System.out.println("Rainfall: " + highestRainfall + " cms");
	}
}
