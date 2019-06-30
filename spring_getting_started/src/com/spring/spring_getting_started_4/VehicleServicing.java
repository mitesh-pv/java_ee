package com.spring.spring_getting_started_4;

public class VehicleServicing implements Servicing{

	@Override
	public String getVehicleForServicing() {
		return "Your vehicle has been serviced";
	}
	
}
