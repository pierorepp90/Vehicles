package com.vehicles.project;
import java.util.*;

public class MainF2 {

	public static void main(String[] args) {
		// FASE 2
		Scanner dataCollector = new Scanner(System.in);

		List<Car> cars = new ArrayList<Car>();
		
		String carPlate = Vehicle.plateVerifier(dataCollector);
	    System.out.println("Enter your car brand: ");
	    String carBrand = dataCollector.nextLine();
	    System.out.println("Enter your car color: ");
	    String carColor = dataCollector.nextLine();
	    
	    Car clientCar = new Car(carPlate, carBrand, carColor);
	    cars.add(clientCar);

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