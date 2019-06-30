package com.spring.spring_getting_started_4;

public class Bus implements Vehicle{

	private VehicleServicing vehicleServicing;
	
	public Bus(){
		
	}
	
	public void setVehicleServicing(VehicleServicing vehicleServicing) {
		this.vehicleServicing = vehicleServicing;
	}

	@Override
	public String getTotalDistanceTravelled() {
		
		return "Total distance travelled by bus is 20k km";
	}

	@Override
	public String getService() {	
		return "your bus : "+ vehicleServicing.getVehicleForServicing();
	}

}
