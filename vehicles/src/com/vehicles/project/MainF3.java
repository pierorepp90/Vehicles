package com.vehicles.project;
import java.util.*;

public class MainF3 {

	public static void main(String[] args) {
		// FASE 3
		List<Car> cars = new ArrayList<Car>();
		List<Bike> bikes = new ArrayList<Bike>();
		
		Scanner dataCollector = new Scanner(System.in);
		String bikeOrCar;
		do {
		    System.out.println("Create bike/car:");
		    bikeOrCar = dataCollector.nextLine();
		}while(!bikeOrCar.equalsIgnoreCase("bike") && !bikeOrCar.equalsIgnoreCase("car"));
		
		if(bikeOrCar.equalsIgnoreCase("car")) {
		Car clientCar = Car.createCar(dataCollector, cars);
	    Car.addWheelsToCar(dataCollector, clientCar);
		}else if(bikeOrCar.equalsIgnoreCase("bike")){
			
		Bike clientBike = Bike.createBike(dataCollector, bikes);
		clientBike.addWheelsToBike(dataCollector, clientBike);

		}
	}




}