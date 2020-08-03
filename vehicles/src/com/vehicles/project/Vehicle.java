package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	public static String plateVerifier(Scanner dataCollector) {
		String plate;
		int letters;
		int numbers;
		int invalidDigits;
		do {
			letters = 0;
			numbers = 0;
			invalidDigits = 0;
		    System.out.println("Enter your plate: ");
		    plate = dataCollector.nextLine();
		    for(int i=0; i < plate.length(); i++) {
		    	if(Character.isLetter(plate.charAt(i))) {
		    		letters += 1; 
		    	} else if(Character.isDigit(plate.charAt(i))) {
		    		numbers += 1;
		    	} else {
		    		invalidDigits += 1;		
		    	}
		    }
		    if(invalidDigits > 0) {
		    	 System.out.println("You entered invalid digits,please try again(2/3 letters and 4 numbers)");
		    }
		    
		}while(!(letters == 3 || letters == 2) || numbers != 4);
		return plate;
	}
}
