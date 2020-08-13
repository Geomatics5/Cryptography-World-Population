package com.bern;
/*This programme predicts the what the world population will be
 in the next 75 years at 1.0% growth rate per annum.
*/
public class WorldPopulation {

	public static void main(String[] args) {
		double worldPopulation = 7800000000.0;
		int presentYear = 2020;
		int count = 0;
		double currentIncrease = 0;
		double currentPopulation = worldPopulation;
		System.out.printf("%s%18s%18s%23s%n", "S/N", "Years", "World_Population", "Current_Increase");

		for(int i = 2020; i<= 2095; i++) {
			count++;
			System.out.printf("%2d%20d%20.2f%20.2f%n", count, presentYear, currentPopulation, currentIncrease);
			currentIncrease = currentPopulation * 0.01;
			currentPopulation += currentIncrease;
			presentYear++;
			
		}
	
		
	}
	
	
}
