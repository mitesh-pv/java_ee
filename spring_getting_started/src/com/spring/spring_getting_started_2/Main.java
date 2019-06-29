package com.spring.spring_getting_started_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// simple method of object creation		
		Vehicle vehicleOne =new Bike();
		System.out.println(vehicleOne.getTotalDistanceTravelled());
		
		
		// bean factory method of object creation
	 	ClassPathXmlApplicationContext vehicleContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	 	Vehicle vehicleTwo=vehicleContext.getBean("vehicle", Vehicle.class);
	 	
	 	System.out.println(vehicleTwo.getTotalDistanceTravelled());
		
	 	vehicleContext.close();
	}
}
