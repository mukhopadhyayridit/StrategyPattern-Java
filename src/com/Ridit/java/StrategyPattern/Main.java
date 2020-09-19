package com.Ridit.java.StrategyPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JourneyToTheAirport journeyToTheAirport = null;
		Scanner in = new Scanner(System.in);
		System.out.println("enter choice. choices are OLA/BUS/RAPIDO");
		String choice = in.nextLine();
		
		if(choice.equals("OLA")) {
			journeyToTheAirport = new ByOla();
		}
		
		if(choice.equals("BUS")) {
			journeyToTheAirport = new ByBus();
			
		}
		if(choice.equals("RAPIDO")) {
			journeyToTheAirport = new ByRapido();
		}
		
		journeyToTheAirport.goToTheAirport();
		

	}

}
