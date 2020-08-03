package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	
	public static Car createCar(Scanner dataCollector, List<Car> cars) {
		String carPlate = Vehicle.plateVerifier(dataCollector);
	    System.out.println("Enter your car brand: ");
	    String carBrand = dataCollector.nextLine();
	    System.out.println("Enter your car color: ");
	    String carColor = dataCollector.nextLine();
	    
	    Car clientCar = new Car(carPlate, carBrand, carColor);
	    cars.add(clientCar);
	    return clientCar;
	}
	
	

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2) {
			throw new Exception();
		}
		

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!(rightWheel.getDiameter() == leftWheel.getDiameter())) {
			throw new Exception();
		}else {
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
		}
	}
	public static void addWheelsToCar(Scanner dataCollector, Car clientCar) {
		System.out.println("Enter your  back wheel brand: ");
	    String bWheelBrand = dataCollector.nextLine();
	    System.out.println("Enter your back wheel diameter: ");
	    double bWheelDiameter = Wheel.diameterVerifier(dataCollector);
	    
	    Wheel backRWheel = new Wheel(bWheelBrand,bWheelDiameter);
	    Wheel backLWheel = new Wheel(bWheelBrand,bWheelDiameter);
	    
	    List<Wheel> backWheels = new ArrayList<Wheel>();
	    
	    backWheels.add(backRWheel);
	    backWheels.add(backLWheel);
	    	   
	    System.out.println("Enter your  front wheel brand: ");
	    String fWheelBrand = dataCollector.nextLine();	    
	    System.out.println("Enter your front wheel diameter: ");
	    double fWheelDiameter = Wheel.diameterVerifier(dataCollector);
	    	    	    
	    List<Wheel> frontWheels = new ArrayList<Wheel>();
	    
	    Wheel frontRWheel = new Wheel(fWheelBrand,fWheelDiameter);
	    Wheel frontLWheel = new Wheel(fWheelBrand,fWheelDiameter);
	    
	    frontWheels.add(frontRWheel);
	    frontWheels.add(frontLWheel);
	    
	    dataCollector.close();
	    
	    try {
			clientCar.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
