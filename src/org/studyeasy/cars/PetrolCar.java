package org.studyeasy.cars;

public class PetrolCar {
	public void run() {
		System.out.println("Petrol car is running on the road.");
	}
	
	public void run(int speed) {
		System.out.println("Petrol car is runnnig at speed "+speed+" km/hr");
	}
	
	public void run(int speed, int hour) {
		System.out.println("Petrol car is runnnig at speed "+speed+" km/hr, for "+hour+" hours" );
	}
	
	public String run(String sexy) {
		System.out.println("Petrol car is "+sexy);
		return "GOA";
	}
	
}
