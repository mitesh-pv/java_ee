package com.spring.spring_getting_started_4;


public class Car implements Vehicle{

	private VehicleServicing vehicleServicing;
	
	public Car(VehicleServicing vehicleServicing) {
		this.vehicleServicing=vehicleServicing;
	}
	
	
	@Override
	public String getTotalDistanceTravelled() {
		return "Total distance travelled is 70km";
	}

	@Override
	public String getService() {
		 return vehicleServicing.getVehicleForServicing();
	}

}
