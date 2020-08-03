package com.vehicles.project;

import java.util.Scanner;

public class Wheel {
	private String brand;
	private double diameter;

	public double getDiameter() {
		return diameter;
	}

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	public static double diameterVerifier(Scanner dataCollector) {
		double wheelDiameter;
		boolean diameterOk;
		do{
	    	diameterOk = false;
	    	wheelDiameter = Double.parseDouble(dataCollector.nextLine());
	    	if(wheelDiameter > 0.4 && wheelDiameter < 4 ) {
	    		diameterOk = true;
	    	}else {
	    		 System.out.println("You have to enter a value between 0.4 and 4.Insert a new value:");
	    	}	    		
	    }while(!diameterOk);
		return wheelDiameter;
	}
}
