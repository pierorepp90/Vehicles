package com.vehicles.project;

import java.util.List;
import java.util.Scanner;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	public static Bike createBike(Scanner dataCollector, List<Bike> bikes) {
		String bikePlate = Vehicle.plateVerifier(dataCollector);
	    System.out.println("Enter your bike brand: ");
	    String bikeBrand = dataCollector.nextLine();
	    System.out.println("Enter your bike color: ");
	    String bikeColor = dataCollector.nextLine();
	    
	    Bike clientBike = new Bike(bikePlate, bikeBrand, bikeColor);
	    bikes.add(clientBike);
	    return clientBike;
	}
	public void addWheelsToBike(Scanner dataCollector, Bike clientBike) {
		System.out.println("Enter your  back wheel brand: ");
	    String bWheelBrand = dataCollector.nextLine();
	    System.out.println("Enter your back wheel diameter: ");
	    double bWheelDiameter = Wheel.diameterVerifier(dataCollector);
	    
	    Wheel backWheel = new Wheel(bWheelBrand,bWheelDiameter);
	    	   
	    System.out.println("Enter your  front wheel brand: ");
	    String fWheelBrand = dataCollector.nextLine();	    
	    System.out.println("Enter your front wheel diameter: ");
	    double fWheelDiameter = Wheel.diameterVerifier(dataCollector);

	    
	    Wheel frontWheel = new Wheel(fWheelBrand,fWheelDiameter);
		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	    
	    dataCollector.close();
	}

}
